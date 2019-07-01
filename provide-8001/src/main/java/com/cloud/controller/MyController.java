package com.cloud.controller;

import com.cloud.bean.ListBean;
import com.cloud.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MyController {

    @Autowired
    private MyService myService;

    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public List<ListBean> list() {
        return myService.list();
    }

}
