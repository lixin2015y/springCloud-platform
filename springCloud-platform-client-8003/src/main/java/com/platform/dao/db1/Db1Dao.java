package com.platform.dao.db1;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface Db1Dao {

    @Select("select `desc` from test")
    List<String> test();

}
