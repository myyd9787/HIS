package com.his.dao.impl;

import com.his.util.DBUtil;
import com.his.dao.DoctorDao;
import com.his.entity.Register;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DoctorDaoImpl extends DBUtil implements DoctorDao {

    @Override
    //查询所有该名字的挂号患者
    public List<Register> getRegisterByName(String name) throws SQLException {
        String sql = "SELECT *" +
                "FROM `register`" +
                "WHERE `RealName` = '?'";
        rs = executeQuery(sql, null);
        List<Register> registerList = new ArrayList<>();
        Register register = null;
        try {
            while(rs.next()){
                register = new Register();
                register.setRegisterId(rs.getInt("RegisterID"));
                register.setRealName(rs.getString("RealName"));
                register.setAge(rs.getInt("Age"));
                registerList.add(register);
            }
        } finally {
            closeAll(conn, pstmt, rs);
        }
        return registerList;
    }
}
