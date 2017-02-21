package com.zakharuk.aop;

/**
 * Created by matvii on 21.02.17.
 */
public class Student {

    private String name;

    public Student(String name) {
        this.name = name;
    }

    public Student(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
