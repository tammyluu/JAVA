package com.example.demo_aop.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class DemoAspect {
    // point cut
    //  "execution(* com.example.demo_aop.service.*.*(..))" la totalité des methodes des classe dans package service avec n'importe quel arguments
    /*@Before("execution(* com.example.demo_aop.service.*.*(..))")
    public void addActionBefore(){
        System.out.println("Action executed by aspect");
    }
    @After("execution(* com.example.demo_aop.service.*.*(..))")
    public void addActionAfter(){
        System.out.println("Action executed after by aspect");
    }
    @AfterReturning("execution(* com.example.demo_aop.service.*.*(..))")
    public void addActionReturning(){
        System.out.println("Action executed by aspect");
    }
    @AfterThrowing("execution(* com.example.demo_aop.service.*.*(..))")
    public void addActionAfterThrowing(){
        System.out.println("Action executed  @AfterThrowing by aspect");
    }*/
    @Around("execution(* com.example.demo_aop.service.*.*(..))")
    public void addActionAround(ProceedingJoinPoint joinPoint)  {
        try {
            //Avant
            System.out.println("Start Around");
            //Execute

            //Récupérer les argruments
            Object[] args = joinPoint.getArgs();
            // utliliser les args de la methode (pas local)
            joinPoint.proceed();
        }catch (Exception ex) {
            //Après
            System.out.println("End Around");
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }

    }
    @Pointcut("@annotation(com.example.demo_aop.annotation.CustomAnnotation)")
    public  void customAnnotationPointCut(){

    }

    @Before("customAnnotationPointCut()")
    public void methodAspectWithAnnotation(){
        System.out.println("Aspect run before methode with annotation");
    }

}
