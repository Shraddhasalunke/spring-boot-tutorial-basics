package com.in28minutes.springboot.tutorial.basics.example.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

//AOP
//Configuration
@Aspect
@Configuration
public class UserAccessAspect {

    private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    //What kind of method calls I would intercept
    //execution(* PACKAGE.*.*(..))
    //Weaving & Weaver
    @Before("execution(* com.in28minutes.springboot.tutorial.basics.example.aop.data.*.*(..))")
    public void before(JoinPoint joinPoint) {
        //Advice
        LOGGER.info(" Check for user access ");
        LOGGER.info(" Allowed execution for {}", joinPoint);
    }
}