package com.unicesumar.ubsdigital.model.domain;

public class Address
{
    public Integer id;
    public String district;
    public String street;
    public String complement;
    public Integer number;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getComplement() {
        return complement;
    }

    public void setComplement(String complement) {
        this.complement = complement;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Address(Integer id, String district, String street, String complement, Integer number) {
        this.id = id;
        this.district = district;
        this.street = street;
        this.complement = complement;
        this.number = number;
    }
}
