package com.fc.entity;

public class Student {
    private Integer id;
    private String name;
    private Byte age;
    public void text(){
        System.out.println("无参构造被执行");
    }
    public void eat(){
        System.out.println("今天吃什么");
    }
    public void sleep(){
        System.out.println("今天几点睡觉");
    }

}
