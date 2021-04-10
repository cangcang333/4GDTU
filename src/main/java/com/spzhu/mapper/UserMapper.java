package com.spzhu.mapper;

import com.spzhu.entity.UserEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserMapper {

   /* @Select("SELECT * FROM USER WHERE name = #{name}")
    UserEntity findByName(@Param("name") String name);*/


    List<UserEntity> queryAll(UserEntity userEntity);
    int insert(UserEntity userEntity);

}
