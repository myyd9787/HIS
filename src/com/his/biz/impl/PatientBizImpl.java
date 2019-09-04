package com.his.biz.impl;

import com.his.biz.PatientBiz;


import com.his.dao.PatientDao;

import com.his.dao.impl.PatientDaoImpl;
import com.his.entity.Patient;

import java.sql.SQLException;
import java.util.List;

public class PatientBizImpl implements PatientBiz {
    @Override
    public List<Patient> getPatient(int page,int limit,String caseNumber) {
        PatientDao patientDao = new PatientDaoImpl();
        try {
            return patientDao.getPatient(page,limit,caseNumber);
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public int getCount() {
        try {
            return new PatientDaoImpl().getCount();
        } catch (SQLException e) {
            e.printStackTrace();
            return 0;
        }
    }
}
