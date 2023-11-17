package com.unicesumar.ubsdigital.model.domain;

import com.unicesumar.ubsdigital.model.domain.enums.DayOfWeek;

import java.time.LocalTime;
import java.util.List;

public class EmployeeSchedule
{
    public UbsEmployee employee;
    public LocalTime entryHour;
    public LocalTime outHour;
    public List<DayOfWeek> daysOfWeek;

    public UbsEmployee getEmployee() {
        return employee;
    }

    public void setEmployee(UbsEmployee employee) {
        this.employee = employee;
    }

    public LocalTime getEntryHour() {
        return entryHour;
    }

    public void setEntryHour(LocalTime entryHour) {
        this.entryHour = entryHour;
    }

    public LocalTime getOutHour() {
        return outHour;
    }

    public void setOutHour(LocalTime outHour) {
        this.outHour = outHour;
    }

    public List<DayOfWeek> getDaysOfWeek() {
        return daysOfWeek;
    }

    public void setDaysOfWeek(List<DayOfWeek> daysOfWeek) {
        this.daysOfWeek = daysOfWeek;
    }

    public EmployeeSchedule(UbsEmployee employee, LocalTime entryHour, LocalTime outHour, List<DayOfWeek> daysOfWeek) {
        this.employee = employee;
        this.entryHour = entryHour;
        this.outHour = outHour;
        this.daysOfWeek = daysOfWeek;
    }
}
