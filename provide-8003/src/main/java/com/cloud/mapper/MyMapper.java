package com.cloud.mapper;

import com.cloud.bean.ListBean;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface MyMapper {

    @Select("select * from p_list")
    List<ListBean> list();
}
