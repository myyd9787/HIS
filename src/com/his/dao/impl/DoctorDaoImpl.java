package com.his.dao.impl;

import com.his.entity.MedicalRecord;
import com.his.util.DBUtil;
import com.his.dao.DoctorDao;
import com.his.entity.Register;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DoctorDaoImpl extends DBUtil implements DoctorDao {

    //根据诊断状态查询患者
    @Override
    public List<Register> getRegisterByState(int state) throws SQLException {
        String sql = "SELECT `ID`,`CaseNumber`,`RealName`,`Gender`,`IDnumber`,`Age`,`DeptID`,`UserID`,`RegistLeID`," +
                "`SettleID`,`VisitState`" +
                "FROM `register`" +
                "WHERE `VisitState` = ? ";
        rs = executeQuery(sql, state);
        List<Register> registerList = new ArrayList<>();
        Register register = null;
        try {
            while(rs.next()){
                register = new Register();
                register.setId(rs.getInt("id"));
                register.setCaseNumber(rs.getString("CaseNumber"));
                register.setRealName(rs.getString("RealName"));
                register.setGender(rs.getString("Gender"));
                register.setIdNumber(rs.getString("IDnumber"));
                register.setAge(rs.getInt("Age"));
                register.setDeptId(rs.getInt("DeptID"));
                register.setUserId(rs.getInt("UserID"));
                register.setRegistLeId(rs.getInt("RegistLeID"));
                register.setSettleId(rs.getInt("SettleID"));
                register.setVisitState(rs.getInt("VisitState"));
                registerList.add(register);
            }
        } finally {
            closeAll(conn, pstmt, rs);
        }
        return registerList;
    }

    @Override
    //根据名字查询挂号患者
    public List<Register> getRegisterByName(String name) throws SQLException {
        String sql = "SELECT `ID`,`CaseNumber`,`RealName`,`Gender`,`IDnumber`,`Age`,`DeptID`,`UserID`,`RegistLeID`," +
                "`SettleID`,`VisitState`" +
                "FROM `register`" +
                "WHERE `RealName` = ? ";
        rs = executeQuery(sql, name);
        List<Register> registerList = new ArrayList<>();
        Register register = null;
        try {
            while(rs.next()){
                register = new Register();
                register.setId(rs.getInt("ID"));
                register.setCaseNumber(rs.getString("CaseNumber"));
                register.setRealName(rs.getString("RealName"));
                register.setGender(rs.getString("Gender"));
                register.setIdNumber(rs.getString("IDnumber"));
                register.setAge(rs.getInt("Age"));
                register.setDeptId(rs.getInt("DeptID"));
                register.setUserId(rs.getInt("UserID"));
                register.setRegistLeId(rs.getInt("RegistLeID"));
                register.setSettleId(rs.getInt("SettleID"));
                register.setVisitState(rs.getInt("VisitState"));
                registerList.add(register);
            }
        } finally {
            closeAll(conn, pstmt, rs);
        }
        return registerList;
    }

    @Override
    public int setMedicalRecord(MedicalRecord medicalRecord) throws SQLException {
        String sql = "INSERT INTO medicalrecord (`CaseNumber`,`RegistID`,`Readme`,`Present`,`PresentTreat`,`History`," +
                "`Allergy`,`Physique`)"+
                "VALUE (?,?,?,?,?,?,?,?)";
        return executeUpdate(sql, medicalRecord.getCaseNumber(), medicalRecord.getRegistId(), medicalRecord.getReadme(),
                medicalRecord.getPresent(), medicalRecord.getPresentTreat(), medicalRecord.getHistory(),
                medicalRecord.getAllergy(), medicalRecord.getPhysique());
    }


}
