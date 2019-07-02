package com.cloud.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.RetryRule;
import com.netflix.loadbalancer.RoundRobinRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class CloudConfig {

    @Bean
    @LoadBalanced
    public RestTemplate restTemple() {
        return new RestTemplate();
    }

    @Bean
    public IRule geneRule() {
//        return new RoundRobinRule();//轮询
//        return new RandomRule();//随机
        return new RetryRule();//重试
    }

}
