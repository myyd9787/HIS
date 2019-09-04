package com.his.entity;


import java.util.Objects;

//科室类
//@Entity
public class Department {
    public int id;//id
    public String deptCode;//科室编码
    public String deptName;//科室名称
    public int deptCategoryID;//科室分类
    public int deptType;//科室类型

    public void setDeptType(Integer deptType) {
        this.deptType = deptType;
    }

    int delMark;//删除标记

    public Department() {
    }

    public Department(String deptCode, String deptName, int deptCategoryID, int deptType) {
        this.deptCode = deptCode;
        this.deptName = deptName;
        this.deptCategoryID = deptCategoryID;
        this.deptType = deptType;
        this.delMark = 1;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

//    @javax.persistence.Basic
//    @javax.persistence.Column(name = "DeptName")
    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public int getDeptCategoryID() {
        return deptCategoryID;
    }

    public void setDeptCategoryID(int deptCategoryID) {
        this.deptCategoryID = deptCategoryID;
    }

//    @Basic
//    @javax.persistence.Column(name = "DeptType")
    public int getDeptType() {
        return deptType;
    }

    public void setDeptType(int deptType) {
        this.deptType = deptType;
    }

    public int getDelMark() {
        return delMark;
    }

    public void setDelMark(int delMark) {
        this.delMark = delMark;
    }

    private int deptCategoryId;


    public int getDeptCategoryId() {
        return deptCategoryId;
    }

    public void setDeptCategoryId(int deptCategoryId) {
        this.deptCategoryId = deptCategoryId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Department that = (Department) o;
        return id == that.id &&
                deptType == that.deptType &&
                delMark == that.delMark &&
                deptCategoryId == that.deptCategoryId &&
                Objects.equals(deptCode, that.deptCode) &&
                Objects.equals(deptName, that.deptName);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, deptCode, deptName, deptCategoryId, deptType, delMark);
    }
}
