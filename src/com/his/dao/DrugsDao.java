package com.his.dao;

import com.his.entity.Drugs;

import java.sql.Date;
import java.sql.SQLException;
import java.util.List;

public interface DrugsDao {

    //根据病历号和看诊时间查询所需的药品
    List<Drugs> getFaYao(String caseNumber,Date visitDate)throws SQLException;
    //刷新显示所有药品，分页显示
    List<Drugs> getDrugs(int drugsPage,int drugsLimit)throws SQLException;
    //查询列数
    int getCount()throws SQLException;
    //根据药品助记码查询药品
    Drugs getDrugsByCode(String mnemonicCode)throws SQLException;
    //新增药品
    int save(Drugs drugs)throws SQLException;
    //删除药品
    int delete(int drugsID)throws SQLException;
    //编辑药品
    int updata(Drugs drugs,int drugsID)throws SQLException;
}
