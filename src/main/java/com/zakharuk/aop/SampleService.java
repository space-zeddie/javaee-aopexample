package com.zakharuk.aop;

import org.aspectj.lang.annotation.*;

/**
 * Created by matvii on 21.02.17.
 */
@Aspect
public class SampleService {

    @Pointcut("execution(* com.zakharuk.aop.Student.getName(..))")
    public void getname() {
        System.out.println("service getname works");
    }

    @Before("getname()")
    public void beforeGetname() {
        System.out.println("before getname service");
    }

    @After("getname()")
    public void afterGetname() {
        System.out.println("after getname service");
    }

    @Around("getname()")
    public void aroundGetname() {
        System.out.println("around getname service");
    }

    public void afterReturningGetName() {
        System.out.println("after returning getname");
    }
}
