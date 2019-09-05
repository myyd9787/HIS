package com.his.biz.impl;

import com.his.biz.ManagerBiz;
import com.his.dao.ManagerDao;
import com.his.dao.impl.ManagerDaoImpl;
import com.his.entity.ConstantItem;
import com.his.entity.ConstantType;
import com.his.entity.User;
import com.his.entity.UserDetail;

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

    @Override
    //1.2 新增常数类别
    public int addConstantType(ConstantType constantType) {
        try {
            return new ManagerDaoImpl().addConstantType(constantType);
        } catch (SQLException e) {
            e.printStackTrace();
            return 0;
        }
    }

    @Override
    //修改常数项
    public int updateConstantItem(ConstantItem constantItem, int oldID) {
        try {
            return new ManagerDaoImpl().updateConstantItem(constantItem,oldID);
        } catch (SQLException e) {
            e.printStackTrace();
            return 0;
        }
    }

    @Override
    //删除常数项
    public int delConstantItemById(int newId) {
        try {
            return new ManagerDaoImpl().delConstantItemById(newId);
        } catch (SQLException e) {
            e.printStackTrace();
            return 0;
        }
    }

    @Override
    public List<ConstantItem> getConstantItemList() {
        try {
            return new ManagerDaoImpl().getConstantItemList();
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    //新增用户
    public int addUser(User user)  {
        try {
            return new ManagerDaoImpl().addUser(user);
        } catch (SQLException e) {
            e.printStackTrace();
            return 0;
        }
    }

    //获取前台需要显示的所有用户详细信息
    public List<UserDetail> getUserDetailList(){
        try {
            return new ManagerDaoImpl().getUserDetailList();
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    //模糊查询前台需要显示的所有用户详细信息
    public List<UserDetail> getUserDetailListByUserName(String userName) {
        try {
            return new ManagerDaoImpl().getUserDetailListByUserName(userName);
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}
