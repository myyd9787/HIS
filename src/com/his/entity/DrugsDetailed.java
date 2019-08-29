package com.his.entity;

import java.util.Objects;

public class DrugsDetailed {
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private int drugsTempId;

    public int getDrugsTempId() {
        return drugsTempId;
    }

    public void setDrugsTempId(int drugsTempId) {
        this.drugsTempId = drugsTempId;
    }

    private int drugsId;

    public int getDrugsId() {
        return drugsId;
    }

    public void setDrugsId(int drugsId) {
        this.drugsId = drugsId;
    }

    private String drugsUsage;

    public String getDrugsUsage() {
        return drugsUsage;
    }

    public void setDrugsUsage(String drugsUsage) {
        this.drugsUsage = drugsUsage;
    }

    private String dosage;

    public String getDosage() {
        return dosage;
    }

    public void setDosage(String dosage) {
        this.dosage = dosage;
    }

    private String frequency;

    public String getFrequency() {
        return frequency;
    }

    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, drugsTempId, drugsId, drugsUsage, dosage, frequency);
    }
}
