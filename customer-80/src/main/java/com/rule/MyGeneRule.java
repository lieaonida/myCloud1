package com.rule;

import com.netflix.loadbalancer.IRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyGeneRule {

    @Bean
    public IRule geneRule() {
        return new RandomRule_ZY();
    }

}
