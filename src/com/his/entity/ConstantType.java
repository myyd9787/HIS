package com.his.entity;
//常数类型类
public class ConstantType {
    public int id;//id
    public String constantTypeCode;//常数类别编码
    public String constantTypeName;//常数类别名称
    public int delMark;//删除标记

    public ConstantType() {
    }

    public ConstantType( String constantTypeCode, String constantTypeName) {

        this.constantTypeCode = constantTypeCode;
        this.constantTypeName = constantTypeName;
        delMark = 1;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getConstantTypeCode() {
        return constantTypeCode;
    }

    public void setConstantTypeCode(String constantTypeCode) {
        this.constantTypeCode = constantTypeCode;
    }

    public String getConstantTypeName() {
        return constantTypeName;
    }

    public void setConstantTypeName(String constantTypeName) {
        this.constantTypeName = constantTypeName;
    }

    public int getDelMark() {
        return delMark;
    }

    public void setDelMark(int delMark) {
        this.delMark = delMark;
    }
}
