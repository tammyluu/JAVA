package com.example.exo_aop_gestionbibliotheque.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Aspect
@Component
public class LoggerAspect {
    public final Logger logger = LoggerFactory.getLogger(LoggerAspect.class);

    @Pointcut("@annotation(com.example.exo_aop_gestionbibliotheque.annotation.Log)")
    public void logPointCut() {

    }

    @Around("logPointCut()")
    public Object logAspect(ProceedingJoinPoint joinPoint) throws Throwable {
        logger.warn("Start Method");
        logger.warn("Method name : " + joinPoint.getSignature().getName());
        logger.warn("Method name : " + joinPoint.getArgs());
        Object object = joinPoint.proceed();
        logger.warn("End Method");

        return object;
    }
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
