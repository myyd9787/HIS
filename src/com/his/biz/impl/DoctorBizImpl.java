package com.his.biz.impl;

import com.his.biz.DoctorBiz;
import com.his.dao.DoctorDao;
import com.his.dao.impl.DoctorDaoImpl;
import com.his.entity.Register;

import java.sql.SQLException;
import java.util.List;

public class DoctorBizImpl implements DoctorBiz {
    //根据诊断状态查询患者
    @Override
    public List<Register> getRegisterByState(int state) {
        DoctorDao doctorDao = new DoctorDaoImpl();
        try {
            return doctorDao.getRegisterByState(state);
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    //根据姓名查询患者(可能重名)
    @Override
    public List<Register> getRegisterByName(String name) {
        DoctorDao doctorDao = new DoctorDaoImpl();
        try {
            return doctorDao.getRegisterByName(name);
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }

    }
}
