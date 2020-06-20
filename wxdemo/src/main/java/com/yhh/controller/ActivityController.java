package com.yhh.controller;

import com.yhh.mapper.ActivityMapper;
import com.yhh.pojo.Activity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

@RestController
public class ActivityController {

    @Autowired
    ActivityMapper activityMapper;

    @RequestMapping("/showActivityList")
    public List<Activity> showActivityList(){
        List<Activity> activityList= activityMapper.showActivityList();
        return activityList;
    }

    @RequestMapping("/showActivityList/{id}")
    public Activity selectActivityById(@PathVariable("id")Integer id){
        return activityMapper.selectActivityById(id);
    }

    @RequestMapping("/addActivity")
    public String addActivity(@RequestParam("actimg") MultipartFile file, Activity activity) throws FileNotFoundException {
        if (file.isEmpty()) {
            return "上传失败，请选择图片";
        }

        String random=(int)(Math.random()*10000)+"";
        String fileName = random+file.getOriginalFilename();
        File path = new File(ResourceUtils.getURL("classpath:").getPath());
        if(!path.exists()) path = new File("");
        System.out.println("path:"+path.getAbsolutePath());
        System.out.println("user.dir:"+System.getProperty("user.dir"));
        String filePath =path.getAbsolutePath()+"/actImage/";
        activity.setImgpath(fileName);
        activityMapper.addActivity(activity);
        File dest = new File(filePath + fileName);
        try {
            file.transferTo(dest);
            return "上传成功";
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "上传失败！";
    }

    @RequestMapping("updateActivity/{id}")
    public Activity updateActivity(@PathVariable("id")int id,Activity activity){
        activityMapper.updateActivity(activity);
        return selectActivityById(id);
    }

    @RequestMapping("deleteActivity/{id}")
    public String deleteActivity(@PathVariable("id")int id){
        if(activityMapper.selectActivityById(id)==null){
            return "activity not found";
        }
        activityMapper.deleteActivity(id);
        return "success";
    }

}
