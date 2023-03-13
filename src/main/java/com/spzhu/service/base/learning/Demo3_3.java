package com.spzhu.service.base.learning;

import com.alibaba.fastjson.JSONObject;
import com.spzhu.entity.base.learning.Group;
import com.spzhu.entity.base.learning.Student;

public class Demo3_3 {
    public static void main(String[] args) {
        Student stu = new Student(2, 5);
        stu.group = new Group(2, 3);
        System.out.println(stu);
        System.out.println(stu.group);
        System.out.println(JSONObject.toJSONString(stu));

        int[] arr = new int[5];
        arr[0] = 3;

        Student[] arrObject = new Student[3];
        arrObject[0] = new Student(1, 1);
        arrObject[1] = new Student(2, 2);

        // JAVA二维数组第二维长度可以不同
        int[][] arrTwoDimension = new int[3][];
        arrTwoDimension[0] = new int[2];
        arrTwoDimension[2] = new int[4];

        Student[][] arrTwoDimensionObject = new Student[3][];
        arrTwoDimensionObject[0] = new Student[2];
        arrTwoDimensionObject[0][0] = new Student(2, 3);

        arrTwoDimensionObject[2] = new Student[3];
        arrTwoDimensionObject[2][1] = new Student(4, 4);
        arrTwoDimensionObject[2][2] = new Student(5, 5);


    }

}
