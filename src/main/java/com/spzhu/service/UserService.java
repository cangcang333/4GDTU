package com.spzhu.service;

import com.spzhu.entity.UserEntity;
import com.spzhu.mapper.UserMapper;
import com.spzhu.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    public String addUser(UserEntity userEntity) {
        SqlSession sqlSession = null;
        sqlSession = MybatisUtil.createSqlSession();

        int count = sqlSession.getMapper(UserMapper.class).insert(userEntity);
        if (count <= 0) {
            return "addUser failed\n";
        }

        return "addUser successful\n";
    }
}
