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
    public List<Register> getRegisterByState(int state, int currentPage, int pageSize) throws SQLException {
        String sql = "SELECT `ID`,`CaseNumber`,`RealName`,`Gender`,`IDnumber`,`Age`,`DeptID`,`UserID`,`RegistLeID`," +
                "`SettleID`,`VisitState`" +
                "FROM `register`" +
                "WHERE `VisitState` = ? " +
                "LIMIT ?, ?";
        rs = executeQuery(sql, state, (currentPage-1)*pageSize, pageSize);
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
    public List<Register> getRegisterByName(String name, int currentPage, int pageSize) throws SQLException {
        String sql = "SELECT `ID`,`CaseNumber`,`RealName`,`Gender`,`IDnumber`,`Age`,`DeptID`,`UserID`,`RegistLeID`," +
                "`SettleID`,`VisitState`" +
                "FROM `register`" +
                "WHERE `RealName` = ? " +
                "LIMIT ?, ?";
        rs = executeQuery(sql, name, (currentPage-1)*pageSize, pageSize);
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

    //根据caseNumber和registId查询病历记录
    @Override
    public List<MedicalRecord> getMedicalRecord(String caseNumebr, int registId) throws SQLException {
        List<MedicalRecord> medicalRecordList = new ArrayList<>();
        String sql = "SELECT `ID` FROM `medicalrecord` " +
                "WHERE (`CaseNumber` = ? AND `RegistID` = ?)";
        try {
            rs = executeQuery(sql, caseNumebr, registId);
            MedicalRecord medicalRecord = null;
            while(rs.next()){
                medicalRecord = new MedicalRecord();
                medicalRecord.setId(rs.getInt("ID"));
                medicalRecordList.add(medicalRecord);
            }
        }finally {
            closeAll(conn,pstmt,rs);
        }
        return medicalRecordList;
    }

    //保存病历首页到数据库
    @Override
    public int setMedicalRecord(MedicalRecord medicalRecord) throws SQLException {
        String sql = "INSERT INTO `medicalrecord` (`CaseNumber`,`RegistID`,`Readme`,`Present`,`PresentTreat`,`History`," +
                "`Allergy`,`Physique`,`CaseState`)"+
                "VALUE (?,?,?,?,?,?,?,?,?)";
        return executeUpdate(sql, medicalRecord.getCaseNumber(), medicalRecord.getRegistId(), medicalRecord.getReadme(),
                medicalRecord.getPresent(), medicalRecord.getPresentTreat(), medicalRecord.getHistory(),
                medicalRecord.getAllergy(), medicalRecord.getPhysique(), medicalRecord.getCaseState());
    }


//    @Override
//    public int updateMedicalRecord(MedicalRecord medicalRecord) throws SQLException {
//        return 0;
//    }

    //诊断数据
    @Override
    public int updateMedicalRecord(MedicalRecord medicalRecord, String caseNumber, int registId) throws SQLException {
        String sql = "UPDATE `medicalrecord` "+
                "SET `CheckResult` = ?, `Diagnosis` = ?, `Handling` = ?, `CaseState` = ? " +
                "WHERE (`CaseNumber` = ? AND `RegistID` = ?)";
        return executeUpdate(sql, medicalRecord.getCheckResult(), medicalRecord.getDiagnosis(), medicalRecord.getHandling(),
                medicalRecord.getCaseState(), caseNumber, registId);
    }

    //根据ID改变register号的状态visitstate为诊毕
    @Override
    public int changeRegisterState(int registId) {
        String sql = "UPDATE `register` " +
                "SET `VisitState` = 3 " +
                "WHERE `ID` = ? ";
        try {
            return executeUpdate(sql, registId);
        } catch (SQLException e) {
            e.printStackTrace();
            return 0;
        }

    }


}
