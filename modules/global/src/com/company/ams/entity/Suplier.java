package com.company.ams.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import com.haulmont.cuba.core.entity.StandardEntity;

@Table(name = "AMS_SUPLIER")
@Entity(name = "ams$Suplier")
public class Suplier extends StandardEntity {
    private static final long serialVersionUID = 2606028854537300268L;

    @Column(name = "STATE")
    protected String state;

    @Column(name = "PLACE")
    protected String place;

    @Column(name = "NAME")
    protected String name;

    public void setState(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getPlace() {
        return place;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


}