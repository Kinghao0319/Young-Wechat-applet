package com.yhh.mapper;


import com.yhh.pojo.Display3;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface Display3Mapper {
    @Select("select * from display3")
    List<Display3> showAllDisplay3();

    @Select("select * from display3 where id = #{id}")
    Display3 selectDisplay3ById(int id);

    @Options(useGeneratedKeys = true, keyProperty = "id")
    @Insert("insert into display3 (id,name,icon) values(#{id},#{name},#{icon})")
    int insertDisplay3(Display3 display3);

    @Update("update display3 set name=#{name},icon=#{icon} where id=#{id}")
    int updateDisplay3(Display3 display3);

    @Delete("delete from display3 where id=#{id}")
    int deleteDisplay3(int id);
}

