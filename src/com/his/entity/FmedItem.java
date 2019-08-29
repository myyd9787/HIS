package com.his.entity;

import java.math.BigDecimal;
import java.util.Date;

public class FmedItem {
    public int id;//id
    public String itemCode;//项目编码
    public String itemName;//项目名称
    public String format;//规格
    public BigDecimal price;//单价
    public int expClassID;//所属费用科目ID
    public int deptID;//执行科室ID
    public String mnemonicCode;//拼音助记码
    public Date creationDate;//创建时间
    public Date lastUpdateDate;//最后修改时间
    public int recordType;//项目类型
    public int delMark;//删除标记

    public FmedItem() {
    }

    public FmedItem(String itemCode, String itemName, String format, BigDecimal price, int expClassID, int deptID, String mnemonicCode, Date creationDate, Date lastUpdateDate, int recordType) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.format = format;
        this.price = price;
        this.expClassID = expClassID;
        this.deptID = deptID;
        this.mnemonicCode = mnemonicCode;
        this.creationDate = creationDate;
        this.lastUpdateDate = lastUpdateDate;
        this.recordType = recordType;
        this.delMark = 1;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public int getExpClassID() {
        return expClassID;
    }

    public void setExpClassID(int expClassID) {
        this.expClassID = expClassID;
    }

    public int getDeptID() {
        return deptID;
    }

    public void setDeptID(int deptID) {
        this.deptID = deptID;
    }

    public String getMnemonicCode() {
        return mnemonicCode;
    }

    public void setMnemonicCode(String mnemonicCode) {
        this.mnemonicCode = mnemonicCode;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Date getLastUpdateDate() {
        return lastUpdateDate;
    }

    public void setLastUpdateDate(Date lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }

    public int getRecordType() {
        return recordType;
    }

    public void setRecordType(int recordType) {
        this.recordType = recordType;
    }

    public int getDelMark() {
        return delMark;
    }

    public void setDelMark(int delMark) {
        this.delMark = delMark;
    }
}
