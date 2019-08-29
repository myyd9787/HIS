package com.his.dao.impl;

import com.his.dao.ManagerDao;
import com.his.entity.*;
import com.his.util.DBUtil;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ManagerDaoImpl extends DBUtil implements ManagerDao {
    @Override
    //查询所有常数类别
    public List<ConstantType> getConstantTypeList() throws SQLException {
        String sql="SELECT `ID`,`ConstantTypeCode`,`ConstantTypeName`,`DelMark` FROM constanttype";
        rs=executeQuery(sql,null);
        List<ConstantType> constantTypeList= new ArrayList<ConstantType>();
        ConstantType constantType=null;
        try {
            while(rs.next()){
                constantType=new ConstantType();
                constantType.setId(rs.getInt("ID"));
                constantType.setConstantTypeCode(rs.getString("ConstantTypeCode"));
                constantType.setConstantTypeName(rs.getString("ConstantTypeName"));
                constantType.setDelMark(rs.getInt("DelMark"));
                constantTypeList.add(constantType);
            }
        } finally {
            closeAll(conn,pstmt,rs);
        }
        return constantTypeList;
    }

    @Override
    //模糊查询所有符合条件的常数类别 当查询条件为constantTypeCode时
    public List<ConstantType> getConstantTypeListByConstantTypeCode(String constantTypeCode) throws SQLException {
        String sql="SELECT `ID`,`ConstantTypeCode`,`ConstantTypeName`,`DelMark` FROM constanttype WHERE ConstantTypeCode LIKE '%?%'";
        rs=executeQuery(sql,constantTypeCode);
        List<ConstantType> constantTypeList= new ArrayList<ConstantType>();
        ConstantType constantType=null;
        try {
            while(rs.next()){
                constantType=new ConstantType();
                constantType.setId(rs.getInt("ID"));
                constantType.setConstantTypeCode(rs.getString("ConstantTypeCode"));
                constantType.setConstantTypeName(rs.getString("ConstantTypeName"));
                constantType.setDelMark(rs.getInt("DelMark"));
                constantTypeList.add(constantType);
            }
        } finally {
            closeAll(conn,pstmt,rs);
        }
        return constantTypeList;
    }
    //模糊查询所有符合条件的常数类别 当查询条件为constantTypeName时
    public List<ConstantType> getConstantTypeListByConstantTypeName(String constantTypeName) throws SQLException {
        String sql="SELECT `ID`,`ConstantTypeCode`,`ConstantTypeName`,`DelMark` FROM constanttype WHERE ConstantTypeName LIKE '%?%'";
        rs=executeQuery(sql,constantTypeName);
        List<ConstantType> constantTypeList= new ArrayList<ConstantType>();
        ConstantType constantType=null;
        try {
            while(rs.next()){
                constantType=new ConstantType();
                constantType.setId(rs.getInt("ID"));
                constantType.setConstantTypeCode(rs.getString("ConstantTypeCode"));
                constantType.setConstantTypeName(rs.getString("ConstantTypeName"));
                constantType.setDelMark(rs.getInt("DelMark"));
                constantTypeList.add(constantType);
            }
        } finally {
            closeAll(conn,pstmt,rs);
        }
        return constantTypeList;
    }

    @Override
    //新增常数类别
    public int addConstantType(ConstantType constantType) throws SQLException {
        String sql="INSERT INTO constanttype (`ConstantTypeCode`,`ConstantTypeName`) VALUES(?,?)";
        return executeUpdate(sql,constantType.getConstantTypeCode(),constantType.getConstantTypeName());
    }

    @Override
    //查询所有常数项列表
    public List<ConstantItem> getConstantItemList() throws SQLException {
        String sql="SELECT `ID`,`ConstantTypeID`,`ConstantCode`,`ConstantName` FROM `constantitem`";
        rs=executeQuery(sql,null);
        List<ConstantItem> constantItemList= new ArrayList<ConstantItem>();
        ConstantItem constantItem=null;
        try {
            while(rs.next()){
                constantItem=new ConstantItem();
                constantItem.setId(rs.getInt("ID"));
                constantItem.setConstantTypeID(rs.getInt("ConstantTypeID"));
                constantItem.setContantCode(rs.getString("ConstantCode"));
                constantItem.setConstantName(rs.getString("ConstantName"));
                constantItemList.add(constantItem);
            }
        } finally {
            closeAll(conn,pstmt,rs);
        }
        return constantItemList;
    }

    @Override
    //新增常数项
    public int addConstantItem(ConstantItem constantItem) throws SQLException {
        String sql="INSERT INTO `constantitem` (`ConstantTypeID`,`ConstantCode`,`ConstantName`)VALUES(?,?,?)";
        return executeUpdate(sql,constantItem.getConstantTypeID(),constantItem.getContantCode(),constantItem.getConstantName());
    }

    @Override
    //批量删除常数项
    public int delConstantItem(int[] ids) throws SQLException {
        String param = Arrays.toString(ids).replace("[", "(").replace("]", ")");
        String sql = "delete from constantitem where id in " + param;
        return executeUpdate(sql);
    }

    @Override
    //2.1 查询所有科室信息
    public List<Department> getDepartmentList() throws SQLException {
        String sql="SELECT `ID`,`DeptCode`,`DeptName`,`DeptCategoryID`,`DeptType` FROM `department`";
        rs=executeQuery(sql,null);
        List<Department> departmentList= new ArrayList<Department>();
        Department department=null;
        try {
            while(rs.next()){
                department=new Department();
                department.setId(rs.getInt("ID"));
                department.setDeptCode(rs.getString("DeptCode"));
                department.setDeptName(rs.getString("DeptName"));
                department.setDeptCategoryID(rs.getInt("DeptCategoryID"));
                department.setDeptType(rs.getInt("DeptType"));
                departmentList.add(department);
            }
        } finally {
            closeAll(conn,pstmt,rs);
        }
        return departmentList;
    }

    @Override
    //2.1.2 根据科室名称查询科室信息
    public List<Department> getDepartmentListByDeptName(String deptName) throws SQLException {
        String sql="`ID`,`DeptCode`,`DeptName`,`DeptCategoryID`,`DeptType` FROM `department` WHERE `DeptName` LIKE '%?%'";
        rs=executeQuery(sql,deptName);
        List<Department> departmentList= new ArrayList<Department>();
        Department department=null;
        try {
            while(rs.next()){
                department=new Department();
                department.setId(rs.getInt("ID"));
                department.setDeptCode(rs.getString("DeptCode"));
                department.setDeptName(rs.getString("DeptName"));
                department.setDeptCategoryID(rs.getInt("DeptCategoryID"));
                department.setDeptType(rs.getInt("DeptType"));
                departmentList.add(department);
            }
        } finally {
            closeAll(conn,pstmt,rs);
        }
        return departmentList;
    }

    @Override
    //2.1.3 根据科室编号查询科室信息
    public List<Department> getDepartmentListByDeptCode(String deptCode) throws SQLException {
        String sql="`ID`,`DeptCode`,`DeptName`,`DeptCategoryID`,`DeptType` FROM `department` WHERE `DeptCode` LIKE '%?%'";
        rs=executeQuery(sql,deptCode);
        List<Department> departmentList= new ArrayList<Department>();
        Department department=null;
        try {
            while(rs.next()){
                department=new Department();
                department.setId(rs.getInt("ID"));
                department.setDeptCode(rs.getString("DeptCode"));
                department.setDeptName(rs.getString("DeptName"));
                department.setDeptCategoryID(rs.getInt("DeptCategoryID"));
                department.setDeptType(rs.getInt("DeptType"));
                departmentList.add(department);
            }
        } finally {
            closeAll(conn,pstmt,rs);
        }
        return departmentList;
    }

    @Override
    //2.2 新增科室
    public int addDepartment(Department department) throws SQLException {
        String sql="INSERT INTO department (`DeptCode`,`DeptName`,`DeptCategoryID`,`DeptType`) VALUES(?,?,?,?)";
        return executeUpdate(sql,department.getDeptCode(),department.getDeptName(),department.getDeptCategoryID(),department.getDeptType());
    }

    @Override
    //2.3 编辑科室
    public int updateDepartment(Department department) throws SQLException {
        String sql="UPDATE department SET`DeptCode`=?,`DeptName`=?,`DeptCategoryID`=?,`DeptType`=?  WHERE ID=?";

        return executeUpdate(sql,department.getDeptCode(),department.getDeptName(),department.getDeptCategoryID(),department.getDeptType());
    }

    @Override
    //2.4 批量删除科室
    public int delDepartments(int[] ids) throws SQLException {
        String param = Arrays.toString(ids).replace("[", "(").replace("]", ")");
        String sql = "delete from department where id in " + param;
        return executeUpdate(sql);
    }

    @Override
    //3.1 查询所有用户信息
    public List<User> getUserList() throws SQLException {
        List<User> userList=new ArrayList<>();
        User user=null;
        String sql="SELECT `ID`,`UserName`,`RealName`,`UseType`,`DocTitleID`,`DeptID`,`RegistLeID` FROM `user`";
        rs=executeQuery(sql);
        while(rs.next()){
            user=new User();
            user.setId(rs.getInt("ID"));
            user.setUserName(rs.getString("UserName"));
            user.setRealName(rs.getString("RealName"));
            user.setUseType(rs.getInt("UseType"));
            user.setDocTitleID(rs.getInt("DocTitleID"));
            user.setDeptNo(rs.getInt("DeptID"));
            user.setRegistLeID(rs.getInt("RegistLeID"));
            userList.add(user);
        }
        return userList;
    }

    @Override
    //3.1.2 根据登陆名称查询用户信息
    public List<User> getUserListByUserName(String userName) throws SQLException {
        List<User> userList=new ArrayList<>();
        User user=null;
        String sql="SELECT `ID`,`UserName`,`RealName`,`UseType`,`DocTitleID`,`DeptID`,`RegistLeID` FROM `user` where UserName LIKE '%?%'";
        rs=executeQuery(sql,userName);
        while(rs.next()){
            user=new User();
            user.setId(rs.getInt("ID"));
            user.setUserName(rs.getString("UserName"));
            user.setRealName(rs.getString("RealName"));
            user.setUseType(rs.getInt("UseType"));
            user.setDocTitleID(rs.getInt("DocTitleID"));
            user.setDeptNo(rs.getInt("DeptID"));
            user.setRegistLeID(rs.getInt("RegistLeID"));
            userList.add(user);
        }
        return userList;
    }

    @Override
    //3.1.3 根据姓名查询用户信息
    public List<User> getUserListByRealName(String realName) throws SQLException {
        List<User> userList=new ArrayList<>();
        User user=null;
        String sql="SELECT `ID`,`UserName`,`RealName`,`UseType`,`DocTitleID`,`DeptID`,`RegistLeID` FROM `user` where RealName LIKE '%?%'";
        rs=executeQuery(sql,realName);
        while(rs.next()){
            user=new User();
            user.setId(rs.getInt("ID"));
            user.setUserName(rs.getString("UserName"));
            user.setRealName(rs.getString("RealName"));
            user.setUseType(rs.getInt("UseType"));
            user.setDocTitleID(rs.getInt("DocTitleID"));
            user.setDeptNo(rs.getInt("DeptID"));
            user.setRegistLeID(rs.getInt("RegistLeID"));
            userList.add(user);
        }
        return userList;
    }

    @Override
    //3.2 新增用户
    public int addUser(User user) throws SQLException {
        String sql="INSERT INTO USER (`UserName`,`Password`,`RealName`,`UseType`,`DocTitleID`,`IsScheduling`,`DeptID`,`RegistLeID`,`DelMark`) VALUES(?,?,?,?,?,?,?,?,?)";
        return executeUpdate(sql,user.getUserName(),user.getPassWord(),user.getRealName(),user.getUseType(),user.getDocTitleID(),user.getIsScheduling(),
        user.getDeptNo(),user.getRegistLeID(),user.getDelMark());
    }

    @Override
    //3.3 编辑用户
    public int updateUser(User user) throws SQLException {
        String sql="UPDATE USER SET `UserName`=?,`Password`=?,`RealName`=?,`UseType`=?,`DocTitleID`=?,`IsScheduling`=?,`DeptID`=?,`RegistLeID`=?";
        return executeUpdate(sql,user.getUserName(),user.getPassWord(),user.getRealName(),user.getUseType(),user.getDocTitleID(),user.getIsScheduling(),
                user.getDeptNo(),user.getRegistLeID());
    }

    @Override
    //3.4 批量删除用户
    public int delUsers(int[] ids) throws SQLException {
        String param = Arrays.toString(ids).replace("[", "(").replace("]", ")");
        String sql = "delete from user where id in " + param;
        return executeUpdate(sql);
    }

    @Override
    //4.1.1 显示挂号级别列表
    public List<RegistLevel> getRegistLevel() throws SQLException {
        List<RegistLevel> registLevelList=new ArrayList<>();
        RegistLevel registLevel=null;
        String sql="SELECT `ID`,`RegistCode`,`RegistName`,`SequenceNo`,`RegistFee`,`RegistQuota` FROM `registlevel`";
        rs=executeQuery(sql);
        while(rs.next()){
            registLevel=new RegistLevel();
            registLevel.setId(rs.getInt("ID"));
            registLevel.setRegistCode(rs.getString("RegistCode"));
            registLevel.setRegistName(rs.getString("RegistName"));
            registLevel.setSequenceNo(rs.getInt("SequenceNo"));
            registLevel.setRegistFee(rs.getBigDecimal("RegistFee"));
            registLevel.setRegistQuota(rs.getInt("RegistQuota"));
            registLevelList.add(registLevel);
        }
        return registLevelList;
    }

    @Override
    //4.1.2 根据挂号级别编码查询挂号级别列表
    public List<RegistLevel> getRegistLevelByRegistCode(String registCode) throws SQLException {
        List<RegistLevel> registLevelList=new ArrayList<>();
        RegistLevel registLevel=null;
        String sql="SELECT `ID`,`RegistCode`,`RegistName`,`SequenceNo`,`RegistFee`,`RegistQuota` FROM `registlevel` where RegistCode like '%?%'";
        rs=executeQuery(sql,registCode);
        while(rs.next()){
            registLevel=new RegistLevel();
            registLevel.setId(rs.getInt("ID"));
            registLevel.setRegistCode(rs.getString("RegistCode"));
            registLevel.setRegistName(rs.getString("RegistName"));
            registLevel.setSequenceNo(rs.getInt("SequenceNo"));
            registLevel.setRegistFee(rs.getBigDecimal("RegistFee"));
            registLevel.setRegistQuota(rs.getInt("RegistQuota"));
            registLevelList.add(registLevel);
        }
        return registLevelList;
    }

    @Override
    //4.1.3 根据挂号级别名称查询挂号级别列表
    public List<RegistLevel> getRegistLevelByRegistName(String registName) throws SQLException {
        List<RegistLevel> registLevelList=new ArrayList<>();
        RegistLevel registLevel=null;
        String sql="SELECT `ID`,`RegistCode`,`RegistName`,`SequenceNo`,`RegistFee`,`RegistQuota` FROM `registlevel` where RegistName like '%?%'";
        rs=executeQuery(sql,registName);
        while(rs.next()){
            registLevel=new RegistLevel();
            registLevel.setId(rs.getInt("ID"));
            registLevel.setRegistCode(rs.getString("RegistCode"));
            registLevel.setRegistName(rs.getString("RegistName"));
            registLevel.setSequenceNo(rs.getInt("SequenceNo"));
            registLevel.setRegistFee(rs.getBigDecimal("RegistFee"));
            registLevel.setRegistQuota(rs.getInt("RegistQuota"));
            registLevelList.add(registLevel);
        }
        return registLevelList;
    }

    @Override
    //4.2 新增挂号级别
    public int addRegistLevel(RegistLevel registLevel) throws SQLException {
        String sql="INSERT INTO `registlevel` (`RegistCode`,`RegistName`,`SequenceNo`,`RegistFee`,`RegistQuota`,`DelMark`) VALUES(?,?,?,?,?,?)";
        return executeUpdate(sql,registLevel.getRegistCode(),registLevel.getRegistName(),registLevel.getSequenceNo(),registLevel.getRegistFee(),registLevel.getRegistQuota(),registLevel.getDelMark());
    }

    @Override
    //4.3 编辑挂号级别
    public int updateRegistLevel(RegistLevel registLevel) throws SQLException {
        String sql="UPDATE `registlevel` SET `RegistCode`=?,`RegistName`=?,`SequenceNo`=?,`RegistFee`=?,`RegistQuota`=?";
        return executeUpdate(sql,registLevel.getRegistCode(),registLevel.getRegistName(),registLevel.getSequenceNo(),registLevel.getRegistFee(),registLevel.getRegistQuota());
    }

    @Override
    //4.4 删除挂号级别
    public int delRegistLevelById(int id) throws SQLException {
        String sql="DELETE FROM `registlevel` WHERE `ID`=?";
        return executeUpdate(sql,id);
    }

    @Override
    //5.1 显示所有结算类别
    public List<FmedItem> getFmedItemList() throws SQLException {
        String sql="SELECT `ID`,`ItemCode`,`ItemName`,`Format`,`Price`,`ExpClassID`,`DeptID`,`MnemonicCode`,`CreationDate`,`LastUpdateDate`,`RecordType` FROM `fmeditem`";
        List<FmedItem> fmedItemList=new ArrayList<>();
        FmedItem fmedItem=null;
        rs=executeQuery(sql);
        while(rs.next()){
            fmedItem=new FmedItem();
            fmedItem.setId(rs.getInt("ID"));
            fmedItem.setItemCode(rs.getString("ItemCode"));
            fmedItem.setItemName(rs.getString("ItemName"));
            fmedItem.setFormat(rs.getString("Format"));
            fmedItem.setPrice(rs.getBigDecimal("Price"));
            fmedItem.setExpClassID(rs.getInt("ExpClassID"));
            fmedItem.setMnemonicCode(rs.getString("MnemonicCode"));
            fmedItem.setCreationDate(rs.getDate("CreationDate"));
            fmedItem.setLastUpdateDate(rs.getDate("LastUpdateDate"));
            fmedItem.setRecordType(rs.getInt("RecordType"));
            fmedItemList.add(fmedItem);
        }
        return fmedItemList;
    }

    @Override
    //5.2 增加结算类别
    public int addFmeditem(FmedItem fmedItem) throws SQLException {
        String sql="INSERT INTO `fmeditem` (`ItemCode`,`ItemName`,`Format`,`Price`,`ExpClassID`,`DeptID`,`MnemonicCode`,`CreationDate`,`LastUpdateDate`,`RecordType`,`DelMark`)\n" +
                "VALUES(?,?,?,?,?,?,?,?,?,?,1)";
        return executeUpdate(sql,fmedItem.getItemCode(),fmedItem.getItemName(),fmedItem.getFormat(),fmedItem.getPrice(),fmedItem.getExpClassID(),fmedItem.getDeptID(),
                fmedItem.getMnemonicCode(),fmedItem.getCreationDate(),fmedItem.getLastUpdateDate(),fmedItem.getRecordType(),fmedItem.getDelMark());
    }

    @Override
    //5.3 修改结算类别
    public int updateFmeditem(FmedItem fmedItem) throws SQLException {
        String sql="UPDATE `fmeditem` SET `ItemCode`=?,`ItemName`=?,`Format`=?,`Price`=?,`ExpClassID`=?,`DeptID`=?,`MnemonicCode`=?,`CreationDate`=?,`LastUpdateDate`=?,`RecordType`=?";
        return executeUpdate(sql,fmedItem.getItemCode(),fmedItem.getItemName(),fmedItem.getFormat(),fmedItem.getPrice(),fmedItem.getExpClassID(),fmedItem.getDeptID(),
                fmedItem.getMnemonicCode(),fmedItem.getCreationDate(),fmedItem.getLastUpdateDate(),fmedItem.getRecordType());
    }

    @Override
    //5.4 删除结算类别
    public int delFmeditem(int id) throws SQLException {
        String sql="DELETE FROM `fmeditem` WHERE id=?";
        return executeUpdate(sql);
    }


}
