package com.platform.dao.db2;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface Db2Dao {

    @Select("select `desc` from test")
    List<String> test();

}
