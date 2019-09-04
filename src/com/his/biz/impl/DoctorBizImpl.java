package com.his.biz.impl;

import com.his.biz.DoctorBiz;
import com.his.dao.DoctorDao;
import com.his.dao.impl.DoctorDaoImpl;
import com.his.entity.MedicalRecord;
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

    //是否存在

    /**
     *
     * @param caseNumebr
     * @param registId
     * @return true 存在 false 不存在
     */
    @Override
    public boolean isExistMedicalRecord(String caseNumebr, int registId) {
        DoctorDao doctorDao = new DoctorDaoImpl();
        try {
            List<MedicalRecord> medicalRecordList = doctorDao.getMedicalRecord(caseNumebr, registId);
            if(medicalRecordList.size() != 0){
                return true;
            }else{
                return false;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }

    }

    //病历首页存入数据库
    @Override
    public int setMedicalRecord(MedicalRecord medicalRecord) {
        DoctorDao doctorDao = new DoctorDaoImpl();
        try {
            return doctorDao.setMedicalRecord(medicalRecord);
        } catch (SQLException e) {
            e.printStackTrace();
            return 0;
        }
    }

    @Override
    public int updateMedicalRecord(MedicalRecord medicalRecord, String caseNumber, int registId) {
        DoctorDao doctorDao = new DoctorDaoImpl();
        try {
            return doctorDao.updateMedicalRecord(medicalRecord, caseNumber, registId);
        } catch (SQLException e) {
            e.printStackTrace();
            return 0;
        }
    }

    @Override
    public int changeRegisterState(int registId) {
        DoctorDao doctorDao = new DoctorDaoImpl();
        return doctorDao.changeRegisterState(registId);
    }
}
