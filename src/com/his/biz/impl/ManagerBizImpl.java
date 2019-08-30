package com.his.biz.impl;

import com.his.biz.ManagerBiz;
import com.his.dao.ManagerDao;
import com.his.dao.impl.ManagerDaoImpl;
import com.his.entity.ConstantType;

import java.sql.SQLException;
import java.util.List;

public class ManagerBizImpl implements ManagerBiz {
    @Override
    //1.1查询所有常数类别
    public List<ConstantType> getConstantTypeList() {
        ManagerDao managerDao=new ManagerDaoImpl();
        try {
            return managerDao.getConstantTypeList();
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    //1.1.1 模糊查询所有符合条件的常数类别  当查询条件为constantTypeCode时
    public List<ConstantType> getConstantTypeListByConstantTypeCode(String constantTypeCode) {
        ManagerDao managerDao=new ManagerDaoImpl();
        try {
            return managerDao.getConstantTypeListByConstantTypeCode(constantTypeCode);
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    //1.1.2模糊查询所有符合条件的常数类别 当查询条件为constantTypeName时
    public List<ConstantType> getConstantTypeListByConstantTypeName(String constantTypeName) {
        try {
            return new ManagerDaoImpl().getConstantTypeListByConstantTypeName(constantTypeName);
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}
