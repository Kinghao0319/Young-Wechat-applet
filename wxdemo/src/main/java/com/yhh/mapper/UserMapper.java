package com.yhh.mapper;

import com.yhh.pojo.User;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface UserMapper {
    //显示所有用户
    @Select("select * from user")
    public List<User> showUserList();
    //根据wxid查单个用户
    @Select("select * from user where wxid = #{wxid}")
    public User selectUserByWxid(String wxid);
    //新注册用户
    @Options(useGeneratedKeys = true, keyProperty = "id")
    @Insert("insert into user (id,wxid,name,gender,email,city) values (#{id},#{wxid},#{name},#{gender},#{email},#{city})")
    int addUser(User user);
    //更新用户信息
    @Update("update user set name=#{name},gender=#{gender},email=#{email},city=#{city} where wxid = #{wxid}")
    int updateUser(User user);
    //删除用户
    @Delete("delete from user where wxid=#{wxid}")
    public int deleteUser(String wxid);

}
