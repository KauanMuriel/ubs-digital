package com.unicesumar.ubsdigital.model.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Patient extends User
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer id;
    public Integer userId;
    public Integer federalCode;
    public List<DrugClaim> drugsClaimed;

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

    public Integer getFederalCode() {
        return federalCode;
    }

    public void setFederalCode(Integer federalCode) {
        this.federalCode = federalCode;
    }

    public List<DrugClaim> getDrugsClaimed() {
        return drugsClaimed;
    }

    public void setDrugsClaimed(List<DrugClaim> drugsClaimed) {
        this.drugsClaimed = drugsClaimed;
    }

    public Patient(Integer userId, Integer federalCode) {
        this.userId = userId;
        this.federalCode = federalCode;
        this.drugsClaimed = new ArrayList<>();
    }

    public Patient(Integer id, String cpf, LocalDate createdDate, LocalDate lastEntry, Boolean active , Integer userId, Integer federalCode)
    {
        super(id, cpf, createdDate, lastEntry, active);
        this.id = id;
        this.userId = userId;
        this.federalCode = federalCode;
    }
}
