package com.company.ams.service;
import com.haulmont.cuba.core.global.View;
import com.company.ams.entity.Asset;
import com.company.ams.entity.NewAsset;
import com.company.ams.entity.Instance;
import com.company.ams.entity.AssetAllocated;
import java.util.Collection;

public interface NewService {
    String NAME = "ams_NewService";

    Collection<Instance> createInstances(NewAsset asset, Integer amount,String vv,Integer tm,String user);

   Collection<Instance> calculate(Instance insta,int assetid,int totalnumber);

public Collection<NewAsset> updatequantity(int assetid,int totalnumber);

 Collection<AssetAllocated> allocated(Instance asset);


}
