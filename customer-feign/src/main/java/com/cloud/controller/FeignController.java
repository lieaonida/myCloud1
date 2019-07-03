package com.cloud.controller;

import com.cloud.bean.ListBean;
import com.cloud.service.FeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FeignController {

    @Autowired
    private FeignService feignService;

    @RequestMapping(value = "/myController/list",method = RequestMethod.GET)
    public List<ListBean> list() {
        return feignService.list();
    }

}
