package com.his.entity;

import java.util.Date;
//病历类
public class Register {
    public int id;//id
    public String caseNumber;//病历号
    public String realName;//姓名
    public String gender;//性别
    public String idNumber;//身份证号
    public Date birthDate;//出生日期
    public int age;//年龄
    public String  ageType;//年龄单位(岁,月,天)
    public String homeAddress;//家庭住址
    public Date visitDate;//本次看诊日期
    public String Noon;//午别
    public int deptId;//本次挂号科室ID
    public int userId;//本次挂号医生ID
    public int registLeId;//本次挂号级别ID
    public int settleId;//结算类别ID
    public String isBook;//病历本要否
    public Date registTime;//挂号时间
    public int registerId;//挂号员ID
    public int visitState;//本次看诊状态/*1-已挂号2-医生接诊3-看诊结束4-已退号*/

    public Register() {
    }

    public Register(String caseNumber,String realName, String  gender, String idNumber, Date birthDate, int age, String  ageType, String homeAddress, Date visitDate, String noon, int deptId, int userId, int registLeId, int settleId, String isBook, Date registTime, int registerId, int visitState) {
        this.caseNumber = caseNumber;
        this.realName=realName;
        this.gender = gender;
        this.idNumber = idNumber;
        this.birthDate = birthDate;
        this.age = age;
        this.ageType = ageType;
        this.homeAddress = homeAddress;
        this.visitDate = visitDate;
        Noon = noon;
        this.deptId = deptId;
        this.userId = userId;
        this.registLeId = registLeId;
        this.settleId = settleId;
        this.isBook = isBook;
        this.registTime = registTime;
        this.registerId = registerId;
        this.visitState = visitState;
    }

    public int getId() {
        return id;
    }

    public String getCaseNumber() {
        return caseNumber;
    }

    public String getGender() {
        return gender;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getRealName() {

        return realName;
    }

    public int getAge() {
        return age;

    }

    public String getAgeType() {
        return ageType;
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    public Date getVisitDate() {
        return visitDate;
    }

    public String getNoon() {
        return Noon;
    }

    public int getDeptId() {
        return deptId;
    }

    public int getUserId() {
        return userId;
    }

    public int getRegistLeId() {
        return registLeId;
    }

    public int getSettleId() {
        return settleId;
    }

    public String getIsBook() {
        return isBook;
    }

    public Date getRegistTime() {
        return registTime;
    }

    public int getRegisterId() {
        return registerId;
    }

    public int getVisitState() {
        return visitState;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCaseNumber(String caseNumber) {
        this.caseNumber = caseNumber;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAgeType(String ageType) {
        this.ageType = ageType;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

    public void setVisitDate(Date visitDate) {
        this.visitDate = visitDate;
    }

    public void setNoon(String noon) {
        Noon = noon;
    }

    public void setDeptId(int deptId) {
        this.deptId = deptId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public void setRegistLeId(int registLeId) {
        this.registLeId = registLeId;
    }

    public void setSettleId(int settleId) {
        this.settleId = settleId;
    }

    public void setIsBook(String isBook) {
        this.isBook = isBook;
    }

    public void setRegistTime(Date registTime) {
        this.registTime = registTime;
    }

    public void setRegisterId(int registerId) {
        this.registerId = registerId;
    }

    public void setVisitState(int visitState) {
        this.visitState = visitState;
    }
}
