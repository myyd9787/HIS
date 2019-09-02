package com.his.entity;

public class Prescription {
    private int id;                  //ID
    private int medicalID;           // 病例ID
    private int registID;            //挂号ID
    private int userID;               //开立医生ID
    private String prescriptionName;  //处方名称
    private String prescriptionTime;    //开立时间
    private int prescriptionState;       //处方状态

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMedicalID() {
        return medicalID;
    }

    public void setMedicalID(int medicalID) {
        this.medicalID = medicalID;
    }

    public int getRegistID() {
        return registID;
    }

    public void setRegistID(int registID) {
        this.registID = registID;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getPrescriptionName() {
        return prescriptionName;
    }

    public void setPrescriptionName(String prescriptionName) {
        this.prescriptionName = prescriptionName;
    }

    public String getPrescriptionTime() {
        return prescriptionTime;
    }

    public void setPrescriptionTime(String prescriptionTime) {
        this.prescriptionTime = prescriptionTime;
    }

    public int getPrescriptionState() {
        return prescriptionState;
    }

    public void setPrescriptionState(int prescriptionState) {
        this.prescriptionState = prescriptionState;
    }
}
