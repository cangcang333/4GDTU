package com.spzhu.service.base.learning;

import com.alibaba.fastjson.JSONObject;
import com.spzhu.entity.base.learning.Node;

public class Demo3_9 {
    public static void traverse(Node head) {
        Node p = head;
        while (p != null) {
            System.out.println(p.data);
            p = p.next;
        }
    }

    public static void delete(Node p) {
        p.next = p.next.next;
    }

    public static void main(String[] args) {
        Node p3 = new Node(3, null);
        Node p2 = new Node(2, p3);
        Node p1 = new Node(1, p2);
        System.out.println(JSONObject.toJSONString(p1));
        System.out.println(JSONObject.toJSONString(p2));
        System.out.println(JSONObject.toJSONString(p3));

        traverse(p1);
        delete(p1);
        traverse(p1);
    }
}
