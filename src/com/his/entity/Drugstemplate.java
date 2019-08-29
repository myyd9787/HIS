package com.his.entity;

import java.sql.Timestamp;
import java.util.Objects;

public class Drugstemplate {
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private int userId;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    private Timestamp creationTime;

    public Timestamp getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(Timestamp creationTime) {
        this.creationTime = creationTime;
    }

    private String scope;

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
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

        return Objects.hash(id, name, userId, creationTime, scope, delMark);
    }
}
