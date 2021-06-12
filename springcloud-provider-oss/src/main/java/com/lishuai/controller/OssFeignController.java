package com.lishuai.controller;

import com.lishuai.common.lang.Result;
import com.lishuai.service.OssService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.io.InputStream;

/**
 * 上传文件 feign
 * @author lishuai
 */
@RestController
@RequestMapping("/oss/feign")
public class OssFeignController {

    @Autowired
    private OssService ossService;

    /**
     * 上传文件
     * @param multipartFile
     * @return
     */
    @PostMapping(value = "/uploadAvatar",consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public Result uploadOssFile(@RequestPart("multipartFile") MultipartFile multipartFile) {

        //获取上传文件 MultipartFile
        InputStream inputStream = null;
        try {
            inputStream = multipartFile.getInputStream();
        } catch (IOException e) {
            e.printStackTrace();
        }
        String url = ossService.uploadFileAvatar(inputStream,"test",multipartFile.getOriginalFilename());

        return Result.success("文件上传成功->"+url);
    }


    @PostMapping("/test")
    public void test(@RequestParam("name") String name) {
        System.out.println("name----------------"+name);
    }
}
