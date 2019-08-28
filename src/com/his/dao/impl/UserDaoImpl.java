package com.his.dao.impl;

import com.his.dao.UserDao;
import com.his.entity.User;
import com.his.util.DBUtil;

import java.sql.SQLException;

public class UserDaoImpl extends DBUtil implements UserDao {
    @Override
    public User login(String userName, String passWord) throws SQLException {
        User user=null;
        String sql="SELECT `ID`,`UserName`,`Password`,`RealName`,`UseType`,`DocTitleID`,`IsScheduling`,`DeptID`,`RegistLeID`,`DelMark` FROM USER WHERE UserName=? AND\n" +
                "PASSWORD=?";
        rs=executeQuery(sql,userName,passWord);
        if(rs.next()){
           user=new User();
           user.setId(rs.getInt("ID"));
           user.setUserName(rs.getString("UserName"));
           user.setPassWord(rs.getString("Password"));
           user.setRealName(rs.getString("RealName"));
           user.setUseType(rs.getInt("UseType"));
           user.setDocTitleID(rs.getInt("DocTitleID"));
           user.setIsSchedulin(rs.getString("IsScheduling"));
           user.setDeptNo(rs.getInt("DeptID"));
           user.setRegistLeID(rs.getInt("RegistLeID"));
           user.setDelMark(rs.getInt("DelMark("));
        }
        return user;
    }
}
