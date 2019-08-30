package com.his.dao.impl;

import com.his.dao.CollectorDao;
import com.his.entity.Register;
import com.his.util.DBUtil;

import java.sql.SQLException;

public class CollectorDaoImpl extends DBUtil implements CollectorDao {
    @Override
    //现场挂号，将挂号类对象存入数据库，并返回结果
    public int regist(Register register) {
        String sql="INSERT INTO register (`CaseNumber`,`RealName`,`Gender`,`IDnumber`,`BirthDate`,`Age`,`AgeType`," +
                "`HomeAddress`,`VisitDate`,`Noon`,`DeptID`,`UserID`,`RegistLeID`,`SettleID`,`IsBook`," +
                "`RegistTime`,`RegisterID`,`VisitState`) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        try {
            return executeUpdate(sql,register.getCaseNumber(),register.getRealName(),register.getGender(),register.getIdNumber(),register.getBirthDate(),register.getAge(),
                    register.getHomeAddress(),register.getVisitDate(),register.getNoon(),register.getDeptId(),register.getRegistLeId(),register.getSettleId(),register.getIsBook(),
                    register.getRegistTime(),register.getRegisterId(),register.getVisitState());
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }
}
