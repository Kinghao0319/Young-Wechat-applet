package com.yhh.mapper;

import com.yhh.pojo.Activity;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface ActivityMapper {
    //显示所有活动
    @Select("select * from activity")
    List<Activity> showActivityList();

    //根据id查单个活动
    @Select("select * from activity where id = #{id}")
    public Activity selectActivityById(int id);

    //新发布活动
    @Options(useGeneratedKeys = true, keyProperty = "id")
    @Insert("insert into activity (id,name,place,time,maxnum,description,imgpath) values (#{id},#{name},#{place},#{time},#{maxnum},#{description},#{imgpath})")
    int addActivity(Activity activity);

    //更新活动信息，图片不能改
    @Update("update activity set name=#{name},place=#{place},time=#{time},description=#{description} where id = #{id}")
    int updateActivity(Activity activity);

    //删除活动
    @Delete("delete from activity where id=#{id}")
    int deleteActivity(int id);
}
