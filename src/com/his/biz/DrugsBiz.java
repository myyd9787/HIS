package com.his.biz;

import com.his.entity.Drugs;

import java.sql.Date;
import java.util.List;

public interface DrugsBiz {

    //根据病历号和看诊时间查询所需的药品
    List<Drugs> getFaYao(String caseNumber,Date visitDate);
    //刷新显示所有药品，分页显示
    List<Drugs> getDrugs(int drugsPage,int drugsLimit);
    //查询列数
    int getCount();
    //根据药品助记码查询药品
    Drugs getDrugsByCode(String mnemonicCode);
    //新增药品
    int save(Drugs drugs);
    //删除药品
    int delete(int drugsID);
    //编辑药品
    int updata(Drugs drugs,int drugsID);
}
