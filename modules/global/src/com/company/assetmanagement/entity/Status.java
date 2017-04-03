package com.company.assetmanagement.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import com.haulmont.cuba.core.entity.StandardEntity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import com.haulmont.chile.core.annotations.NamePattern;

@NamePattern("%s %s|asset_detail,status")
@Table(name = "ASSETMANAGEMENT_STATUS")
@Entity(name = "assetmanagement$Status")
public class Status extends StandardEntity {
    private static final long serialVersionUID = 8596094257423850324L;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ASSET_DETAIL_ID")
    protected Request asset_detail;

    @Column(name = "STATUS", nullable = false)
    protected Integer status;

    public Request getAsset_detail() {
        return asset_detail;
    }

    public void setAsset_detail(Request asset_detail) {
        this.asset_detail = asset_detail;
    }


    public Status_list getStatus() {
        return status == null ? null : Status_list.fromId(status);
    }

    public void setStatus(Status_list status) {
        this.status = status == null ? null : status.getId();
    }



}