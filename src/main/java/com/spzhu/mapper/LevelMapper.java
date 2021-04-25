package com.spzhu.mapper;

import com.spzhu.entity.LevelEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface LevelMapper {


    List<LevelEntity> queryAll( LevelEntity levelEntity);
    //List<LevelEntity> queryAll(@Param("time") String time, @Param("settling_value") String settlingValue);
    int insert(LevelEntity levelEntity);
}
