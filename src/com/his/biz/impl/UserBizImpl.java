package com.his.biz.impl;

import com.his.biz.UserBiz;
import com.his.dao.impl.CollectorDaoImpl;
import com.his.dao.impl.UserDaoImpl;
import com.his.entity.User;

import java.sql.SQLException;
import java.util.List;

public class UserBizImpl implements UserBiz {

    @Override
    public User login(String userName, String passWord) {
        try {
            return new UserDaoImpl().getUserByUsername(userName, passWord);
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
    @Override
    public User getUser(String username,String pwd,int usertype) {
        try {
            return new UserDaoImpl().getUser(username,pwd,usertype);
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}
