package com.unicesumar.ubsdigital.model.domain;

import java.time.LocalDate;

public abstract class Person
{
    public Integer id;
    public String cpf;
    public LocalDate createdDate;
    public LocalDate lastEntry;
    public Boolean active;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public LocalDate getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDate createdDate) {
        this.createdDate = createdDate;
    }

    public LocalDate getLastEntry() {
        return lastEntry;
    }

    public void setLastEntry(LocalDate lastEntry) {
        this.lastEntry = lastEntry;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public Person(Integer id, String cpf, LocalDate createdDate, LocalDate lastEntry, Boolean active)
    {
        this.id = id;
        this.cpf = cpf;
        this.createdDate = createdDate;
        this.lastEntry = lastEntry;
        this.active = active;
    }
}
