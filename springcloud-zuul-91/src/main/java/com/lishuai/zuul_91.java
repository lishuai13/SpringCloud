package com.lishuai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy //开启路由网关服务
public class zuul_91 {
    public static void main(String[] args) {
        SpringApplication.run(zuul_91.class,args);
    }
}
