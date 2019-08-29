package com.his.entity;

import java.util.Objects;

public class Disease {
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private String diseaseCode;

    public String getDiseaseCode() {
        return diseaseCode;
    }

    public void setDiseaseCode(String diseaseCode) {
        this.diseaseCode = diseaseCode;
    }

    private String diseaseName;

    public String getDiseaseName() {
        return diseaseName;
    }

    public void setDiseaseName(String diseaseName) {
        this.diseaseName = diseaseName;
    }

    private String diseaseIcd;

    public String getDiseaseIcd() {
        return diseaseIcd;
    }

    public void setDiseaseIcd(String diseaseIcd) {
        this.diseaseIcd = diseaseIcd;
    }

    private int diseCategoryId;

    public int getDiseCategoryId() {
        return diseCategoryId;
    }

    public void setDiseCategoryId(int diseCategoryId) {
        this.diseCategoryId = diseCategoryId;
    }

    private int delMark;

    public int getDelMark() {
        return delMark;
    }

    public void setDelMark(int delMark) {
        this.delMark = delMark;
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, diseaseCode, diseaseName, diseaseIcd, diseCategoryId, delMark);
    }
}
