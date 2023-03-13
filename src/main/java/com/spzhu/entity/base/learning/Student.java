package com.spzhu.entity.base.learning;

public class Student {
    public int id;
    public int age;
    public Group group;

    public Student(int id, int age) {
        this.id = id;
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        Student stu = (Student) obj;
        return this.id == stu.id;
    }
}
