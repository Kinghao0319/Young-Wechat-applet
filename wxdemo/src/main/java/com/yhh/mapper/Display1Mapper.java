package com.yhh.mapper;


import com.yhh.pojo.Display1;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface Display1Mapper {
    @Select("select * from display1")
    List<Display1> showAllDisplay1();

    @Select("select * from display1 where id = #{id}")
    Display1 selectDisplay1ById(int id);

    @Options(useGeneratedKeys = true, keyProperty = "id")
    @Insert("insert into display1 (id,name,icon) values(#{id},#{name},#{icon})")
    int insertDisplay1(Display1 display1);

    @Update("update display1 set name=#{name},icon=#{icon} where id=#{id}")
    int updateDisplay1(Display1 display1);

    @Delete("delete from display1 where id=#{id}")
    int deleteDisplay1(int id);
}
