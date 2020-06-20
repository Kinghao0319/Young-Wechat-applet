package com.yhh.controller;

import com.yhh.mapper.Display2Mapper;
import com.yhh.pojo.Display2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Display2Controller {
    @Autowired
    Display2Mapper display2Mapper;


    @RequestMapping("/showAllDisplay2")
    List<Display2> showAllDisplay2(){
        return display2Mapper.showAllDisplay2();
    }

    @RequestMapping("/showDisplay2/{id}")
    Display2 showDisplay2(@PathVariable("id")int id){
        return display2Mapper.selectDisplay2ById(id);
    }

    @RequestMapping("/insertDisplay2")
    Display2 insertDisplay2(Display2 display2){
        display2Mapper.insertDisplay2(display2);
        return display2;
    }

    @RequestMapping("/updateDisplay2/{id}")
    Display2 updateDisplay2(@PathVariable("id")int id,Display2 display2){
        display2Mapper.updateDisplay2(display2);
        return display2Mapper.selectDisplay2ById(id);
    }

    @RequestMapping("/deleteDisplay2/{id}")
    String deleteDisplay2(@PathVariable("id") int id){
        if(display2Mapper.selectDisplay2ById(id)==null){
            return "not found";
        }
        display2Mapper.deleteDisplay2(id);
        return "success";
    }
}

