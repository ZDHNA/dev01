package com.fc.entity;

public class Student {
    private Integer id;
    private String name;
    private Byte age;

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public byte getAge() {
        return age;
    }
}