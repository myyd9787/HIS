package com.his.dao;

import com.his.entity.MedicalRecord;
import com.his.entity.Register;

import java.sql.SQLException;
import java.util.List;

public interface DoctorDao {

    //根据诊断状态查询患者
    List<Register> getRegisterByState(int state, int currentPage, int pageSize) throws SQLException;

    //根据姓名查询患者(可能重名)
    List<Register> getRegisterByName(String name, int currentPage, int pageSize) throws SQLException;

    //将患者病历首页存入数据库
    //根据caseNumber与registId查询记录
    List<MedicalRecord> getMedicalRecord(String caseNumebr, int registId) throws SQLException;

    //如不存在则新增数据
    int setMedicalRecord(MedicalRecord medicalRecord) throws SQLException;

    //如果存在则根据caseNumber和registId修改数据
    int updateMedicalRecord(MedicalRecord medicalRecord, String caseNumber, int registId) throws SQLException;

    //根据ID改变register号的状态state
    int changeRegisterState(int registId);
}
