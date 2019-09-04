package com.his.dao.impl;

import com.his.dao.DrugsDao;
import com.his.entity.Drugs;
import com.his.util.DBUtil;

import java.sql.Date;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DrugsDaoImpl extends DBUtil implements DrugsDao {
    @Override
    //根据病历号和看诊时间查询所需的药品
    public List<Drugs> getFaYao(String caseNumber,Date visitDate) throws SQLException {
        return null;
    }

    @Override
    //刷新显示所有药品，渲染页面
    public List<Drugs> getDrugs(int drugsPage,int drugsLimit) throws SQLException {
        List<Drugs> drugsList = new ArrayList<>();
        Drugs drugs;
        String sql = "select  id ,`DrugsCode`,`DrugsName`,`DrugsFormat`,`DrugsUnit`,`DrugsPrice`,`DrugsDosageID`,`DrugsTypeID`"
                +"from `drugs` order by CreationDate desc limit ?,?";
        try {
            rs = executeQuery(sql,(drugsPage-1)*drugsLimit,drugsLimit);
            while (rs.next()){
                drugs = new Drugs();
                drugs.setId(rs.getInt("id"));
                drugs.setDrugsCode(rs.getString("DrugsCode"));
                drugs.setDrugsName(rs.getString("DrugsName"));
                drugs.setDrugsFormat(rs.getString("DrugsFormat"));
                drugs.setDrugsUnit(rs.getString("DrugsUnit"));
                drugs.setDrugsPrice(rs.getDouble("DrugsPrice"));
                drugs.setDrugsDosageId(rs.getInt("DrugsDosageID"));
                drugs.setDrugsTypeId(rs.getInt("DrugsTypeID"));
                drugsList.add(drugs);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            closeAll(conn,pstmt,rs);
        }
        return drugsList;
    }

    @Override
    //查询列数
    public int getCount() throws SQLException {
        int result = 0;
        String sql = "select count(id) from `drugs`";
        rs = executeQuery(sql,null);
        if (rs.next()){
            result = rs.getInt(1);
        }
        return result;
    }

    @Override
    //根据药品助记码查询药品
    public Drugs getDrugsByCode(String mnemonicCode) throws SQLException {
        Drugs drugs = null;
        String sql = "select `DrugsCode`,`DrugsName`,`DrugsFormat`,`DrugsUnit`,`DrugsPrice`,`DrugsDosageID`,`DrugsTypeID`"
                +"from `drugs` where `MnemonicCode`=?";
        rs = executeQuery(sql,mnemonicCode);
        if (rs.next()){
            drugs = new Drugs();
            drugs.setDrugsCode(rs.getString("DrugsCode"));
            drugs.setDrugsName(rs.getString("DrugsName"));
            drugs.setDrugsFormat(rs.getString("DrugsFormat"));
            drugs.setDrugsUnit(rs.getString("DrugsUnit"));
            drugs.setDrugsPrice(rs.getDouble("DrugsPrice"));
            drugs.setDrugsDosageId(rs.getInt("DrugsDosageID"));
            drugs.setDrugsTypeId(rs.getInt("DrugsTypeID"));
        }
        closeAll(conn,pstmt,rs);
        return drugs;
    }

    @Override
    //新增药品
    public int save(Drugs drugs) throws SQLException {
        String sql = "insert into `drugs`(`DrugsCode`,`DrugsName`,`MnemonicCode`,"
                +"`DrugsFormat`,`DrugsUnit`,`DrugsPrice`,`DrugsDosageID`,`DrugsTypeID`,CreationDate)"
                +"values(?,?,?,?,?,?,?,?,NOW())";
        return executeUpdate(sql,drugs.getDrugsCode(),drugs.getDrugsName(),drugs.getMnemonicCode(),
                drugs.getDrugsFormat(),drugs.getDrugsUnit(),drugs.getDrugsPrice(),drugs.getDrugsDosageId(),drugs.getDrugsTypeId());
    }

    @Override
    //删除药品
    public int delete(int drugsID) throws SQLException {
        String sql = "delete from `drugs` where `ID`=?";
        return executeUpdate(sql,drugsID);
    }

    @Override
    //编辑药品
    public int updata(Drugs drugs,int drugsID) throws SQLException {
        String sql = "updata `drugs` set `DrugsCode`=?,`DrugsName`=?,`MnemonicCode`=?,"
                       +"`DrugsFormat`=?,`DrugsUnit`=?,`DrugsPrice`=?,`DrugsDosageID`=?,`DrugsTypeID`=?"
                        +"where `ID`=?";
        return executeUpdate(sql,drugs.getDrugsCode(),drugs.getDrugsName(),drugs.getMnemonicCode(),
                drugs.getDrugsFormat(),drugs.getDrugsUnit(),drugs.getDrugsPrice(),drugs.getDrugsDosageId(),drugs.getDrugsTypeId(),drugsID);
    }
}
