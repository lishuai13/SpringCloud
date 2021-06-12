package com.lishuai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer //开启配置中心功能
public class Springcloud_config_92 {
    public static void main(String[] args) {
        SpringApplication.run(Springcloud_config_92.class,args);
    }
}
