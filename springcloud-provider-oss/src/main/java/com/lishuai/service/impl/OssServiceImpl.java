package com.lishuai.service.impl;

import com.aliyun.oss.OSS;
import com.aliyun.oss.OSSClientBuilder;
import com.aliyun.oss.model.ObjectMetadata;
import com.lishuai.common.lang.ConstantPropertiesUtils;
import com.lishuai.service.OssService;
import org.springframework.stereotype.Service;

import java.io.InputStream;


/**
 * 上传文件的具体实现
 * @author lishuai
 */
@Service
public class OssServiceImpl implements OssService {

    @Override
    public String uploadFileAvatar(InputStream inputStream, String fileName, String originalFilename) {
        //工具类获取值
        String endpoint = ConstantPropertiesUtils.END_POINT;
        String accessKeyId = ConstantPropertiesUtils.ACCESS_KEY_ID;
        String accessKeySecret = ConstantPropertiesUtils.ACCESS_KEY_SECRET;
        String bucketName = ConstantPropertiesUtils.BUCKET_NAME;


        //创建OSS实例
        OSS ossClient = new OSSClientBuilder().build(endpoint, accessKeyId, accessKeySecret);

        String dirName = "userAvatars";
        String fileExtension = originalFilename.substring(originalFilename.lastIndexOf("."));
        // oss中的文件夹名
        String objectName = dirName + "/" + fileName + fileExtension;

        // 创建上传文件的元信息，可以通过文件元信息设置HTTP header(设置了才能通过返回的链接直接访问)。
        //如果不设置，直接访问url会自行下载图片，看各位自己选择
        ObjectMetadata objectMetadata = new ObjectMetadata();
        objectMetadata.setContentType("image/jpg");

        ossClient.putObject(bucketName, objectName, inputStream,objectMetadata);

        // 关闭OSSClient。
        ossClient.shutdown();

        String url = "http://"+bucketName+"."+endpoint+"/"+objectName;
        return url;
    }

    @Override
    public void deleteFile(String fileName) {
        //工具类获取值
        String endpoint = ConstantPropertiesUtils.END_POINT;
        String accessKeyId = ConstantPropertiesUtils.ACCESS_KEY_ID;
        String accessKeySecret = ConstantPropertiesUtils.ACCESS_KEY_SECRET;
        String bucketName = ConstantPropertiesUtils.BUCKET_NAME;


        //创建OSS实例
        OSS ossClient = new OSSClientBuilder().build(endpoint, accessKeyId, accessKeySecret);

        ossClient.deleteObject(bucketName,"userAvatars/"+fileName);

        // 关闭OSSClient。
        ossClient.shutdown();
    }

}
