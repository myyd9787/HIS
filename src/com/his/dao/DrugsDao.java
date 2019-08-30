package com.his.dao;

import com.his.entity.Drugs;

import java.sql.Date;
import java.sql.SQLException;

public interface DrugsDao {

    //根据病历号和看诊时间查询所需的药品

    //根据药品助记码查询药品
    Drugs getDrugsByCode(String mnemonicCode)throws SQLException;
    //新增药品
    int save(Drugs drugs)throws SQLException;
    //删除药品
    int delete()throws SQLException;
    //编辑药品
}
