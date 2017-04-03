package com.company.ams.web.instance;

import com.haulmont.cuba.gui.components.AbstractLookup;
import com.haulmont.cuba.core.global.Metadata;
import com.haulmont.cuba.gui.WindowManager;
import com.haulmont.cuba.gui.components.*;
import com.haulmont.cuba.gui.data.CollectionDatasource;
import java.util.UUID;
import com.company.ams.entity.Instance;
import com.company.ams.entity.NewAsset;

import com.company.ams.entity.AssetAllocated;
import javax.inject.Inject;
import java.util.Collection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.Entity;
import com.google.common.base.Predicate;
import com.google.common.collect.Iterables;
import com.company.ams.service.NewService;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

public class InstanceBrowse extends AbstractLookup {

 
@Inject
private CollectionDatasource<Instance, UUID> instancesDs;

@Inject
private CollectionDatasource<NewAsset, UUID> newAssetDs;

@Inject
private CollectionDatasource<AssetAllocated, UUID> assetAllocatedsDs;


@Inject
private Table<Instance> instancesTable;

@Inject
private Table<NewAsset> newAssetsTable;

@Inject
private Table<AssetAllocated> assetAllocatedsTable;

@Inject
private Persistence persistence;


@Inject
private NewService instanceService;

    

    public void next() {
    
    Instance inst=instancesTable.getSingleSelected();
    int a=inst.getTotalquantity();
    int b = inst.getNeededquantity();
    int assetid=inst.getAssetid();
    int totalnumber = a-b;
    String numberAsString = Integer.toString(assetid);

Collection<Instance> instances = instanceService.calculate(
                inst,assetid, totalnumber);
                 for (Instance instance : instances) {
                 instancesDs.includeItem(instance);
        }
   Collection<NewAsset> instancess = instanceService.updatequantity(
                assetid, totalnumber);   
                for (NewAsset instance : instancess) {
                 newAssetDs.includeItem(instance);
        }
    Collection<AssetAllocated> alloc = instanceService.allocated(
                inst);   
                for (AssetAllocated instance : alloc) {
                 assetAllocatedsDs.includeItem(instance);
        }
        showNotification(getMessage("Succesfully allocated"), NotificationType.HUMANIZED);
    }

}