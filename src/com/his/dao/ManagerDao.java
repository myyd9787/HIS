package com.his.dao;

import com.his.entity.*;

import java.sql.SQLException;
import java.util.List;

public interface ManagerDao {
    //常数类别管理
    //1.1查询所有常数类别
    List<ConstantType> getConstantTypeList() throws SQLException;
    //1.1.1 模糊查询所有符合条件的常数类别  当查询条件为constantTypeCode时
    List<ConstantType> getConstantTypeListByConstantTypeCode(String constantTypeCode) throws SQLException;
    //1.1.2模糊查询所有符合条件的常数类别 当查询条件为constantTypeName时
    List<ConstantType> getConstantTypeListByConstantTypeName(String constantTypeCode) throws SQLException;
    //1.2 新增常数类别
    int addConstantType(ConstantType constantType) throws SQLException;
    //1.3 查询常数项列表
    List<ConstantItem> getConstantItemList() throws SQLException;
    //1.4 新增常数项
    int addConstantItem(ConstantItem constantItem) throws SQLException;
    //批量删除常数项 把选中项的id作为数组传入
    int delConstantItem(int [] ids) throws SQLException;
    //科室管理
    //2.1 查询所有科室信息
    List<Department> getDepartmentList() throws SQLException;
    //2.1.2 根据科室名称查询科室信息
    List<Department> getDepartmentListByDeptName(String deptName) throws SQLException;
    //2.1.3 根据科室编号查询科室信息
    List<Department> getDepartmentListByDeptCode(String deptCode) throws SQLException;
    //2.2 新增科室
    int addDepartment(Department department) throws SQLException;
    //2.3 编辑科室
    int updateDepartment(Department department) throws SQLException;
    //2.4 批量删除科室
    int delDepartments(int [] ids) throws SQLException;
    //用户管理
    //3.1 查询所有用户信息
    List<User> getUserList() throws SQLException;
    //3.1.2 根据登陆名称查询用户信息
    List<User> getUserListByUserName(String userName) throws SQLException;
    //3.1.3 根据姓名查询用户信息
    List<User> getUserListByRealName(String realName) throws SQLException;
    //3.2 新增用户
    int addUser(User user) throws SQLException;
    //3.3 编辑用户
    int updateUser(User user) throws SQLException;
    //3.4 批量删除用户
    int delUsers(int [] ids) throws SQLException;
    //挂号级别管理
    //4.1.1 显示挂号级别列表
    List<RegistLevel> getRegistLevel() throws SQLException;
    //4.1.2 根据挂号级别编码查询挂号级别列表
    List<RegistLevel>getRegistLevelByRegistCode(String registCode) throws SQLException;
    //4.1.3 根据挂号级别名称查询挂号级别列表
    List<RegistLevel>getRegistLevelByRegistName(String registName) throws SQLException;
    //4.2 新增挂号级别
    int addRegistLevel(RegistLevel registLevel) throws SQLException;
    //4.3 编辑挂号级别
    int updateRegistLevel(RegistLevel registLevel) throws SQLException;
    //4.4 删除挂号级别
    int delRegistLevelById(int id) throws SQLException;
    //结算类别管理
    //5.1 显示所有结算类别
    List<FmedItem>  getFmedItemList() throws SQLException;
    //5.2 增加结算类别
    int addFmeditem(FmedItem fmedItem) throws SQLException;
    //5.3 修改结算类别
    int updateFmeditem(FmedItem fmedItem) throws SQLException;
    //5.4 删除结算类别
    int delFmeditem(int id) throws SQLException;
    //诊断目录管理
    //6.1 显示所有诊断目录
    //6.2 增加诊断目录
    //6.3 修改诊断目录
    //6.4 删除诊断目录
    //非药品收费项目管理
    //7.1 显示所有非药品收费项目
    //7.2 增加非药品收费项目
    //7.3 修改非药品收费项目
    //7.4 删除非药品收费项目
    //医生排班管理
    //8.1 显示所有医生排班
    //8.2 增加医生排班
    //8.3 修改医生排班
    //8.4 删除医生排班
}
