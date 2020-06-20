package com.yhh.mapper;

import com.yhh.pojo.Official;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface OfficialMapper {
    @Select("select * from official")
    List<Official> showAllOfficial();

    @Select("select * from official where id = #{id}")
    Official selectOfficialById(int id);

    @Options(useGeneratedKeys = true, keyProperty = "id")
    @Insert("insert into official (id,name,description,icon,hotnum) values(#{id},#{name},#{description},#{icon},#{hotnum})")
    int insertOfficial(Official official);

    @Update("update official set name=#{name},description=#{description},icon=#{icon},hotnum=#{hotnum} where id=#{id}")
    int updateOfficial(Official official);

    @Delete("delete from official where id=#{id}")
    int deleteOfficial(int id);
}
