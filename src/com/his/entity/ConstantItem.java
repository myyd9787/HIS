package com.his.entity;
//常数项类
public class ConstantItem {
    public int id;//id
    public int constantTypeID;//所属常数类别ID
    public String contantCode;//常数项编码
    public String constantName;//常数项名称
    public int DelMark;//删除标记  1-正常;0-已删除

    public ConstantItem() {
    }

    public ConstantItem(int id, int constantTypeID, String contantCode, String constantName) {
        this.id = id;
        this.constantTypeID = constantTypeID;
        this.contantCode = contantCode;
        this.constantName = constantName;
        DelMark = 1;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getConstantTypeID() {
        return constantTypeID;
    }

    public void setConstantTypeID(int constantTypeID) {
        this.constantTypeID = constantTypeID;
    }

    public String getContantCode() {
        return contantCode;
    }

    public void setContantCode(String contantCode) {
        this.contantCode = contantCode;
    }

    public String getConstantName() {
        return constantName;
    }

    public void setConstantName(String constantName) {
        this.constantName = constantName;
    }

    public int getDelMark() {
        return DelMark;
    }

    public void setDelMark(int delMark) {
        DelMark = delMark;
    }
}
