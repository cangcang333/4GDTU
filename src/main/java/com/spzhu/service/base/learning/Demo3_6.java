package com.spzhu.service.base.learning;

import com.spzhu.entity.base.learning.Student;

public class Demo3_6 {
    public static void main(String[] args) {
        Student stu = new Student(1, 1);
        fb(stu);

        System.out.println(stu.age);

        Student stu3 = new Student(3, 33);
        Student stu4 = new Student(4, 44);
        stu3 = stu4;
    }

    private static void fb(Student vstu) {
        vstu = new Student(2, 2);
    }
}
