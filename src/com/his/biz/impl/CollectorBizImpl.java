package com.his.biz.impl;

import com.his.biz.CollectorBiz;
import com.his.dao.impl.CollectorDaoImpl;
import com.his.entity.Collector;


public class CollectorBizImpl implements CollectorBiz {
    @Override
    //现场挂号
    public int add(Collector collector) {
        return new CollectorDaoImpl().save(collector);
    }
}
