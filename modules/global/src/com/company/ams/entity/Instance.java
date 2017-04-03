package com.company.ams.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import com.haulmont.cuba.core.entity.StandardEntity;

@Table(name = "AMS_INSTANCE")
@Entity(name = "ams$Instance")
public class Instance extends StandardEntity {
    private static final long serialVersionUID = -2140690811717669987L;

    @Column(name = "USER_")
    protected String user;

    @Column(name = "NAME")
    protected String name;

    @Column(name = "COMPANY")
    protected String company;

    @Column(name = "MODELNAME")
    protected String modelname;

    @Column(name = "TOTALQUANTITY")
    protected Integer totalquantity;

    @Column(name = "NEEDEDQUANTITY")
    protected Integer neededquantity;

    @Column(name = "TEAMVIEWER")
    protected Integer teamviewer;

    @Column(name = "ASSETID")
    protected Integer assetid;

    public void setAssetid(Integer assetid) {
        this.assetid = assetid;
    }

    public Integer getAssetid() {
        return assetid;
    }


    public void setTotalquantity(Integer totalquantity) {
        this.totalquantity = totalquantity;
    }

    public Integer getTotalquantity() {
        return totalquantity;
    }


    public void setNeededquantity(Integer neededquantity) {
        this.neededquantity = neededquantity;
    }

    public Integer getNeededquantity() {
        return neededquantity;
    }


    public void setUser(String user) {
        this.user = user;
    }

    public String getUser() {
        return user;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
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

    public void setTeamviewer(Integer teamviewer) {
        this.teamviewer = teamviewer;
    }

    public Integer getTeamviewer() {
        return teamviewer;
    }


}