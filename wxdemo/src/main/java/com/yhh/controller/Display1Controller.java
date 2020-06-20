package com.yhh.controller;

import com.yhh.mapper.Display1Mapper;
import com.yhh.pojo.Display1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Display1Controller {
    @Autowired
    Display1Mapper display1Mapper;


    @RequestMapping("/showAllDisplay1")
    List<Display1> showAllDisplay1(){
        return display1Mapper.showAllDisplay1();
    }

    @RequestMapping("/showDisplay1/{id}")
    Display1 showDisplay1(@PathVariable("id")int id){
        return display1Mapper.selectDisplay1ById(id);
    }

    @RequestMapping("/insertDisplay1")
    Display1 insertDisplay1(Display1 display1){
        display1Mapper.insertDisplay1(display1);
        return display1;
    }

    @RequestMapping("/updateDisplay1/{id}")
    Display1 updateDisplay1(@PathVariable("id")int id,Display1 display1){
        display1Mapper.updateDisplay1(display1);
        return display1Mapper.selectDisplay1ById(id);
    }

    @RequestMapping("/deleteDisplay1/{id}")
    String deleteDisplay1(@PathVariable("id") int id){
        if(display1Mapper.selectDisplay1ById(id)==null){
            return "not found";
        }
        display1Mapper.deleteDisplay1(id);
        return "success";
    }
}
