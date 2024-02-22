package com.example.exo_aop_gestionbibliotheque.aspect;

import com.example.exo_aop_gestionbibliotheque.aspect.LoggerAspect;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class PerformanceAspect {
    public final Logger logger = LoggerFactory.getLogger(LoggerAspect.class);
    @Pointcut("@annotation(com.example.exo_aop_gestionbibliotheque.annotation.Performance)")
    public void logPointCut() {

    }

    @Around("logPointCut()")
    public Object performanceAspect(ProceedingJoinPoint joinPoint) throws Throwable {
        logger.warn("Start Method");
        logger.warn("Method name : " + joinPoint.getSignature().getName());
        logger.warn("Method name : " + joinPoint.getArgs());
        Object object = joinPoint.proceed();
        logger.warn("End Method");

        return object;
    }

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
