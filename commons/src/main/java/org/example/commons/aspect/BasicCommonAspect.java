package org.example.commons.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import javax.annotation.PostConstruct;

@Aspect
@EnableAspectJAutoProxy
public class BasicCommonAspect {

    protected void testInvocation() {
        System.out.println("BasicCommonAspect invoked");
    }

    @Before("@annotation(bca) && execution(* *(..))")
    public void executeBeforeForCommonAnnotation(JoinPoint joinPoint, BasicCommonAnnotation bca) {
        System.out.println("BasicCommonAnnotation detected");
    }
}
