package com.his.biz;

import com.his.entity.Collector;
import com.his.entity.Register;

import java.util.List;

public interface CollectorBiz {
    //现场挂号
    int add(Collector collector);
    //不带分页
    List<Collector> getCollectorList();
    //带分页的用户列表
    List<Collector>getCollectorListByPage(int currentPage,int pageSize) ;
    //总记录数
    int getCollectorCount();
    //删除数据
    int delCollectorById(int id);
}
