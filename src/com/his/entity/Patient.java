package com.his.entity;

import java.util.Date;

public class Patient {
    public String caseNumber;//病历号
    public String realName;//姓名
    public int invoiceNum;//发票号
    public int age;//年龄
    public int settleID;//结算类别
    public int deptID;//挂号科室ID
    public int prescriptionState;//处方状态
    public Date visitDate;//看诊日期
    public int userID;//开立医生
    public String name;//检查名称
    public int num;//数量
    public String danwei = "次";//单位
    public String position;//检查部位
    public int price;//单价
    public int sum;//总价
    public int state;//状态
    public Patient(){
    }
    public Patient(String caseNumber, String realName, int invoiceNum, int age, int settleID, int deptID, int prescriptionState, Date visitDate, int userID, String name, int num, String danwei,String position, int price, int sum, int state){
        this.caseNumber=caseNumber;
        this.realName=realName;
        this.invoiceNum=invoiceNum;
        this.age=age;
        this.settleID=settleID;
        this.deptID=deptID;
        this.prescriptionState=prescriptionState;
        this.visitDate=visitDate;
        this.userID=userID;
        this.name=name;
        this.num=num;
        this.danwei=danwei;
        this.position=position;
        this.price=price;
        this.sum=sum;
        this.state=state;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }


    public String getCaseNumber() {
        return caseNumber;
    }

    public void setCaseNumber(String caseNumber) {
        this.caseNumber = caseNumber;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public int getInvoiceNum() {
        return invoiceNum;
    }

    public void setInvoiceNum(int invoiceNum) {
        this.invoiceNum = invoiceNum;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSettleID() {
        return settleID;
    }

    public void setSettleID(int settleID) {
        this.settleID = settleID;
    }

    public int getDeptID() {
        return deptID;
    }

    public void setDeptID(int deptID) {
        this.deptID = deptID;
    }

    public int getPrescriptionState() {
        return prescriptionState;
    }

    public void setPrescriptionState(int prescriptionState) {
        this.prescriptionState = prescriptionState;
    }

    public Date getVisitDate() {
        return visitDate;
    }

    public void setVisitDate(Date visitDate) {
        this.visitDate = visitDate;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }
    public void setDanwei(String danwei){
        this.danwei=danwei;
    }
    public String getDanwei() {
        return danwei;
    }
}
