package com.spzhu.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.mysql.cj.log.Log;
import com.mysql.cj.log.LogFactory;
import com.spzhu.entity.ServiceResultEntity;
import com.spzhu.entity.UserEntity;
import com.spzhu.mapper.UserMapper;
import com.spzhu.service.UserService;
import com.spzhu.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping(path="user")
public class UserController {

    @Resource
    private UserService userService;

    final static Logger logger = LoggerFactory.getLogger(UserController.class);


    @PostMapping("/list")
    @ResponseBody
    public ServiceResultEntity table1List(@RequestBody UserEntity userEntity) {
        String responseData = "";

        //return "list table1";
        //return userService.findByName(userEntity).toString();
        SqlSession sqlSession = null;
        sqlSession = MybatisUtil.createSqlSession();

        PageHelper.startPage(1, 10);
        List<UserEntity> userEntityList = sqlSession.getMapper(UserMapper.class).queryAll(userEntity);
        PageInfo<UserEntity> data = new PageInfo<>(userEntityList);
        if (userEntityList != null && userEntityList.size() > 0) {
            for (UserEntity user : userEntityList) {
                logger.info(user.toString());
                responseData += user;
            }
        }

        //return responseData;
        return ServiceResultEntity.ofSuccess(data);
    }

    @PostMapping("/add")
    @ResponseBody
    public String table1Add(@RequestBody UserEntity userEntity) {

        return userService.addUser(userEntity);
    }


    @PostMapping("/empty")
    @ResponseBody
    public String emptyTest() {
        return "empty\n";
    }
}
