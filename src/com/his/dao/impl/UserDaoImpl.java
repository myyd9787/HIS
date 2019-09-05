package com.his.dao.impl;

import com.his.dao.UserDao;
import com.his.entity.User;
import com.his.util.DBUtil;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserDaoImpl extends DBUtil implements UserDao {

    @Override
    public int save(User user) {
        String sql="insert into user(UserName,Password,RealName,UseType,DocTitleID,IsScheduling,DeptID,RegistLeID," +
                "DelMark)values(?,?,?,?,?,?,?,?.?)";
        try {
            return executeUpdate(sql,user.getUserName(),user.getPassWord(),user.getUseType(),user.getDocTitleID()
            ,user.getIsScheduling(),user.getDeptNo(),user.getRegistLeID(),user.getDelMark());
        } catch (SQLException e) {
            e.printStackTrace();
            return 0;
        }
    }

    @Override
    public User getUserByUsername(String username, String pwd) throws SQLException {
        String sql = "SELECT `UserName`,`Password`,`RealName`,`UseType`,`DocTitleID`,`IsScheduling`,`DeptID`,`RegistLeID`,`DelMark`" +
                "FROM `user`  WHERE UserName=? and Password=? ";
        User user;
        try {
            rs = executeQuery(sql, username, pwd);
            user = null;
            if (rs.next()) {
                user = new User();
                user.setUserName(rs.getString("UserName"));
                user.setPassWord(rs.getString("Password"));
                user.setRealName(rs.getString("RealName"));
                user.setUseType(rs.getInt("UseType"));
                user.setDocTitleID(rs.getInt("DocTitleID"));
                user.setIsScheduling(rs.getString("IsScheduling"));
                user.setDeptNo(rs.getInt("DeptID"));
                user.setDelMark(rs.getInt("DelMark"));
            }
        }finally{
            closeAll(conn,pstmt,rs);
        }
        return user;
    }

    @Override
    public User getUser(String username,String pwd,int usertype) throws SQLException {
        User user = new User();
        String sql="SELECT ID FROM USER where (username = ? and password = ? and usetype = ?)";
        try {
            rs = executeQuery(sql,username,pwd,usertype);
             user = null;
            while (rs.next()) {
                user = new User();
                user.setId(rs.getInt("ID"));
            }
        }finally {
            closeAll(conn,pstmt,rs);
        }
       return user;
    }
}
