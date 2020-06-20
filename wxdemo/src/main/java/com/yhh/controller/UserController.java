package com.yhh.controller;

import com.yhh.mapper.UserMapper;
import com.yhh.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserMapper userMapper;

    @RequestMapping("/showUserList")
    public List<User> showUserList(){
        List<User> userList= userMapper.showUserList();
        return userList;
    }

    @RequestMapping("/showUserList/{wxid}")
    public User selectUserByWxid(@PathVariable("wxid") String wxid){
        return userMapper.selectUserByWxid(wxid);
    }

    @RequestMapping("/addUser")
    public User addUser(User user){
        userMapper.addUser(user);
        return user;
    }

    @RequestMapping("/updateUser/{wxid}")
    public User updateUser(@PathVariable("wxid") String wxid,User user){
        userMapper.updateUser(user);
        return userMapper.selectUserByWxid(wxid);
    }

    @RequestMapping("deleteUser/{wxid}")
    public String deleteUser(@PathVariable("wxid") String wxid){
        if(userMapper.selectUserByWxid(wxid)==null){
            return "user not found";
        }
        userMapper.deleteUser(wxid);
        return "success";
    }

}
