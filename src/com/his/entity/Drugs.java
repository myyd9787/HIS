package com.his.entity;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Objects;

public class Drugs {
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private String drugsCode;

    public String getDrugsCode() {
        return drugsCode;
    }

    public void setDrugsCode(String drugsCode) {
        this.drugsCode = drugsCode;
    }

    private String drugsName;

    public String getDrugsName() {
        return drugsName;
    }

    public void setDrugsName(String drugsName) {
        this.drugsName = drugsName;
    }

    private String drugsFormat;

    public String getDrugsFormat() {
        return drugsFormat;
    }

    public void setDrugsFormat(String drugsFormat) {
        this.drugsFormat = drugsFormat;
    }

    private String drugsUnit;

    public String getDrugsUnit() {
        return drugsUnit;
    }

    public void setDrugsUnit(String drugsUnit) {
        this.drugsUnit = drugsUnit;
    }

    private String manufacturer;

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    private Integer drugsDosageId;

    public Integer getDrugsDosageId() {
        return drugsDosageId;
    }

    public void setDrugsDosageId(Integer drugsDosageId) {
        this.drugsDosageId = drugsDosageId;
    }

    private Integer drugsTypeId;

    public Integer getDrugsTypeId() {
        return drugsTypeId;
    }

    public void setDrugsTypeId(Integer drugsTypeId) {
        this.drugsTypeId = drugsTypeId;
    }

    private BigDecimal drugsPrice;

    public BigDecimal getDrugsPrice() {
        return drugsPrice;
    }

    public void setDrugsPrice(BigDecimal drugsPrice) {
        this.drugsPrice = drugsPrice;
    }

    private String mnemonicCode;

    public String getMnemonicCode() {
        return mnemonicCode;
    }

    public void setMnemonicCode(String mnemonicCode) {
        this.mnemonicCode = mnemonicCode;
    }

    private Timestamp creationDate;

    public Timestamp getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Timestamp creationDate) {
        this.creationDate = creationDate;
    }

    private Timestamp lastUpdateDate;

    public Timestamp getLastUpdateDate() {
        return lastUpdateDate;
    }

    public void setLastUpdateDate(Timestamp lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
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

        return Objects.hash(id, drugsCode, drugsName, drugsFormat, drugsUnit, manufacturer, drugsDosageId, drugsTypeId, drugsPrice, mnemonicCode, creationDate, lastUpdateDate, delMark);
    }
}
