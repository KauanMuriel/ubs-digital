package com.unicesumar.ubsdigital.model.domain;

import java.time.LocalDate;
import java.util.List;

public class Notifiication
{
    public Integer id;
    public Integer createdBy;
    public String name;
    public String description;
    public LocalDate startDate;
    public LocalDate endDate;
    public Boolean forEveryone;
    public List<Unit> unities;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Integer createdBy) {
        this.createdBy = createdBy;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public Boolean getForEveryone() {
        return forEveryone;
    }

    public void setForEveryone(Boolean forEveryone) {
        this.forEveryone = forEveryone;
    }

    public List<Unit> getUnities() {
        return unities;
    }

    public void setUnities(List<Unit> unities) {
        this.unities = unities;
    }

    public Notifiication(Integer id, Integer createdBy, String name, String description, LocalDate startDate, LocalDate endDate, Boolean forEveryone, List<Unit> unities) {
        this.id = id;
        this.createdBy = createdBy;
        this.name = name;
        this.description = description;
        this.startDate = startDate;
        this.endDate = endDate;
        this.forEveryone = forEveryone;
        this.unities = unities;
    }
}
