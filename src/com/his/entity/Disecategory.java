package com.his.entity;


import java.util.Objects;

public class Disecategory {
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private String dicaCode;

    public String getDicaCode() {
        return dicaCode;
    }

    public void setDicaCode(String dicaCode) {
        this.dicaCode = dicaCode;
    }

    private String dicaName;

    public String getDicaName() {
        return dicaName;
    }

    public void setDicaName(String dicaName) {
        this.dicaName = dicaName;
    }

    private Integer sequenceNo;

    public Integer getSequenceNo() {
        return sequenceNo;
    }

    public void setSequenceNo(Integer sequenceNo) {
        this.sequenceNo = sequenceNo;
    }

    private int dicaType;

    public int getDicaType() {
        return dicaType;
    }

    public void setDicaType(int dicaType) {
        this.dicaType = dicaType;
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

        return Objects.hash(id, dicaCode, dicaName, sequenceNo, dicaType, delMark);
    }
}
