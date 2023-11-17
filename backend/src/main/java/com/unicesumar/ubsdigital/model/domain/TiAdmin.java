package com.unicesumar.ubsdigital.model.domain;

import java.time.LocalDate;

public class TiAdmin extends Person
{
    public Integer id;
    public Integer userId;
    public String name;

    @Override
    public Integer getId() {
        return id;
    }

    @Override
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

    public TiAdmin(Integer id, String cpf, LocalDate createdDate, LocalDate lastEntry, Boolean active, Integer userId, String name)
    {
        super(userId, cpf, createdDate, lastEntry, active);
        this.id = id;
        this.name = name;
        this.userId = userId;
    }
}