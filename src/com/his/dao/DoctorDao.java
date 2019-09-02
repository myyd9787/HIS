package com.his.dao;

import com.his.entity.Register;

import java.sql.SQLException;
import java.util.List;

public interface DoctorDao {

    //根据诊断状态查询患者
    List<Register> getRegisterByState(int state) throws SQLException;

    //根据姓名查询患者(可能重名)
    List<Register> getRegisterByName(String name) throws SQLException;

    //根据
}
