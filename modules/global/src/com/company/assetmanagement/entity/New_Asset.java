package com.company.assetmanagement.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import com.haulmont.cuba.core.entity.StandardEntity;
import java.util.Date;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import com.haulmont.chile.core.annotations.NamePattern;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.util.Set;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@NamePattern("%s %s %s %s|asset_id,asset_name,supplier,status")
@Table(name = "ASSETMANAGEMENT_NEW__ASSET")
@Entity(name = "assetmanagement$New_Asset")
public class New_Asset extends StandardEntity {
    private static final long serialVersionUID = 3985129613071235272L;

    @Column(name = "ASSET_ID", nullable = false, unique = true)
    protected String asset_id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ASSET_NAME_ID")
    protected Asset asset_name;

    @Column(name = "COMPANY")
    protected String company;

    @Column(name = "STATUS", nullable = false)
    protected Integer status;

    @Column(name = "MODEL_NO")
    protected String model_no;

    @Column(name = "SERIAL_NO")
    protected String serial_no;

    @Temporal(TemporalType.DATE)
    @Column(name = "PURCHASE_DATE")
    protected Date purchase_date;

    @Column(name = "COST")
    protected String cost;



    @JoinTable(name = "ASSETMANAGEMENT_NEW__ASSET_SUPPLIER_LINK",
        joinColumns = @JoinColumn(name = "NEW__ASSET_ID"),
        inverseJoinColumns = @JoinColumn(name = "SUPPLIER_ID"))
    @ManyToMany
    protected Set<Supplier> supplier;

    public Asset getAsset_name() {
        return asset_name;
    }

    public void setAsset_name(Asset asset_name) {
        this.asset_name = asset_name;
    }


    public void setSupplier(Set<Supplier> supplier) {
        this.supplier = supplier;
    }

    public Set<Supplier> getSupplier() {
        return supplier;
    }


    public Date getPurchase_date() {
        return purchase_date;
    }

    public void setPurchase_date(Date purchase_date) {
        this.purchase_date = purchase_date;
    }


    public Status_list getStatus() {
        return status == null ? null : Status_list.fromId(status);
    }

    public void setStatus(Status_list status) {
        this.status = status == null ? null : status.getId();
    }


    public void setAsset_id(String asset_id) {
        this.asset_id = asset_id;
    }

    public String getAsset_id() {
        return asset_id;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getCompany() {
        return company;
    }

    public void setModel_no(String model_no) {
        this.model_no = model_no;
    }

    public String getModel_no() {
        return model_no;
    }

    public void setSerial_no(String serial_no) {
        this.serial_no = serial_no;
    }

    public String getSerial_no() {
        return serial_no;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    public String getCost() {
        return cost;
    }


}