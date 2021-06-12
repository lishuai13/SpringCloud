package com.lishuai;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient //开启Eureka客户端服务
@EnableFeignClients //开启Feign调用功能
public class Consumer80_feign {
    public static void main(String[] args) {
        SpringApplication.run(Consumer80_feign.class,args);
    }
}