package com.his.entity;

public class PrescriptionDetailed {
    private int id;                //ID
    private int prescriptionID;  //成药处方id
    private int drugsID;         //药品id
    private String drugsUsage;   //用法
    private String dosage;      //用量
    private String frequency;  //频次
    private double amount;    //数量
    private int state;       //状态

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPrescriptionID() {
        return prescriptionID;
    }

    public void setPrescriptionID(int prescriptionID) {
        this.prescriptionID = prescriptionID;
    }

    public int getDrugsID() {
        return drugsID;
    }

    public void setDrugsID(int drugsID) {
        this.drugsID = drugsID;
    }

    public String getDrugsUsage() {
        return drugsUsage;
    }

    public void setDrugsUsage(String drugsUsage) {
        this.drugsUsage = drugsUsage;
    }

    public String getDosage() {
        return dosage;
    }

    public void setDosage(String dosage) {
        this.dosage = dosage;
    }

    public String getFrequency() {
        return frequency;
    }

    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }
}
