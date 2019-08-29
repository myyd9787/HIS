package com.his.dao;

import com.his.entity.User;

import java.sql.SQLException;

public interface UserDao {
   int save(User user) throws SQLException;
    User getUserByUsername(String username,String pwd) throws SQLException;
}
