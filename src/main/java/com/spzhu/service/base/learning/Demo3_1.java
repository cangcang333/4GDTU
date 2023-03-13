package com.spzhu.service.base.learning;

import com.spzhu.entity.base.learning.Student;

public class Demo3_1 {
    public static void main(String[] args) {
        int a = 12;
        int b = 255;
        //a = b;
        System.out.println(Integer.toBinaryString(a));
        System.out.println(Integer.toBinaryString(b));

        Student s1 = new Student(11, 12);
        Student s2 = new Student(22,23);
        System.out.println(s1);
        System.out.println(s2);

    }

}
