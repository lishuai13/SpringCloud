package com.lishuai;


import com.MyRule.LBConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

@SpringBootApplication
@EnableEurekaClient //开启Eureka客户端服务
//@RibbonClient(name="SPRINGCLOUD-PROVIDER-SERVICE",configuration= LBConfig.class) //使用自己定义的负载均衡策略
public class Consumer80 {
    public static void main(String[] args) {
        SpringApplication.run(Consumer80.class,args);
    }
}