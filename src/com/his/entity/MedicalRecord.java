package com.his.entity;

import java.util.Objects;

public class MedicalRecord {
    private int id; //ID主键
    private String caseNumber;  //病历号
    private String readme;  //自述
    private String present; //现病史
    private String presentTreat;    //现病治疗
    private String history; //既往病史
    private String allergy; //过敏史
    private String physique;    //体格检查
    private String proposal;
    private String careful;
    private String checkResult;
    private String diagnosis;
    private String handling;
    private Integer caseState;  //病历状态

    public MedicalRecord() {
    }

    public MedicalRecord(String caseNumber, String readme, String present, String presentTreat, String history,
                         String allergy, String physique) {
        this.caseNumber = caseNumber;
        this.readme = readme;
        this.present = present;
        this.presentTreat = presentTreat;
        this.history = history;
        this.allergy = allergy;
        this.physique = physique;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCaseNumber() {
        return caseNumber;
    }

    public void setCaseNumber(String caseNumber) {
        this.caseNumber = caseNumber;
    }

    public String getReadme() {
        return readme;
    }

    public void setReadme(String readme) {
        this.readme = readme;
    }

    public String getPresent() {
        return present;
    }

    public void setPresent(String present) {
        this.present = present;
    }

    public String getPresentTreat() {
        return presentTreat;
    }

    public void setPresentTreat(String presentTreat) {
        this.presentTreat = presentTreat;
    }

    public String getHistory() {
        return history;
    }

    public void setHistory(String history) {
        this.history = history;
    }

    public String getAllergy() {
        return allergy;
    }

    public void setAllergy(String allergy) {
        this.allergy = allergy;
    }

    public String getPhysique() {
        return physique;
    }

    public void setPhysique(String physique) {
        this.physique = physique;
    }

    public String getProposal() {
        return proposal;
    }

    public void setProposal(String proposal) {
        this.proposal = proposal;
    }

    public String getCareful() {
        return careful;
    }

    public void setCareful(String careful) {
        this.careful = careful;
    }

    public String getCheckResult() {
        return checkResult;
    }

    public void setCheckResult(String checkResult) {
        this.checkResult = checkResult;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public String getHandling() {
        return handling;
    }

    public void setHandling(String handling) {
        this.handling = handling;
    }

    public Integer getCaseState() {
        return caseState;
    }

    public void setCaseState(Integer caseState) {
        this.caseState = caseState;
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, caseNumber, readme, present, presentTreat, history, allergy, physique, proposal, careful, checkResult, diagnosis, handling, caseState);
    }
}
