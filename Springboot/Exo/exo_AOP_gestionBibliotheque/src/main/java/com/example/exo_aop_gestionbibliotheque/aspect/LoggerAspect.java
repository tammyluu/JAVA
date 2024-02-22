package com.example.exo_aop_gestionbibliotheque.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Aspect
@Component
public class LoggerAspect {
    public final Logger logger = LoggerFactory.getLogger(LoggerAspect.class);

    @Before("execution(* com.example.exo_aop_gestionbibliotheque.service.BookService.*(..))")
    public void logMethodEntry(JoinPoint joinPoint) {
        String methodName = joinPoint.getSignature().getName();
        Object[] args = joinPoint.getArgs();
        logger.info("Entry method: {} with arguments: {}", methodName, args);
    }

    @AfterReturning(pointcut = "execution(* com.example.exo_aop_gestionbibliotheque.service.BookService.*(..))", returning = "result")
    public void logMethodExit(JoinPoint joinPoint, Object result) {
        String methodName = joinPoint.getSignature().getName();
        logger.info("Exiting method: {} with result: {}", methodName, result);
    }
}
