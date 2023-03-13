package com.spzhu.service.base.learning;

import com.spzhu.entity.base.learning.Student;

public class Demo3_5 {
    public static void main(String[] args) {
        int a = 1;
        fa(a);
        System.out.println(a);

        Student stu = new Student(1, 1);
        faa(stu);
        System.out.println(stu.age);

    }

    private static void fa(int va) {
        va = 2;
        System.out.println(va);
    }

    private static void faa(Student vstu) {
        vstu.age = 3;
    }
}
