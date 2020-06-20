package com.yhh.mapper;


import com.yhh.pojo.Display2;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface Display2Mapper {
    @Select("select * from display2")
    List<Display2> showAllDisplay2();

    @Select("select * from display2 where id = #{id}")
    Display2 selectDisplay2ById(int id);

    @Options(useGeneratedKeys = true, keyProperty = "id")
    @Insert("insert into display2 (id,name,icon) values(#{id},#{name},#{icon})")
    int insertDisplay2(Display2 display2);

    @Update("update display2 set name=#{name},icon=#{icon} where id=#{id}")
    int updateDisplay2(Display2 display2);

    @Delete("delete from display2 where id=#{id}")
    int deleteDisplay2(int id);
}

