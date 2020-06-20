package com.yhh.controller;

import com.yhh.mapper.Display3Mapper;
import com.yhh.pojo.Display3;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Display3Controller {
    @Autowired
    Display3Mapper display3Mapper;


    @RequestMapping("/showAllDisplay3")
    List<Display3> showAllDisplay3(){
        return display3Mapper.showAllDisplay3();
    }

    @RequestMapping("/showDisplay3/{id}")
    Display3 showDisplay3(@PathVariable("id")int id){
        return display3Mapper.selectDisplay3ById(id);
    }

    @RequestMapping("/insertDisplay3")
    Display3 insertDisplay3(Display3 display3){
        display3Mapper.insertDisplay3(display3);
        return display3;
    }

    @RequestMapping("/updateDisplay3/{id}")
    Display3 updateDisplay3(@PathVariable("id")int id,Display3 display3){
        display3Mapper.updateDisplay3(display3);
        return display3Mapper.selectDisplay3ById(id);
    }

    @RequestMapping("/deleteDisplay3/{id}")
    String deleteDisplay3(@PathVariable("id") int id){
        if(display3Mapper.selectDisplay3ById(id)==null){
            return "not found";
        }
        display3Mapper.deleteDisplay3(id);
        return "success";
    }
}

