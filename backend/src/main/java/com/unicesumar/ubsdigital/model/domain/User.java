package com.unicesumar.ubsdigital.model.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDate;

@Entity
public class User
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
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

    public User() {}

    public User(String cpf) {
        this.cpf = cpf;
        this.active = true;
        this.createdDate = LocalDate.now();
    }

    public User(Integer id, String cpf, LocalDate createdDate, LocalDate lastEntry, Boolean active)
    {
        this.id = id;
        this.cpf = cpf;
        this.createdDate = createdDate;
        this.lastEntry = lastEntry;
        this.active = active;
    }
}
