package com.lishuai.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * RestTemplate
 */
@Configuration
public class RestConfig {

    @Bean
    @LoadBalanced   //让RestTemplate负载均衡地去拿取服务
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }

//    @Bean
//    public IRule myRule(){
//        //使用我们重新选择的随机算法，替代默认的轮询！
//        return new RandomRule();
//    }
}
