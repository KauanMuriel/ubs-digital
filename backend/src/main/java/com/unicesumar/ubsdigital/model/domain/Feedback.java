package com.unicesumar.ubsdigital.model.domain;

import com.unicesumar.ubsdigital.model.domain.enums.FeedbackType;

public class Feedback
{
    public Integer id;
    public Boolean rate;
    public FeedbackType type;
    public String description;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Boolean getRate() {
        return rate;
    }

    public void setRate(Boolean rate) {
        this.rate = rate;
    }

    public FeedbackType getType() {
        return type;
    }

    public void setType(FeedbackType type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Feedback(Integer id, Boolean rate, FeedbackType type, String description) {
        this.id = id;
        this.rate = rate;
        this.type = type;
        this.description = description;
    }
}