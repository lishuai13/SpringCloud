package com.MyRule;

import com.netflix.loadbalancer.IRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 自定义负载均衡算法装配文件
 */
@Configuration
public class LBConfig {

    @Bean
    public IRule myRule(){
        //使用自己的！
        return new DiyRule();
    }
}
