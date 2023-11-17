package com.unicesumar.ubsdigital.model.domain;

import com.unicesumar.ubsdigital.model.domain.enums.Symptom;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public class SchedulingOrder
{
    public int id;
    public Patient patient;
    public Unit unit;
    public String reason;
    public List<Symptom> symptoms;
    public String anotherSymptom;
    public List<Feedback> feedbacks;
    public LocalDateTime date;

    public void acessAppointment()
    {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Unit getUnit() {
        return unit;
    }

    public void setUnit(Unit unit) {
        this.unit = unit;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public List<Symptom> getSymptoms() {
        return symptoms;
    }

    public void setSymptoms(List<Symptom> symptoms) {
        this.symptoms = symptoms;
    }

    public String getAnotherSymptom() {
        return anotherSymptom;
    }

    public void setAnotherSymptom(String anotherSymptom) {
        this.anotherSymptom = anotherSymptom;
    }

    public List<Feedback> getFeedbacks() {
        return feedbacks;
    }

    public void setFeedbacks(List<Feedback> feedbacks) {
        this.feedbacks = feedbacks;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public SchedulingOrder(int id, Patient patient, Unit unit, String reason, List<Symptom> symptoms, String anotherSymptom, List<Feedback> feedbacks, LocalDateTime date) {
        this.id = id;
        this.patient = patient;
        this.unit = unit;
        this.reason = reason;
        this.symptoms = symptoms;
        this.anotherSymptom = anotherSymptom;
        this.feedbacks = feedbacks;
        this.date = date;
    }
}
