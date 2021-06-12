package com.lishuai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient //开启Eureka客户换功能
public class DeptProvider8002 {
    public static void main(String[] args) {
        SpringApplication.run(DeptProvider8002.class,args);
    }
}