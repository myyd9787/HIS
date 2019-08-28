package com.his.biz.impl;

import com.his.biz.UserBiz;
import com.his.dao.impl.UserDaoImpl;
import com.his.entity.User;

import java.sql.SQLException;

public class UserBizImpl implements UserBiz {
    @Override
    public User login(String userName, String passWord) {
        try {
            return new UserDaoImpl().login(userName,passWord);
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}
