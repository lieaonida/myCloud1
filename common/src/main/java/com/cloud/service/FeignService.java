package com.cloud.service;

import com.cloud.bean.ListBean;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient(name = "CLOUD-PROVIDE")
public interface FeignService {

    @RequestMapping(value = "/myController/list",method = RequestMethod.GET)
    List<ListBean> list();

}
