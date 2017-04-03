package com.company.assetmanagement.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.security.entity.User;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import com.haulmont.chile.core.annotations.NamePattern;

@NamePattern("%s %s|asset_name,user_name")
@Table(name = "ASSETMANAGEMENT_REQUEST")
@Entity(name = "assetmanagement$Request")
public class Request extends StandardEntity {
    private static final long serialVersionUID = 3952980941006375611L;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ASSET_NAME_ID")
    protected New_Asset asset_name;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "USER_NAME_ID")
    protected User user_name;

    public New_Asset getAsset_name() {
        return asset_name;
    }

    public void setAsset_name(New_Asset asset_name) {
        this.asset_name = asset_name;
    }


    public User getUser_name() {
        return user_name;
    }

    public void setUser_name(User user_name) {
        this.user_name = user_name;
    }



}