package com.spzhu.controller;

import com.spzhu.entity.LevelEntity;
import com.spzhu.entity.ServiceResultEntity;
import com.spzhu.mapper.LevelMapper;
import com.spzhu.service.LevelService;
import com.spzhu.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping(path="settlementData")
public class LevelController {

    @Resource
    private LevelService levelService;

    final static Logger logger = LoggerFactory.getLogger(LevelController.class);


    @PostMapping("/list")
    @ResponseBody
    public ServiceResultEntity settlementDataList(@RequestBody LevelEntity levelEntity) {
        return levelService.listSettlementData(levelEntity);
}
    @PostMapping("/add")
    @ResponseBody
    public String settlementDataAdd(@RequestBody LevelEntity levelEntity) {

        return levelService.addLevel(levelEntity);
    }


    @PostMapping("/empty")
    @ResponseBody
    public String emptyTest() {
        return "empty\n";
    }
}
