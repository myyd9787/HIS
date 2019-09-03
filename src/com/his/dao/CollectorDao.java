package com.his.dao;

import com.his.entity.Collector;
import com.his.entity.ConstantType;
import com.his.entity.Register;

import java.sql.SQLException;
import java.util.List;

public interface CollectorDao {
    //新增挂号信息
    int save(Collector collector) ;
    //通过name获取值
    Collector getCollecttorBycollectname(String CaseNumber,String RealName)throws SQLException;

    List<Collector>getCollectorList() throws SQLException;

}
