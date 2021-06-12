package com.lishuai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableHystrixDashboard //开启Hystrix dashboard 监控服务
public class hystrix_dashboard_90 {
    public static void main(String[] args) {
        SpringApplication.run(hystrix_dashboard_90.class,args);
    }
}
