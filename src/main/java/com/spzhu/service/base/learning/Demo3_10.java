package com.spzhu.service.base.learning;

import com.alibaba.fastjson.JSONObject;
import com.spzhu.entity.base.learning.Node;

public class Demo3_10 {
    public static void main(String[] args) {
        //Integer a = 10;
        int a = 10;
        f(a);
        System.out.println(a);
    }

    public static void f(Integer va) {
        va = 3;
    }
}
