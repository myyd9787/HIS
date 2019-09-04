package com.his.dao.impl;

import com.his.dao.PatientDao;
import com.his.entity.Patient;
import com.his.entity.Register;
import com.his.util.DBUtil;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PatientDaoImpl extends DBUtil implements PatientDao {

    @Override
    public List<Patient> getPatient(int page,int limit, String caseNumber) throws SQLException {
        String sql = "SELECT `caseNumber`,`realName`,`age`,`settleID`,`deptID`,`prescriptionState`,`visitDate`,`userID`," +
                "`invoiceNum`,`name`,`position`,`num`,`danwei`,`price`,`sum`,`state`" +
                "FROM `patient` WHERE caseNumber=? limit ?,?" ;
        rs = executeQuery(sql,caseNumber,(page-1)*limit,limit);
        List<Patient> patientList = new ArrayList<>();
        Patient patient = null;
        try {
            while(rs.next()){
                patient = new Patient();
                patient.setCaseNumber(rs.getString("caseNumber"));
                patient.setRealName(rs.getString("realName"));
                patient.setAge(rs.getInt("age"));
                patient.setSettleID(rs.getInt("settleID"));
                patient.setDeptID(rs.getInt("deptID"));
                patient.setPrescriptionState(rs.getInt("prescriptionState"));
                patient.setVisitDate(rs.getDate("visitDate"));
                patient.setUserID(rs.getInt("userID"));
                patient.setInvoiceNum(rs.getInt("invoiceNum"));
                patient.setName(rs.getString("name"));
                patient.setPosition(rs.getString("position"));
                patient.setNum(rs.getInt("num"));
                patient.setDanwei(rs.getString("danwei"));
                patient.setPrice(rs.getInt("price"));
                patient.setSum(rs.getInt("sum"));
                patient.setState(rs.getInt("state"));
                patientList.add(patient);
            }
        } finally {
            closeAll(conn, pstmt, rs);
        }
        return patientList;
    }
    //查询列数
    public int getCount() throws SQLException {
        int result = 0;
        String sql = "select count(caseNumber) from `patient`";
        rs = executeQuery(sql,null);
        if (rs.next()){
            result = rs.getInt(1);
        }
        return result;
    }
}
