package com.his.dao.impl;

import com.his.dao.UserDao;
import com.his.entity.User;
import com.his.util.DBUtil;

import java.sql.SQLException;

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
        String sql = "select UserName,Password,RealName,UseType,DocTitleID,IsScheduling,DeptID,RegistLeID,DelMark" +
                "from user where UserName=? and Password=?";
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
}
