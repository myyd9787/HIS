package com.his.biz.impl;

import com.his.biz.DrugsBiz;
import com.his.dao.DrugsDao;
import com.his.dao.impl.DrugsDaoImpl;
import com.his.entity.Drugs;
import com.his.util.DBUtil;

import java.sql.Date;
import java.sql.SQLException;
import java.util.List;

public class DrugsBizImpl extends DBUtil implements DrugsBiz {
    DrugsDao drugsDao = new DrugsDaoImpl();
    @Override
    //根据病历号和看诊时间查询所需的药品
    public List<Drugs> getFaYao(String caseNumber, Date visitDate) {
        try {
            return drugsDao.getFaYao(caseNumber,visitDate);
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    //刷新显示所有药品，分页显示
    public List<Drugs> getDrugs(int drugsPage,int drugsLimit) {
        try {
            return drugsDao.getDrugs(drugsPage,drugsLimit);
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    //查询列数
    public int getCount() {
        try {
            return drugsDao.getCount();
        } catch (SQLException e) {
            e.printStackTrace();
            return 0;
        }
    }

    @Override
    //根据药品助记码查询药品
    public Drugs getDrugsByCode(String mnemonicCode) {
        try {
            return drugsDao.getDrugsByCode(mnemonicCode);
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    //新增药品
    public int save(Drugs drugs) {
        try {
            return drugsDao.save(drugs);
        } catch (SQLException e) {
            e.printStackTrace();
            return 0;
        }
    }

    @Override
    //删除药品
    public int delete(int drugsID) {
        try {
            return drugsDao.delete(drugsID);
        } catch (SQLException e) {
            e.printStackTrace();
            return 0;
        }
    }

    @Override
    //编辑药品
    public int updata(Drugs drugs,int drugsID) {
        try {
            return drugsDao.updata(drugs,drugsID);
        } catch (SQLException e) {
            e.printStackTrace();
            return 0;
        }
    }
}
