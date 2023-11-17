package com.unicesumar.ubsdigital.model.domain;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

public class Unit
{
    public int id;
    public Address address;
    public List<EmployeeSchedule> unitSchedule;
    public LocalTime openingTime;
    public LocalTime closingTime;
    public Boolean active;

    public Unit(int id, Address address, List<EmployeeSchedule> unitSchedule, LocalTime openingTime, LocalTime closingTime, Boolean active) {
        this.id = id;
        this.address = address;
        this.unitSchedule = unitSchedule;
        this.openingTime = openingTime;
        this.closingTime = closingTime;
        this.active = active;
    }
}
