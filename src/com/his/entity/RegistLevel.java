package com.his.entity;

import java.math.BigDecimal;

public class RegistLevel {
    public int id;//id
    public String registCode;//号别编码
    public String registName;//号别名称
    public int sequenceNo;//显示顺序号
    public BigDecimal registFee;//挂号费
    public int registQuota;//挂号限额
    public int delMark;//删除标记

    public RegistLevel() {
    }

    public RegistLevel(String registCode, String registName, int sequenceNo, BigDecimal registFee, int registQuota) {
        this.registCode = registCode;
        this.registName = registName;
        this.sequenceNo = sequenceNo;
        this.registFee = registFee;
        this.registQuota = registQuota;
        this.delMark = 1;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRegistCode() {
        return registCode;
    }

    public void setRegistCode(String registCode) {
        this.registCode = registCode;
    }

    public String getRegistName() {
        return registName;
    }

    public void setRegistName(String registName) {
        this.registName = registName;
    }

    public int getSequenceNo() {
        return sequenceNo;
    }

    public void setSequenceNo(int sequenceNo) {
        this.sequenceNo = sequenceNo;
    }

    public BigDecimal getRegistFee() {
        return registFee;
    }

    public void setRegistFee(BigDecimal registFee) {
        this.registFee = registFee;
    }

    public int getRegistQuota() {
        return registQuota;
    }

    public void setRegistQuota(int registQuota) {
        this.registQuota = registQuota;
    }

    public int getDelMark() {
        return delMark;
    }

    public void setDelMark(int delMark) {
        this.delMark = delMark;
    }
}
