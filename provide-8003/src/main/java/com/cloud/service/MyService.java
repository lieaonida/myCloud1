package com.cloud.service;

import com.cloud.bean.ListBean;
import com.cloud.mapper.MyMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MyService {

    @Autowired
    private MyMapper myMapper;

    public List<ListBean> list() {
        List<ListBean> list = myMapper.list();
        return list;
    }

}
