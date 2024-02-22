package com.example.exo_aop_gestionbibliotheque.aspect;

import com.example.exo_aop_gestionbibliotheque.aspect.LoggerAspect;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class PerformanceAspect {
    public final Logger logger = LoggerFactory.getLogger(LoggerAspect.class);

    @Around("execution(* com.example.exo_aop_gestionbibliotheque.service.BookService.*(..)) || " +
            "execution(* com.example.exo_aop_gestionbibliotheque.controller.BookController.*(..))")
    public Object measureExecutionTime(ProceedingJoinPoint joinPoint) throws Throwable {
        long startTime = System.currentTimeMillis();
        Object result = null;
        try {
            //execute
            result = joinPoint.proceed();
        } catch (Throwable throwable) {
            logger.error("An error occurred during method execution: {}", throwable.getMessage());
            throw throwable;
        } finally {
            long endTime = System.currentTimeMillis();
            String methodName = joinPoint.getSignature().getName();
            logger.info("Method {} execution time: {} ms", methodName, endTime - startTime);
        }
        return result;
    }
}
