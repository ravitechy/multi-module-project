package org.example.commons.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import javax.annotation.PostConstruct;

@Aspect
public class BasicCommonAspect {

    @Before("@annotation(bca) && execution(* *(..))")
    public void executeBeforeForCommonAnnotation(JoinPoint joinPoint, BasicCommonAnnotation bca) {
        System.out.println("BasicCommonAnnotation detected");
    }
}
