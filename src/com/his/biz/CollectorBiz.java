package com.his.biz;

import com.his.entity.Collector;
import com.his.entity.Register;

import java.util.List;

public interface CollectorBiz {
    //现场挂号
    int add(Collector collector);
    List<Collector> getCollectorList();
}
