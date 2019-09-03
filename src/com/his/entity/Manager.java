package com.his.entity;
//root对象类
public class Manager extends User{
    public Manager() {
    }

    public Manager(String userName, String passWord, String realName, int useType, int docTitleID, String isSchedulin, int deptNo, int registLeID, int delMark) {
        super(userName, passWord, realName, useType, docTitleID, isSchedulin, deptNo, registLeID, delMark);
    }
    public String getUserName(){return super.getUserName();}

    @Override
    public int getId() {
        return super.getId();
    }

    @Override
    public String getPassWord() {
        return super.getPassWord();
    }

    @Override
    public String getRealName() {
        return super.getRealName();
    }

    @Override
    public int getUseType() {
        return super.getUseType();
    }

    @Override
    public int getDocTitleID() {
        return super.getDocTitleID();
    }

    @Override
    public String getIsScheduling() {
        return super.getIsScheduling();
    }

    @Override
    public int getDeptNo() {
        return super.getDeptNo();
    }

    @Override
    public int getRegistLeID() {
        return super.getRegistLeID();
    }

    @Override
    public int getDelMark() {
        return super.getDelMark();
    }

    @Override
    public void setId(int id) {
        super.setId(id);
    }

    @Override
    public void setUserName(String userName) {
        super.setUserName(userName);
    }

    @Override
    public void setPassWord(String passWord) {
        super.setPassWord(passWord);
    }

    @Override
    public void setRealName(String realName) {
        super.setRealName(realName);
    }

    @Override
    public void setUseType(int useType) {
        super.setUseType(useType);
    }

    @Override
    public void setDocTitleID(int docTitleID) {
        super.setDocTitleID(docTitleID);
    }

    @Override
    public void setIsScheduling(String isSchedulin) {
        super.setIsScheduling(isScheduling);
    }

    @Override
    public void setDeptNo(int deptNo) {
        super.setDeptNo(deptNo);
    }

    @Override
    public void setRegistLeID(int registLeID) {
        super.setRegistLeID(registLeID);
    }

    @Override
    public void setDelMark(int delMark) {
        super.setDelMark(delMark);
    }
}
