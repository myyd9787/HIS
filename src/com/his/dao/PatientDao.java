package com.his.dao;

import com.his.entity.Patient;

import java.sql.SQLException;
import java.util.List;

public interface PatientDao {
    //查询患者信息
    List<Patient> getPatient(int page,int limit,String caseNumber) throws SQLException;
    public int getCount() throws SQLException;
}
