package com.company.ams.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import com.haulmont.cuba.core.entity.StandardEntity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.util.Set;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import com.haulmont.chile.core.annotations.NamePattern;

@NamePattern("%s %d%s %s|assetid,availablequantity,company,modelname,status")
@Table(name = "AMS_NEW_ASSET")
@Entity(name = "ams$NewAsset")
public class NewAsset extends StandardEntity {
    private static final long serialVersionUID = 912354244041423332L;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "NAME_ID")
    protected Asset name;

    @Column(name = "ASSETID", nullable = false, unique = true)
    protected Integer assetid;

    @Column(name = "COMPANY", nullable = false)
    protected String company;

    @Column(name = "MODELNAME", nullable = false)
    protected String modelname;

    @Column(name = "QUANTITY", nullable = false)
    protected Integer quantity;

    @Column(name = "AVAILABLEQUANTITY", nullable = false)
    protected Integer availablequantity;

    @Column(name = "COST")
    protected Integer cost;

    @Temporal(TemporalType.DATE)
    @Column(name = "PURCHASEDATE")
    protected Date purchasedate;

    @JoinTable(name = "AMS_NEW_ASSET_SUPLIER_LINK",
        joinColumns = @JoinColumn(name = "NEW_ASSET_ID"),
        inverseJoinColumns = @JoinColumn(name = "SUPLIER_ID"))
    @ManyToMany
    protected Set<Suplier> suplier;

    @Column(name = "STATUS", nullable = false)
    protected Integer status;

    public Status getStatus() {
        return status == null ? null : Status.fromId(status);
    }

    public void setStatus(Status status) {
        this.status = status == null ? null : status.getId();
    }



    public Set<Suplier> getSuplier() {
        return suplier;
    }

    public void setSuplier(Set<Suplier> suplier) {
        this.suplier = suplier;
    }


    public Asset getName() {
        return name;
    }

    public void setName(Asset name) {
        this.name = name;
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

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setAvailablequantity(Integer availablequantity) {
        this.availablequantity = availablequantity;
    }

    public Integer getAvailablequantity() {
        return availablequantity;
    }

    public void setCost(Integer cost) {
        this.cost = cost;
    }

    public Integer getCost() {
        return cost;
    }

    public void setPurchasedate(Date purchasedate) {
        this.purchasedate = purchasedate;
    }

    public Date getPurchasedate() {
        return purchasedate;
    }


}