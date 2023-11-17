package com.unicesumar.ubsdigital.model.domain;

import com.unicesumar.ubsdigital.model.domain.enums.*;

import java.time.LocalDate;

public class Doctor extends UbsEmployee
{
    public Speciality speciality;
    public String crm;

    public Speciality getSpeciality() {
        return speciality;
    }

    public void setSpeciality(Speciality speciality) {
        this.speciality = speciality;
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public Doctor(Integer id, String cpf, LocalDate createdDate, LocalDate lastEntry, Boolean active, String name, Integer createdBySecretary, Speciality speciality, String crm) {
        super(id, cpf, createdDate, lastEntry, active, name, createdBySecretary);
        this.speciality = speciality;
        this.crm = crm;
    }
}
