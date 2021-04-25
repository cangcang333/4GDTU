package com.spzhu.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.spzhu.controller.UserController;
import com.spzhu.entity.ResponseCode;
import com.spzhu.entity.ServiceResultEntity;
import com.spzhu.entity.UserEntity;
import com.spzhu.mapper.UserMapper;
import com.spzhu.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserService {

    @Resource
    private UserMapper userMapper;
    final static Logger logger = LoggerFactory.getLogger(UserService.class);

    public String addUser(UserEntity userEntity) {
        int count = userMapper.insert(userEntity);
        if (count <= 0) {
            return "addUser failed\n";
        }


        return "addUser successful\n";
    }

    public ServiceResultEntity listUsers(UserEntity userEntity) {
        String responseData = "";

        PageHelper.startPage(1, 10);
        List<UserEntity> userEntityList = userMapper.queryAll(userEntity);
        PageInfo<UserEntity> data = new PageInfo<>(userEntityList);
        if (userEntityList != null && userEntityList.size() > 0) {
            for (UserEntity user : userEntityList) {
                logger.info(user.toString());
                responseData += user;
            }
        } else {
            return ServiceResultEntity.ofFail(ResponseCode.BAD_DATA, "No user info");
        }

        return ServiceResultEntity.ofSuccess(data);

    }

    public static void main(String[] args) {
        UserEntity userEntity = new UserEntity();
        userEntity.setId("33");
        userEntity.setName("Pippen");
        UserService userService = new UserService();
        String ret = userService.addUser(userEntity);
        System.out.println(ret);
    }
}
