package com.his.dao;

import com.his.entity.User;

import java.sql.SQLException;
import java.util.List;

public interface UserDao {
    //增加用户
   int save(User user) throws SQLException;
   //通过name获取值
    User getUserByUsername(String username,String pwd) throws SQLException;
    User getUser(String username,String pwd,int usertype)throws SQLException;
}
