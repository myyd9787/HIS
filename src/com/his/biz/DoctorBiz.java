package com.his.biz;

import com.his.entity.MedicalRecord;
import com.his.entity.Register;

import java.sql.SQLException;
import java.util.List;

public interface DoctorBiz {
    //根据诊断状态查询患者
    List<Register> getRegisterByState(int state, int currentPage, int pageSize);

    //根据姓名查询患者(可能重名)
    List<Register> getRegisterByName(String name, int currentPage, int pageSize);

    //根据caseNumber和registId查询是否存在
    boolean isExistMedicalRecord(String caseNumebr, int registId) ;

    //保存病历首页到数据库
    int setMedicalRecord(MedicalRecord medicalRecord);

    int updateMedicalRecord(MedicalRecord medicalRecord, String caseNumber, int registId);

    //根据ID改变register号的状态state
    int changeRegisterState(int registId);

}
