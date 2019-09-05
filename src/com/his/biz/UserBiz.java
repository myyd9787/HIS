package com.his.biz;

import com.his.entity.User;

import java.sql.SQLException;
import java.util.List;


public interface UserBiz {
    User login(String userName,String passWord);
    User getUser(String username,String pwd,int usertype);
}
