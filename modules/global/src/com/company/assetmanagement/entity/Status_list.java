package com.company.assetmanagement.entity;

import com.haulmont.chile.core.datatypes.impl.EnumClass;

import javax.annotation.Nullable;


public enum Status_list implements EnumClass<Integer> {

    Deployable(05),
    Undeployable(10),
    pending(15),
    Deployed(20);

    private Integer id;

    Status_list(Integer value) {
        this.id = value;
    }

    public Integer getId() {
        return id;
    }

    @Nullable
    public static Status_list fromId(Integer id) {
        for (Status_list at : Status_list.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}