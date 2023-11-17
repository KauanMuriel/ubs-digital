package com.unicesumar.ubsdigital.model.domain;

import java.time.LocalDate;

public class HealthSecretary extends User
{
    public Integer id;
    public Integer userId;
    public String name;
    public Integer createdByIt;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCreatedByIt() {
        return createdByIt;
    }

    public void setCreatedByIt(Integer createdByIt) {
        this.createdByIt = createdByIt;
    }

    public HealthSecretary(Integer id, String cpf, LocalDate createdDate, LocalDate lastEntry, Boolean active, Integer userId, String name, Integer createdByIt) {
        super(id, cpf, createdDate, lastEntry, active);
        this.id = id;
        this.userId = userId;
        this.name = name;
        this.createdByIt = createdByIt;
    }
}
