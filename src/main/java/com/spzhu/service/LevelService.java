package com.spzhu.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.spzhu.entity.LevelEntity;
import com.spzhu.entity.ResponseCode;
import com.spzhu.entity.ServiceResultEntity;
import com.spzhu.entity.UserEntity;
import com.spzhu.mapper.LevelMapper;
import com.spzhu.mapper.UserMapper;
import com.spzhu.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class LevelService {

    @Resource
    private LevelMapper levelMapper;

    final static Logger logger = LoggerFactory.getLogger(LevelService.class);

    public String addLevel(LevelEntity levelEntity) {
        int count = levelMapper.insert(levelEntity);
        if (count <= 0) {
            return "addLevel failed\n";
        }

        return "addLevel successful\n";
    }

    public ServiceResultEntity listSettlementData(LevelEntity levelEntity) {
        String responseData = "";

        PageHelper.startPage(1, 10);
        List<LevelEntity> levelEntityList = levelMapper.queryAll(levelEntity);
        PageInfo<LevelEntity> data = new PageInfo<>(levelEntityList);
        if (levelEntityList != null && levelEntityList.size() > 0) {
            for (LevelEntity user : levelEntityList) {
                logger.info(user.toString());
                responseData += user;
            }
        } else {
            return ServiceResultEntity.ofFail(ResponseCode.BAD_DATA, "No user info");
        }

        return ServiceResultEntity.ofSuccess(data);

    }

    public static void main(String[] args) {
        LevelEntity levelEntity = new LevelEntity();
        levelEntity.setPointName("X9");
        levelEntity.setTime("2021.04.19");
        levelEntity.setSettlingValue("719");
        LevelService levelService = new LevelService();
        String ret = levelService.addLevel(levelEntity);
        System.out.println(ret);
    }
}
