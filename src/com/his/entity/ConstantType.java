package com.his.entity;
//常数类型类
public class ConstantType {
    public int id;//id
    public String ConstantTypeCode;//常数类别编码
    public String ConstantTypeName;//常数类别名称
    public int DelMark;//删除标记

    public ConstantType() {
    }

    public ConstantType(int id, String constantTypeCode, String constantTypeName) {
        this.id = id;
        ConstantTypeCode = constantTypeCode;
        ConstantTypeName = constantTypeName;
        DelMark = 1;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getConstantTypeCode() {
        return ConstantTypeCode;
    }

    public void setConstantTypeCode(String constantTypeCode) {
        ConstantTypeCode = constantTypeCode;
    }

    public String getConstantTypeName() {
        return ConstantTypeName;
    }

    public void setConstantTypeName(String constantTypeName) {
        ConstantTypeName = constantTypeName;
    }

    public int getDelMark() {
        return DelMark;
    }

    public void setDelMark(int delMark) {
        DelMark = delMark;
    }
}
