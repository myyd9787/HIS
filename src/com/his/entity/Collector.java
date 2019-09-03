package com.his.entity;


import java.util.Date;

//挂号收费员
public class Collector {
    public String CaseNumber;//病历号
    public String RealName;//姓名
    public String Gender;//性别
    public String IDnumber;//身份证号
    public Date BirthDate;//出生日期
    public String Age;//年龄
    public String AgeType;//年龄类型
    public String HomeAddress;//家庭住址
    public Date VisitDate;//本次看诊日期
    public String Noon;//午别
    public String DeptID;//本次挂号科室id
    public String UserID;//本次挂号医生id
    public String RegistLeID;//本次挂号级别id
    public String SettleID;//结算类别id
    public String IsBook;//病历本要否
    public Date RegistTime;//挂号时间
    public String RegisterID;//挂号员id
    public String VisitState;//本次看诊状态

    public Collector() {
    }

    public Collector( String CaseNumber,String RealName,String  Gender,String IDnumber,Date BirthDate,
                      String Age,String AgeType,String HomeAddress,Date VisitDate,String Noon,String DeptID,String UserID,
                      String RegistLeID,String SettleID,String IsBook,Date RegistTime,String RegisterID,String VisitState) {
        this.CaseNumber = CaseNumber;
        this.RealName  = RealName;
        this.Gender = Gender;
        this.IDnumber = IDnumber;
        this.BirthDate = BirthDate;
        this.Age= Age;
        this.AgeType= AgeType;
        this.HomeAddress= HomeAddress;
        this.VisitDate = VisitDate;
        this.Noon = Noon;
        this.DeptID = DeptID;
        this.UserID = UserID;
        this.RegistLeID = RegistLeID;
        this.SettleID = SettleID;
        this.IsBook = IsBook;
        this.RegistTime = RegistTime;
        this.RegisterID = RegisterID;
        this.VisitState = VisitState;
    }

    public String getCaseNumber() {
        return CaseNumber;
    }

    public void setCaseNumber(String caseNumber) {
        this.CaseNumber = caseNumber;
    }

    public String getRealName() {
        return RealName;
    }

    public void setRealName(String realName) {
        this.RealName = realName;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        this.Gender = gender;
    }

    public String getIDnumber() {
        return IDnumber;
    }

    public void setIDnumber(String IDnumber) {
        this.IDnumber = IDnumber;
    }

    public Date getBirthDate() {
        return BirthDate;
    }

    public void setBirthDate(Date birthDate) {
        BirthDate = birthDate;
    }

    public String getAge() {
        return Age;
    }

    public void setAge(String age) {
        this.Age = age;
    }

    public String getAgeType() {
        return AgeType;
    }

    public void setAgeType(String ageType) {
        this.AgeType = ageType;
    }

    public String getHomeAddress() {
        return HomeAddress;
    }

    public void setHomeAddress(String homeAddress) {
        this.HomeAddress = homeAddress;
    }

    public Date getVisitDate() {
        return VisitDate;
    }

    public void setVisitDate(Date visitDate) {
        this.VisitDate = visitDate;
    }

    public String getNoon() {
        return Noon;
    }

    public void setNoon(String noon) {
        this.Noon = noon;
    }

    public String getDeptID() {
        return DeptID;
    }

    public void setDeptID(String deptID) {
        this.DeptID = deptID;
    }

    public String getUserID() {
        return UserID;
    }

    public void setUserID(String userID) {
        this.UserID = userID;
    }

    public String getRegistLeID() {
        return RegistLeID;
    }

    public void setRegistLeID(String registLeID) {
        this.RegistLeID = registLeID;
    }

    public String getSettleID() {
        return SettleID;
    }

    public void setSettleID(String settleID) {
        this.SettleID = settleID;
    }

    public String getIsBook() {
        return IsBook;
    }

    public void setIsBook(String isBook) {
        this.IsBook = isBook;
    }

    public Date getRegistTime() {
        return RegistTime;
    }

    public void setRegistTime(Date registTime) {
        this.RegistTime = registTime;
    }

    public String getRegisterID() {
        return RegisterID;
    }

    public void setRegisterID(String registerID) {
        this.RegisterID = registerID;
    }

    public String getVisitState() {
        return VisitState;
    }

    public void setVisitState(String visitState) {
        this.VisitState = visitState;
    }
    //收费
    //退费
    //现场挂号
    //日结
    //发票重打
    //发票补打
    //退号
}
