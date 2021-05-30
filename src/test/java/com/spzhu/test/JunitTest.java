package com.spzhu.test;

import com.github.pagehelper.PageInfo;
import com.spzhu.entity.ServiceResultEntity;
import com.spzhu.entity.UserEntity;
import com.spzhu.service.UserService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;

import java.util.List;

@SpringBootTest
@TestPropertySource(locations="classpath:test.properties")
public class JunitTest {

    @Autowired
    private UserService userService;

    @BeforeEach
    public void setUp() {
    }

    @Test
    public void insertUser() {
        UserEntity userEntity = new UserEntity();
        userEntity.setId("77");
        userEntity.setName("Qiu");

        userService.addUser(userEntity);

        userEntity.setName(null);
        ServiceResultEntity outUser = userService.listUsers(userEntity);
        PageInfo<UserEntity> param = (PageInfo<UserEntity>) outUser.getResult();
        List<UserEntity> l = param.getList();
        assert(l.size() == 1);
        assert(outUser.isSuccess());

        assert(true);

    }
}
