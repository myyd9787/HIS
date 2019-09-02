package com.his.biz;

import com.his.entity.MedicalRecord;
import com.his.entity.Register;

import java.sql.SQLException;
import java.util.List;

public interface DoctorBiz {
    //根据诊断状态查询患者
    List<Register> getRegisterByState(int state);

    //根据姓名查询患者(可能重名)
    List<Register> getRegisterByName(String name);

    int setMedicalRecord(MedicalRecord medicalRecord);
}
