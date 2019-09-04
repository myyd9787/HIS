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
    //不带分页的列表
    List<Collector>getCollectorList() throws SQLException;
    //带分页的列表
    List<Collector>getCollectorListByPage(int currentPage,int pageSize) throws SQLException;
    //总记录数
    int getCollectorCount()throws SQLException;
    //删除挂号信息
    int delCollectorById(int id)throws Exception;

}
