package com.zakharuk.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by matvii on 21.02.17.
 */
public class Tester {

    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("beans.xml");

        Student student = (Student) context.getBean("Bob");
        SampleService sampleService = (SampleService) context.getBean("Service");


        student.getName();
    }
}
