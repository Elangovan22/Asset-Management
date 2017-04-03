package com.company.assetmanagement.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import com.haulmont.cuba.core.entity.StandardEntity;
import javax.persistence.Column;

@Table(name = "ASSETMANAGEMENT_SUPPLIER")
@Entity(name = "assetmanagement$Supplier")
public class Supplier extends StandardEntity {
    private static final long serialVersionUID = 2625370367772746024L;

    @Column(name = "SUPPLIER__NAME", nullable = false)
    protected String supplier_Name;

    @Column(name = "CITY", nullable = false)
    protected String city;

    @Column(name = "STATE", nullable = false)
    protected String state;

    public void setSupplier_Name(String supplier_Name) {
        this.supplier_Name = supplier_Name;
    }

    public String getSupplier_Name() {
        return supplier_Name;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }


}