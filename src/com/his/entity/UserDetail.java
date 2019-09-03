package com.his.entity;

public class UserDetail {
    public int id;//id
    public String userNmae;//登录名
    public String realName;//真实姓名
    public int  userType;//用户类别
    public String userDocTitle;//医生职称
    public String dept;//所在科室
    public String registerLe;//挂号级别

    public UserDetail() {
    }

    public UserDetail(String userNmae, String realName, int userType, String userDocTitle, String dept, String registerLe) {
        this.userNmae = userNmae;
        this.realName = realName;
        this.userType = userType;
        this.userDocTitle = userDocTitle;
        this.dept = dept;
        this.registerLe = registerLe;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserNmae() {
        return userNmae;
    }

    public void setUserNmae(String userNmae) {
        this.userNmae = userNmae;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public int getUserType() {
        return userType;
    }

    public void setUserType(int userType) {
        this.userType = userType;
    }

    public String getUserDocTitle() {
        return userDocTitle;
    }

    public void setUserDocTitle(String userDocTitle) {
        this.userDocTitle = userDocTitle;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getRegisterLe() {
        return registerLe;
    }

    public void setRegisterLe(String registerLe) {
        this.registerLe = registerLe;
    }
}
