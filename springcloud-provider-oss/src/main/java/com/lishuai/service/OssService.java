package com.lishuai.service;

import java.io.InputStream;

/**
 * 上传文件
 * @author lishuai
 */
public interface OssService {

    /**
     * 上传文件
     * @param inputStream
     * @param module
     * @param originalFilename
     * @return
     */
    String uploadFileAvatar(InputStream inputStream, String module, String originalFilename);

    /**
     * 删除文件
     * @param fileName
     */
    void deleteFile(String fileName);
}
