package com.lishuai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


@SpringBootApplication
@EnableEurekaServer //开启Eureka服务端
public class EurekaServer7003 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServer7003.class,args);
    }
}
