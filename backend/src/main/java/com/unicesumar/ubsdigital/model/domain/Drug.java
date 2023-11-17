package com.unicesumar.ubsdigital.model.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Drug
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer id;
    public String name;
    public String leaflet;
    public String recordNumber;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLeaflet() {
        return leaflet;
    }

    public void setLeaflet(String leaflet) {
        this.leaflet = leaflet;
    }

    public String getRecordNumber() {
        return recordNumber;
    }

    public void setRecordNumber(String recordNumber) {
        this.recordNumber = recordNumber;
    }

    public Drug() {}

    public Drug(Integer id, String name, String leaflet, String recordNumber) {
        this.id = id;
        this.name = name;
        this.leaflet = leaflet;
        this.recordNumber = recordNumber;
    }
}
