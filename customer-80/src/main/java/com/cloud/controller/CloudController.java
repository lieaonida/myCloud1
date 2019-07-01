package com.cloud.controller;

import com.alibaba.fastjson.JSONObject;
import com.cloud.bean.ListBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class CloudController {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public String list() {
        return JSONObject.toJSONString(restTemplate.getForObject("http://CLOUD-PROVIDE/list", List.class));
    }

}
