package com.spzhu.service.base.learning;

import com.alibaba.fastjson.JSONObject;
import com.spzhu.entity.base.learning.Group;
import com.spzhu.entity.base.learning.Student;

public class Demo3_3 {
    public static void main(String[] args) {
        Student stu = new Student(2, 5);
        stu.group = new Group(2, 3);
        System.out.println(stu);
        System.out.println(JSONObject.toJSONString(stu));

    }

}
