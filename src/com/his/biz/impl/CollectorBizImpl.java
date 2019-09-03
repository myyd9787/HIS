package com.his.biz.impl;

import com.his.biz.CollectorBiz;
import com.his.dao.impl.CollectorDaoImpl;
import com.his.entity.Collector;

import java.sql.SQLException;
import java.util.List;


public class CollectorBizImpl implements CollectorBiz {
    @Override
    //现场挂号
    public int add(Collector collector) {
        return new CollectorDaoImpl().save(collector);
    }

    @Override
    public List<Collector> getCollectorList() {
        try {
            return new CollectorDaoImpl().getCollectorList();
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}
