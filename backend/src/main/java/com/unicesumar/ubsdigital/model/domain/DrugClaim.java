package com.unicesumar.ubsdigital.model.domain;

import java.time.LocalDate;

public class DrugClaim
{
    public Integer id;
    public Drug drug;
    public Boolean recurrent;
    public Integer daysInterval;
    public LocalDate lastClaim;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Drug getDrug() {
        return drug;
    }

    public void setDrug(Drug drug) {
        this.drug = drug;
    }

    public Boolean getRecurrent() {
        return recurrent;
    }

    public void setRecurrent(Boolean recurrent) {
        this.recurrent = recurrent;
    }

    public Integer getDaysInterval() {
        return daysInterval;
    }

    public void setDaysInterval(Integer daysInterval) {
        this.daysInterval = daysInterval;
    }

    public LocalDate getLastClaim() {
        return lastClaim;
    }

    public void setLastClaim(LocalDate lastClaim) {
        this.lastClaim = lastClaim;
    }

    public DrugClaim(Integer id, Drug drug, Boolean recurrent, Integer daysInterval, LocalDate lastClaim) {
        this.id = id;
        this.drug = drug;
        this.recurrent = recurrent;
        this.daysInterval = daysInterval;
        this.lastClaim = lastClaim;
    }
}
