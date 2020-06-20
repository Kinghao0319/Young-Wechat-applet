package com.yhh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

@Controller
public class UploadTest {

    @RequestMapping("/upload")
    @ResponseBody
    public String upload(@RequestParam("actimg") MultipartFile file,
                         @RequestParam(value = "username",required = false)String username,
                         Model model) throws FileNotFoundException {
        if (file.isEmpty()) {
            return "上传失败，请选择文件";
        }

        String random=(int)(Math.random()*10000)+"";
        String fileName = random+file.getOriginalFilename();
        String filePath = System.getProperty("user.dir")+"/src/main/resources/static/img/";
        File dest = new File(filePath + fileName);
        try {
            file.transferTo(dest);
            return "上传成功";
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "上传失败！";
    }

}
