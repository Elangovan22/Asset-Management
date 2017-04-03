package com.company.ams.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import com.haulmont.cuba.core.entity.StandardEntity;

@Table(name = "AMS_ASSET_ALLOCATED")
@Entity(name = "ams$AssetAllocated")
public class AssetAllocated extends StandardEntity {
    private static final long serialVersionUID = 2254401116375068816L;

    @Column(name = "USER_")
    protected String user;

    @Column(name = "ASSETID")
    protected Integer assetid;

    @Column(name = "COMPANY")
    protected String company;

    @Column(name = "MODELNAME")
    protected String modelname;

    @Column(name = "QUANTITY")
    protected Integer quantity;

    @Column(name = "NAME")
    protected String name;

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getQuantity() {
        return quantity;
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    public void setUser(String user) {
        this.user = user;
    }

    public String getUser() {
        return user;
    }

    public void setAssetid(Integer assetid) {
        this.assetid = assetid;
    }

    public Integer getAssetid() {
        return assetid;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getCompany() {
        return company;
    }

    public void setModelname(String modelname) {
        this.modelname = modelname;
    }

    public String getModelname() {
        return modelname;
    }


}