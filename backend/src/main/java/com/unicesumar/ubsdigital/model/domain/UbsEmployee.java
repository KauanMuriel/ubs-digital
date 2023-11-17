package com.unicesumar.ubsdigital.model.domain;

import java.time.LocalDate;

public abstract class UbsEmployee extends User
{
    public String name;
    public Integer createdBySecretary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCreatedBySecretary() {
        return createdBySecretary;
    }

    public void setCreatedBySecretary(Integer createdBySecretary) {
        this.createdBySecretary = createdBySecretary;
    }

    public UbsEmployee(Integer id, String cpf, LocalDate createdDate, LocalDate lastEntry, Boolean active, String name, Integer createdBySecretary) {
        super(id, cpf, createdDate, lastEntry, active);
        this.name = name;
        this.createdBySecretary = createdBySecretary;
    }
}
