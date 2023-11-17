package com.unicesumar.ubsdigital.model.domain;

import java.time.LocalDate;

public abstract class Nurse extends UbsEmployee
{
    public String coren;

    public String getCoren() {
        return coren;
    }

    public void setCoren(String coren) {
        this.coren = coren;
    }

    public Nurse(Integer id, String cpf, LocalDate createdDate, LocalDate lastEntry, Boolean active, String name, Integer createdBySecretary, String coren) {
        super(id, cpf, createdDate, lastEntry, active, name, createdBySecretary);
        this.coren = coren;
    }
}
