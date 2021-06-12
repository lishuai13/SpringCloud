package com.lishuai.controller;

import com.lishuai.common.lang.Result;
import com.lishuai.service.OssService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.io.InputStream;


/**
 * 上传文件 rest
 * @author lishuai
 */
@RestController
@RequestMapping("/oss/rest")
public class OssRestController {

    @Autowired
    OssService ossService;

    /**
     * 上传文件
     * @return
     */
    @PostMapping("/uploadAvatar")
    public String uploadOssFile(@RequestParam("file") MultipartFile file,
                                @RequestParam("fileName") String fileName) {
        //获取上传文件 MultipartFile
        InputStream inputStream = null;
        try {
            inputStream = file.getInputStream();
        } catch (IOException e) {
            e.printStackTrace();
        }
        String url = ossService.uploadFileAvatar(inputStream,fileName,file.getOriginalFilename());

        return url;
    }

    @GetMapping("/deleteFile/{fileName}")
    public String deleteFile(@PathVariable String fileName) {
        ossService.deleteFile(fileName);
        return "删除成功！";
    }

    //注意这里的接受请求的方式与 restTemplate 请求的方法是否匹配
    @GetMapping("/test/{name}")
    public void test(@PathVariable String name) {
        System.out.println("name----------------"+name);
    }
}
