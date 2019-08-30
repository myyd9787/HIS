package com.his.biz;

import com.his.entity.ConstantType;

import java.util.List;

public interface ManagerBiz {
    //常数类别管理
    //1.1查询所有常数类别
    List<ConstantType> getConstantTypeList();
    //1.1.1 模糊查询所有符合条件的常数类别  当查询条件为constantTypeCode时
    List<ConstantType> getConstantTypeListByConstantTypeCode(String constantTypeCode);
    //1.1.2模糊查询所有符合条件的常数类别 当查询条件为constantTypeName时
    List<ConstantType> getConstantTypeListByConstantTypeName(String constantTypeName);
    //科室管理
    //用户管理
    //挂号级别管理
    //结算类别管理
    //诊断目录管理
    //非药品收费项目管理
    //医生排班管理
}
