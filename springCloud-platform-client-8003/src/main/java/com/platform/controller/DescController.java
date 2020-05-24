package com.platform.controller;

import com.platform.dao.db1.Db1Dao;
import com.platform.dao.db2.Db2Dao;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class DescController {

    @Resource
    Db1Dao db1Dao;

    @Resource
    Db2Dao db2Dao;

    @GetMapping("db1")
    List<String> getDb1Desc() {
        return db1Dao.test();
    }

    @GetMapping("db2")
    List<String> getDb2Desc() {
        return db2Dao.test();
    }
}
