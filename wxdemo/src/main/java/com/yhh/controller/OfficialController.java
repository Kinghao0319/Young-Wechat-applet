package com.yhh.controller;

import com.yhh.mapper.OfficialMapper;
import com.yhh.pojo.Official;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OfficialController {
    @Autowired
    OfficialMapper officialMapper;


    @RequestMapping("/showAllOfficial")
    List<Official> showAllOfficial(){
        return officialMapper.showAllOfficial();
    }

    @RequestMapping("/showOfficial/{id}")
    Official showOfficial(@PathVariable("id")int id){
        return officialMapper.selectOfficialById(id);
    }

    @RequestMapping("/insertOfficial")
    Official insertOfficial(Official official){
        officialMapper.insertOfficial(official);
        return official;
    }

    @RequestMapping("/updateOfficial/{id}")
    Official updateOfficial(@PathVariable("id")int id,Official official){
        officialMapper.updateOfficial(official);
        return officialMapper.selectOfficialById(id);
    }

    @RequestMapping("/deleteOfficial/{id}")
    String deleteOfficial(@PathVariable("id") int id){
        if(officialMapper.selectOfficialById(id)==null){
            return "not found";
        }
        officialMapper.deleteOfficial(id);
        return "success";
    }
}
