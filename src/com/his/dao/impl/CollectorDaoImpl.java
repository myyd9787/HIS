package com.his.dao.impl;

import com.his.dao.CollectorDao;
import com.his.entity.Collector;
import com.his.entity.Register;
import com.his.util.DBUtil;

import java.sql.Date;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CollectorDaoImpl extends DBUtil implements CollectorDao {
    @Override
    //现场挂号，将挂号类对象存入数据库，并返回结果
    public int save(Collector collector) {
        String sql="INSERT INTO register (`CaseNumber`,`RealName`,`Gender`,`IDnumber`,`BirthDate`,`Age`,`AgeType`," +
                "`HomeAddress`,`VisitDate`,`Noon`,`DeptID`,`UserID`,`RegistLeID`,`SettleID`,`IsBook`," +
                "`RegistTime`,`RegisterID`,`VisitState`) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        try {
//            Date birth = new Date(collector.getBirthDate().getTime());mySql日期转换
            return executeUpdate(sql,collector.getCaseNumber(),collector.getRealName(),collector.getGender(),collector.getIDnumber(),new java.sql.Date(collector.getBirthDate().getTime()),collector.getAge(),
                    collector.getAgeType(),collector.getHomeAddress(),new java.sql.Date(collector.getVisitDate().getTime()),collector.getNoon(),collector.getDeptID(),collector.getUserID(),collector.getRegistLeID(),collector.getSettleID(),collector.getIsBook(),
                   new java.sql.Timestamp(collector.getRegistTime().getTime()) ,collector.getRegisterID(),collector.getVisitState());
        } catch (SQLException e) {
            e.printStackTrace();
            return 0;
        }

    }

    @Override//通过name获取值
    public Collector getCollecttorBycollectname(String CaseNumber, String RealName) throws SQLException {
        String sql= "SELECT `CaseNumber`,`RealName`,`Gender`,`IDnumber`,`BirthDate`,`Age`,`AgeType`,"  +
                                "`HomeAddress`,`VisitDate`,`Noon`,`DeptID`,`UserID`,`RegistLeID`,`SettleID`,`IsBook`," +
                                "`RegistTime`,`RegisterID`,`VisitState` FROM `register` WHERE `CaseNumber` = ? AND `RealName`=? ";
           Collector collector;
           try{
               rs = executeQuery(sql, CaseNumber, RealName);
               collector = null;
               if (rs.next()){
                   collector = new Collector();
                   collector.setCaseNumber(rs.getString("CaseNumber"));
                   collector.setRealName(rs.getString("RealName"));
                   collector.setGender(rs.getString("Gender"));
                   collector.setIDnumber(rs.getString("IDnumber"));
                   collector.setBirthDate(rs.getDate("BirthDate"));
                   collector.setAge(rs.getString("Age"));
                   collector.setAgeType(rs.getString("AgeType"));
                   collector.setHomeAddress(rs.getString("HomeAddress"));
                   collector.setVisitDate(rs.getDate("VisitDate"));
                   collector.setNoon(rs.getString("Noon"));
                   collector.setDeptID(rs.getString("DeptID"));
                   collector.setUserID(rs.getString("UserID"));
                   collector.setRegistLeID(rs.getString("RegistLeID"));
                   collector.setSettleID(rs.getString("SettleID"));
                   collector.setIsBook(rs.getString("IsBook"));
                   collector.setRegistTime(rs.getDate("RegistTime"));
                   collector.setRegistLeID(rs.getString("RegistLeID"));
                   collector.setVisitState(rs.getString("VisitState"));

               }
           }finally {
               closeAll(conn,pstmt,rs);
           }
        return collector;
    }

    @Override//不带分页的列表
    public List<Collector> getCollectorList() throws SQLException {
        List<Collector> collectorList    = new ArrayList<>();
        String sql= "SELECT `CaseNumber`,`RealName`,`Gender`,`IDnumber`,`BirthDate`,`Age`,`AgeType`,"  +
                "`HomeAddress`,`VisitDate`,`Noon`,`DeptID`,`UserID`,`RegistLeID`,`SettleID`,`IsBook`," +
                "`RegistTime`,`RegisterID`,`VisitState` FROM `register` ";
        try{
            rs = executeQuery(sql);
            Collector collector = null;
            while(rs.next()){
                collector = new Collector();
                collector.setCaseNumber(rs.getString("CaseNumber"));
                collector.setRealName(rs.getString("RealName"));
                collector.setGender(rs.getString("Gender"));
                collector.setIDnumber(rs.getString("IDnumber"));
                collector.setBirthDate(rs.getDate("BirthDate"));
                collector.setAge(rs.getString("Age"));
                collector.setAgeType(rs.getString("AgeType"));
                collector.setHomeAddress(rs.getString("HomeAddress"));
                collector.setVisitDate(rs.getDate("VisitDate"));
                collector.setNoon(rs.getString("Noon"));
                collector.setDeptID(rs.getString("DeptID"));
                collector.setUserID(rs.getString("UserID"));
                collector.setRegistLeID(rs.getString("RegistLeID"));
                collector.setSettleID(rs.getString("SettleID"));
                collector.setIsBook(rs.getString("IsBook"));
                collector.setRegistTime(rs.getDate("RegistTime"));
                collector.setRegistLeID(rs.getString("RegistLeID"));
                collector.setVisitState(rs.getString("VisitState"));
                collectorList.add(collector);
            }
        }finally {
            closeAll(conn,pstmt,rs);
        }
        return collectorList;
    }

    @Override//带分页的列表
    public List<Collector> getCollectorListByPage(int currentPage, int pageSize) throws SQLException {
        List<Collector>     collectorList   = new ArrayList<>();
        String sql= "SELECT `CaseNumber`,`RealName`,`Gender`,`IDnumber`,`BirthDate`,`Age`,`AgeType`,"  +
                "`HomeAddress`,`VisitDate`,`Noon`,`DeptID`,`UserID`,`RegistLeID`,`SettleID`,`IsBook`," +
                "`RegistTime`,`RegisterID`,`VisitState` FROM `register` limit ?,?";
        try{
            rs = executeQuery(sql,(currentPage-1)*pageSize,pageSize);
            Collector collector = null;
            while(rs.next()){
                collector = new Collector();
                collector.setCaseNumber(rs.getString("CaseNumber"));
                collector.setRealName(rs.getString("RealName"));
                collector.setGender(rs.getString("Gender"));
                collector.setIDnumber(rs.getString("IDnumber"));
                collector.setBirthDate(rs.getDate("BirthDate"));
                collector.setAge(rs.getString("Age"));
                collector.setAgeType(rs.getString("AgeType"));
                collector.setHomeAddress(rs.getString("HomeAddress"));
                collector.setVisitDate(rs.getDate("VisitDate"));
                collector.setNoon(rs.getString("Noon"));
                collector.setDeptID(rs.getString("DeptID"));
                collector.setUserID(rs.getString("UserID"));
                collector.setRegistLeID(rs.getString("RegistLeID"));
                collector.setSettleID(rs.getString("SettleID"));
                collector.setIsBook(rs.getString("IsBook"));
                collector.setRegistTime(rs.getDate("RegistTime"));
                collector.setRegistLeID(rs.getString("RegistLeID"));
                collector.setVisitState(rs.getString("VisitState"));
                collectorList.add(collector);
            }
        }finally {
            closeAll(conn,pstmt,rs);
        }
        return collectorList;
    }

    @Override//总记录数
    public int getCollectorCount() throws SQLException {
        int count = 0;
        String sql = "SELECT COUNT(id) FROM `register`";
        //try-finally快捷键ctrl+alt+t
        try{
            rs = executeQuery(sql,null);
            if(rs.next()) {
                count = rs.getInt(1);
            }
        }finally{
            closeAll(conn,pstmt,rs);
        }
        return count;
    }

    @Override//删除
    public int delCollectorById(String id) throws Exception {
        String sql = "delete from register where CaseNumber = ? ";
        return  executeUpdate(sql,id);
    }
}
