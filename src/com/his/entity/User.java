package com.his.entity;

public class User {
        public int id;//id
        public String userName;//登录名
        public String passWord;//密码
        public String realName;//真实姓名
        public int useType;//用户类别   1-医院管理员/*2-挂号收费员3-门诊医生4-医技医生5-药房操作员6-财务管理员*/
        public int DocTitleID;//所在科室id
        public String  isScheduling;//所在科室id
        public int deptNo;//所在科室id
        public int registLeID;//挂号级别ID
        public int delMark;//删除标记 0或者1，1-正常；0-已删除
    public User() {}//无参构造方法

    public User( String userName, String passWord, String realName, int useType, int docTitleID, String isSchedulin, int deptNo, int registLeID, int delMark) {
        this.userName = userName;
        this.passWord = passWord;
        this.realName = realName;
        this.useType = useType;
        DocTitleID = docTitleID;
        this.isScheduling = isScheduling;
        this.deptNo = deptNo;
        this.registLeID = registLeID;
        this.delMark = delMark;
    }

    public int getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public String getRealName() {
        return realName;
    }

    public int getUseType() {
        return useType;
    }

    public int getDocTitleID() {
        return DocTitleID;
    }

    public String getIsScheduling() {
        return isScheduling;
    }

    public int getDeptNo() {
        return deptNo;
    }

    public int getRegistLeID() {
        return registLeID;
    }

    public int getDelMark() {
        return delMark;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public void setUseType(int useType) {
        this.useType = useType;
    }

    public void setDocTitleID(int docTitleID) {
        DocTitleID = docTitleID;
    }

    public void setIsScheduling(String isScheduling) {
        this.isScheduling = isScheduling;
    }

    public void setDeptNo(int deptNo) {
        this.deptNo = deptNo;
    }

    public void setRegistLeID(int registLeID) {
        this.registLeID = registLeID;
    }

    public void setDelMark(int delMark) {
        this.delMark = delMark;
    }
}
