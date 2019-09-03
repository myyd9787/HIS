package com.his.biz;

import com.his.entity.ConstantItem;
import com.his.entity.ConstantType;
import com.his.entity.UserDetail;

import java.util.List;

public interface ManagerBiz {
    //常数类别管理
    //1.1查询所有常数类别
    List<ConstantType> getConstantTypeList();
    //1.1.1 模糊查询所有符合条件的常数类别  当查询条件为constantTypeCode时
    List<ConstantType> getConstantTypeListByConstantTypeCode(String constantTypeCode);
    //1.1.2模糊查询所有符合条件的常数类别 当查询条件为constantTypeName时
    List<ConstantType> getConstantTypeListByConstantTypeName(String constantTypeName);
    //新增常数项类别
    int addConstantType(ConstantType constantType);
    //修改常数项
    int updateConstantItem(ConstantItem constantItem, int oldID);
    //删除常数项
    int delConstantItemById(int newId);
    //查询所有常数项列表
    List<ConstantItem> getConstantItemList();
    //科室管理
    //用户管理
    //获取前台需要显示的所有用户详细信息
    public List<UserDetail> getUserDetailList();
    //挂号级别管理
    //结算类别管理
    //诊断目录管理
    //非药品收费项目管理
    //医生排班管理
}
