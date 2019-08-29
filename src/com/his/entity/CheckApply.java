package com.his.entity;

import java.sql.Timestamp;
import java.util.Objects;

public class CheckApply {
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private int medicalId;

    public int getMedicalId() {
        return medicalId;
    }

    public void setMedicalId(int medicalId) {
        this.medicalId = medicalId;
    }

    private int registId;

    public int getRegistId() {
        return registId;
    }

    public void setRegistId(int registId) {
        this.registId = registId;
    }

    private int itemId;

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String objective;

    public String getObjective() {
        return objective;
    }

    public void setObjective(String objective) {
        this.objective = objective;
    }

    private String position;

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    private Integer isUrgent;

    public Integer getIsUrgent() {
        return isUrgent;
    }

    public void setIsUrgent(Integer isUrgent) {
        this.isUrgent = isUrgent;
    }

    private Integer num;

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    private Timestamp creationTime;

    public Timestamp getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(Timestamp creationTime) {
        this.creationTime = creationTime;
    }

    private Integer doctorId;

    public Integer getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(Integer doctorId) {
        this.doctorId = doctorId;
    }

    private int checkOperId;

    public int getCheckOperId() {
        return checkOperId;
    }

    public void setCheckOperId(int checkOperId) {
        this.checkOperId = checkOperId;
    }

    private int resultOperId;

    public int getResultOperId() {
        return resultOperId;
    }

    public void setResultOperId(int resultOperId) {
        this.resultOperId = resultOperId;
    }

    private Timestamp checkTime;

    public Timestamp getCheckTime() {
        return checkTime;
    }

    public void setCheckTime(Timestamp checkTime) {
        this.checkTime = checkTime;
    }

    private String result;

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    private Timestamp resultTime;

    public Timestamp getResultTime() {
        return resultTime;
    }

    public void setResultTime(Timestamp resultTime) {
        this.resultTime = resultTime;
    }

    private Integer state;

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    private int recordType;

    public int getRecordType() {
        return recordType;
    }

    public void setRecordType(int recordType) {
        this.recordType = recordType;
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, medicalId, registId, itemId, name, objective, position, isUrgent, num, creationTime, doctorId, checkOperId, resultOperId, checkTime, result, resultTime, state, recordType);
    }
}
