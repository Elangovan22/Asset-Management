package com.company.assetmanagement.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.chile.core.annotations.NamePattern;

@NamePattern("%s|asset_name")
@Table(name = "ASSETMANAGEMENT_ASSET")
@Entity(name = "assetmanagement$Asset")
public class Asset extends StandardEntity {
    private static final long serialVersionUID = -6402055256419919206L;

    @Column(name = "ASSET_NAME")
    protected String asset_name;

    public void setAsset_name(String asset_name) {
        this.asset_name = asset_name;
    }

    public String getAsset_name() {
        return asset_name;
    }


}