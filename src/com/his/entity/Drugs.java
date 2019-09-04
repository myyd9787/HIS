package com.his.entity;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Objects;

public class Drugs {
    private int id;  //ID
    private String drugsCode;  //药品编码
    private String drugsName;   //药品名称
    private String drugsFormat;   //药品规格
    private String drugsUnit;     //药品单位
    private String manufacturer;    //生产厂家
    private Integer drugsDosageId;    //药品剂型
    private Integer drugsTypeId;     //药品类型
    private Double drugsPrice;    //药品单价
    private String mnemonicCode;     //药品助记码
    private Timestamp creationDate;     //创建时间
    private Timestamp lastUpdateDate;     //最后修改时间
    private int delMark;   //删除标记

    public Drugs() {
    }

    public Drugs(String drugsCode, String drugsName, String drugsFormat, String drugsUnit, Integer drugsDosageId, Integer drugsTypeId, Double drugsPrice, String mnemonicCode) {
        this.drugsCode = drugsCode;
        this.drugsName = drugsName;
        this.drugsFormat = drugsFormat;
        this.drugsUnit = drugsUnit;
        this.drugsDosageId = drugsDosageId;
        this.drugsTypeId = drugsTypeId;
        this.drugsPrice = drugsPrice;
        this.mnemonicCode = mnemonicCode;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getDrugsCode() {
        return drugsCode;
    }
    public void setDrugsCode(String drugsCode) {
        this.drugsCode = drugsCode;
    }
    public String getDrugsName() {
        return drugsName;
    }
    public void setDrugsName(String drugsName) {
        this.drugsName = drugsName;
    }
    public String getDrugsFormat() {
        return drugsFormat;
    }
    public void setDrugsFormat(String drugsFormat) {
        this.drugsFormat = drugsFormat;
    }
    public String getDrugsUnit() {
        return drugsUnit;
    }
    public void setDrugsUnit(String drugsUnit) {
        this.drugsUnit = drugsUnit;
    }
    public String getManufacturer() {
        return manufacturer;
    }
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
    public Integer getDrugsDosageId() {
        return drugsDosageId;
    }
    public void setDrugsDosageId(Integer drugsDosageId) {
        this.drugsDosageId = drugsDosageId;
    }
    public Integer getDrugsTypeId() {
        return drugsTypeId;
    }
    public void setDrugsTypeId(Integer drugsTypeId) {
        this.drugsTypeId = drugsTypeId;
    }
    public Double getDrugsPrice() {
        return drugsPrice;
    }
    public void setDrugsPrice(Double drugsPrice) {
        this.drugsPrice = drugsPrice;
    }
    public String getMnemonicCode() {
        return mnemonicCode;
    }
    public void setMnemonicCode(String mnemonicCode) {
        this.mnemonicCode = mnemonicCode;
    }
    public Timestamp getCreationDate() {
        return creationDate;
    }
    public void setCreationDate(Timestamp creationDate) {
        this.creationDate = creationDate;
    }
    public Timestamp getLastUpdateDate() {
        return lastUpdateDate;
    }
    public void setLastUpdateDate(Timestamp lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }
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
