package com.his.entity;

public class SettleCategory {
    public int id;//id
    public String settleCode;//类别编码
    public String settleName;//类别名称
    public int sequenceNo;//显示顺序号
    public int delMark;//删除标记

    public SettleCategory() {
    }

    public SettleCategory(String settleCode, String settleName, int sequenceNo) {
        this.settleCode = settleCode;
        this.settleName = settleName;
        this.sequenceNo = sequenceNo;
        this.delMark = 1;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSettleCode() {
        return settleCode;
    }

    public void setSettleCode(String settleCode) {
        this.settleCode = settleCode;
    }

    public String getSettleName() {
        return settleName;
    }

    public void setSettleName(String settleName) {
        this.settleName = settleName;
    }

    public int getSequenceNo() {
        return sequenceNo;
    }

    public void setSequenceNo(int sequenceNo) {
        this.sequenceNo = sequenceNo;
    }

    public int getDelMark() {
        return delMark;
    }

    public void setDelMark(int delMark) {
        this.delMark = delMark;
    }
}
