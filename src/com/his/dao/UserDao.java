package com.his.dao;

import com.his.entity.User;

import java.sql.SQLException;

public interface UserDao {
    User login(String userName,String passWord) throws SQLException;
}
