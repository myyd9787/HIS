package com.his.biz;

import com.his.entity.Patient;
import java.sql.SQLException;
import java.util.List;

public interface PatientBiz  {
    List<Patient> getPatient(int page,int limit,String caseNumber);
    public int getCount();
}
