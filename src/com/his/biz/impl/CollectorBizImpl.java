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

    @Override
    public List<Collector> getCollectorListByPage(int currentPage, int pageSize) {
        try {
            return new CollectorDaoImpl().getCollectorListByPage(currentPage,pageSize);
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public int getCollectorCount() {
        try {
            return new CollectorDaoImpl().getCollectorCount();
        } catch (SQLException e) {
            e.printStackTrace();
            return 0;
        }
    }

    @Override//删除
    public int delCollectorById(int id)  {
        try {
            return new CollectorDaoImpl().delCollectorById(id);
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }
}
