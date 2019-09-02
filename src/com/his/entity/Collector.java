package com.his.entity;
//挂号收费员
public class Collector {
    public int id;//id
    public String CaseNumber;//病历号
    public String RealName;//姓名
    public String  Gender;//性别
    public String IDnumber;//身份证号
    public String BirthDate;//出生日期
    public String Age;//年龄
    public String AgeType;//年龄类型
    public String HomeAddress;//家庭住址
    public String VisitDate;//本次看诊日期
    public String Noon;//午别
    public String DeptID;//本次挂号科室id
    public String UserID;//本次挂号医生id
    public String RegistLeID;//本次挂号级别id
    public String SettleID;//结算类别id
    public String IsBook;//病历本要否
    public String RegistTime;//挂号时间
    public String RegisterID;//挂号员id
    public String VisitState;//本次看诊状态

    public Collector() {
    }

    public Collector( String CaseNumber,String RealName,String  Gender,String IDnumber,String BirthDate,
                      String Age,String AgeType,String HomeAddress,String VisitDate,String Noon,String DeptID,String UserID,
                      String RegistLeID,String SettleID,String IsBook,String RegistTime,String RegisterID,String VisitState) {
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
        this.RegisterID = RegisterID;
        this.SettleID = SettleID;
        this.IsBook = IsBook;
        this.RegistTime = RegistTime;
        this.RegisterID = RegisterID;
        this.VisitState = VisitState;
    }

    public String getCaseNumber() {
        return CaseNumber;
    }

    public String getRealName() {
        return RealName;
    }

    public String getGender() {
        return Gender;
    }

    public String getIDnumber() {
        return IDnumber;
    }

    public String getBirthDate() {
        return BirthDate;
    }

    public String getAge() {
        return Age;
    }

    public String getAgeType() {
        return AgeType;
    }

    public String getHomeAddress() {
        return HomeAddress;
    }

    public String getVisitDate() {
        return VisitDate;
    }

    public String getNoon() {
        return Noon;
    }

    public String getDeptID() {
        return DeptID;
    }

    public String getUserID() {
        return UserID;
    }

    public String getRegistLeID() {
        return RegistLeID;
    }

    public String getSettleID() {
        return SettleID;
    }

    public String getIsBook() {
        return IsBook;
    }

    public String getRegistTime() {
        return RegistTime;
    }

    public String getRegisterID() {
        return RegisterID;
    }

    public String getVisitState() {
        return VisitState;
    }

    public void setCaseNumber(String caseNumber) {
       CaseNumber = caseNumber;
    }

    public void setRealName(String realName) {
       RealName = realName;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public void setIDnumber(String IDnumber) {
        this.IDnumber = IDnumber;
    }

    public void setBirthDate(String birthDate) {
        BirthDate = birthDate;
    }

    public void setAge(String age) {
        Age = age;
    }

    public void setAgeType(String ageType) {
        AgeType = ageType;
    }

    public void setHomeAddress(String homeAddress) {
        HomeAddress = homeAddress;
    }

    public void setVisitDate(String visitDate) {
        VisitDate = visitDate;
    }

    public void setNoon(String noon) {
        Noon = noon;
    }

    public void setDeptID(String deptID) {
        DeptID = deptID;
    }

    public void setUserID(String userID) {
        UserID = userID;
    }

    public void setRegistLeID(String registLeID) {
        RegistLeID = registLeID;
    }

    public void setSettleID(String settleID) {
        SettleID = settleID;
    }

    public void setIsBook(String isBook) {
        IsBook = isBook;
    }

    public void setRegistTime(String registTime) {
        RegistTime = registTime;
    }

    public void setRegisterID(String registerID) {
        RegisterID = registerID;
    }

    public void setVisitState(String visitState) {
        VisitState = visitState;
    }

    //收费
    //退费
    //现场挂号
    //日结
    //发票重打
    //发票补打
    //退号
}
