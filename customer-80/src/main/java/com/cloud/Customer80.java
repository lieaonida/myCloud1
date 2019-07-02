package com.cloud;

import com.rule.MyGeneRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

@SpringBootApplication
@EnableEurekaClient
//@RibbonClient(name = "CLOUD-PROVIDE",configuration = MyGeneRule.class)
public class Customer80 {

    public static void main(String[] args) {
        SpringApplication.run(Customer80.class,args);
    }

}
