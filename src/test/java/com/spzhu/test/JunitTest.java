package com.spzhu.test;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageInfo;
import com.spzhu.entity.ServiceResultEntity;
import com.spzhu.entity.UserEntity;
import com.spzhu.service.Foo;
import com.spzhu.service.UserService;
import org.apache.catalina.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SpringBootTest
@TestPropertySource(locations="classpath:test.properties")
public class JunitTest {

    @Autowired
    private UserService userService;

    @BeforeEach
    public void setUp() {
    }

    @Test
    public void testFoo() {
        System.out.println("testFoo begin ...");
        Foo foo = new Foo();
        foo.fooInit();
        System.out.println("testFoo end ...");

    }

    @Test
    public void insertUser() {
        UserEntity userEntity = new UserEntity();
        userEntity.setId("77");
        userEntity.setName("Qiu");

        List<UserEntity> userList = new ArrayList<>();
        userList.add(userEntity);

        userEntity = new UserEntity();
        userEntity.setId("33");
        userEntity.setName("Pippen");
        userList.add(userEntity);


        userService.addUser(userEntity);

        userEntity.setName(null);
        ServiceResultEntity outUser = userService.listUsers(userEntity);
        PageInfo<UserEntity> param = (PageInfo<UserEntity>) outUser.getResult();
        List<UserEntity> l = param.getList();
        assert(l.size() == 1);
        assert(outUser.isSuccess());

        assert(true);

    }

    @Test
    public void testJsonAndString() {
            String str = "{\"age\":\"24\",\"name\":\"cool_summer_moon\"}";
            JSONObject jsonObject = JSONObject.parseObject(str);
            System.out.println("json对象是：" + jsonObject);
            Object object = jsonObject.get("name");
            System.out.println("name值是："+object);

    }


    @Test
    public void test(){
        String str = "{\"age\":\"24\",\"name\":\"cool_summer_moon\"}";
        JSONObject  jsonObject = JSONObject.parseObject(str);
        //json对象转字符串
        String jsonString = jsonObject.toJSONString();
        System.out.println("json字符串是：" + jsonString);
    }

    @Test
    public void testToMap(){
        String str = "{\"age\":\"24\",\"name\":\"cool_summer_moon\"}";
        JSONObject  jsonObject = JSONObject.parseObject(str);
        //json对象转Map
        Map<String,Object> map = (Map<String,Object>)jsonObject;
        System.out.println("map对象是：" + map);
        Object object = map.get("age");
        System.out.println("age的值是"+object);
    }

    @Test
    public void testMapToString(){
        Map<String,Object> map = new HashMap<>();
        map.put("age", 24);
        map.put("name", "cool_summer_moon");
        String jsonString = JSON.toJSONString(map);
        System.out.println("json字符串是："+jsonString);


        try {
            Class<?> actionServiceClass = Class.forName(JunitTest.class.getName());
            System.out.printf("actionServiceClass: " + actionServiceClass);

            Object paramReq = actionServiceClass.newInstance();
            Field[] fields = paramReq.getClass().getDeclaredFields();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }



}
