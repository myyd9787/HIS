package com.his.dao;

import com.his.entity.Register;

import java.sql.SQLException;

public interface CollectorDao {
    //现场挂号
    int regist(Register register) ;
}
