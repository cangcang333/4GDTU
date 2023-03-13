package com.spzhu.service.base.learning;

import com.spzhu.entity.base.learning.Student;

public class Demo3_7 {
    public static void main(String[] args) {
        int a = 123;
        int b = 123;
        System.out.println("a==b: " + (a==b));

        Student stu1 = new Student(1, 2);
        Student stu2 = new Student(1, 2);
        Student stu3 = stu1;
        System.out.println("stu1==stu2: " + (stu1==stu2));
        System.out.println("stu1==stu3: " + (stu1==stu3));

        Object obj1 = new Object();
        Object obj2 = new Object();
        obj1.equals(obj2);

        System.out.println("Integer String equals() test ...");
        Integer ia = new Integer(2314);
        Integer ib = new Integer(2314);
        System.out.println(ia==ib);
        System.out.println(ia.equals(ib));

        String sa = new String("abc");
        String sb = new String("abc");
        System.out.println(sa==sb);
        System.out.println(sa.equals(sb));

        Student stu8 = new Student(1, 2);
        Student stu9 = new Student(1, 2);
        System.out.println(stu8==stu9);
        System.out.println(stu8.equals(stu9));

    }

}
