package com.his.biz.impl;

import com.his.biz.CollectorBiz;
import com.his.dao.impl.CollectorDaoImpl;
import com.his.entity.Register;

public class CollectorBizImpl implements CollectorBiz {
    @Override
    //现场挂号
    public int regist(Register register) {
        return new CollectorDaoImpl().regist(register);
    }
}
