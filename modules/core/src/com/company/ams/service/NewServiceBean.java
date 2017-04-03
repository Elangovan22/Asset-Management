package com.company.ams.service;

import org.springframework.stereotype.Service;
import com.haulmont.cuba.core.EntityManager;
import com.haulmont.cuba.core.Persistence;
import com.haulmont.cuba.core.Transaction;
import com.haulmont.cuba.core.Query;
import com.haulmont.cuba.core.app.UniqueNumbersAPI;
import com.haulmont.cuba.core.global.*;
import com.haulmont.cuba.security.entity.EntityOp;
import com.haulmont.cuba.security.entity.PermissionType;
import com.company.ams.entity.Asset;
import com.company.ams.entity.NewAsset;
import com.company.ams.entity.Instance;
import com.company.ams.entity.AssetAllocated;
import org.springframework.transaction.annotation.Transactional;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.Collection;



@Service(NewService.NAME)
public class NewServiceBean implements NewService {




@Inject
    private Persistence persistence;

    @Inject
    private UniqueNumbersAPI uniqueNumbers;

    @Inject
    private Security security;

    @Inject
    private Metadata metadata;

    @Override
    @Transactional
    public Collection<Instance> createInstances(NewAsset asset, Integer amount,String vv,Integer tm,String user) {
        checkPermission(EntityOp.CREATE);
        // Due to the @Transactional annotation a new transaction is started right before the method is called and
        // committed after leaving the method
        Collection<Instance> instances = new ArrayList<>();
        
            Instance instance = metadata.create(Instance.class);
            instance.setUser(user);
            instance.setName(vv);
            instance.setAssetid(asset.getAssetid());
            instance.setCompany(asset.getCompany());
            instance.setModelname(asset.getModelname());
            instance.setTotalquantity(asset.getAvailablequantity());
            instance.setNeededquantity(amount);    
            instance.setTeamviewer(tm);
            
            persistence.getEntityManager().persist(instance);

            instances.add(instance);
        return instances;
    }

    @Override
    public Collection<Instance> calculate(Instance insta,int assetid,int totalnumber) {
    
         checkPermission(EntityOp.UPDATE);
         Instance instance = metadata.create(Instance.class);
    
        Collection<Instance> instances = new ArrayList<>();
        // Explicit transaction control
        try (Transaction tx = persistence.createTransaction()) {
            EntityManager em = persistence.getEntityManager();
Query query = em.createQuery("update ams$Instance u set u.totalquantity = :totalnumber where u.assetid = :assetid");
query.setParameter("assetid", assetid);
query.setParameter("totalnumber", totalnumber);
query.executeUpdate();
//tx.commit();
            //for (BookInstance booksInstance : bookInstances) {
              //  Instance instance = em.merge(instance, //instanceView);
                
                // Return the updated instance
               // mergedInstances.add(instance);
            //}
            tx.commit();
        }
         //persistence.getEntityManager().persist(instance);
         //instances.add(instance);
         return instances;

        
    }
 @Override
    public Collection<NewAsset> updatequantity(int assetid,int totalnumber) {
    
         checkPermission(EntityOp.UPDATE);
         NewAsset instance = metadata.create(NewAsset.class);
    
        Collection<NewAsset> instances = new ArrayList<>();
        // Explicit transaction control
        try (Transaction tx = persistence.createTransaction()) {
            EntityManager em = persistence.getEntityManager();
Query query = em.createQuery("update ams$NewAsset u set u.availablequantity = :totalnumber where u.assetid = :assetid");
query.setParameter("assetid", assetid);
query.setParameter("totalnumber", totalnumber);
query.executeUpdate();
//tx.commit();
            //for (BookInstance booksInstance : bookInstances) {
              //  Instance instance = em.merge(instance, //instanceView);
                
                // Return the updated instance
               // mergedInstances.add(instance);
            //}
            tx.commit();
        }
         //persistence.getEntityManager().persist(instance);
         //instances.add(instance);
         return instances;

        
    }
@Override
@Transactional
    public Collection<AssetAllocated> allocated(Instance asset) {
        checkPermission(EntityOp.CREATE);
        // Due to the @Transactional annotation a new transaction is started right before the method is called and
        // committed after leaving the method
        Collection<AssetAllocated> alloc = new ArrayList<>();
        
            AssetAllocated instance = metadata.create(AssetAllocated.class);
            instance.setUser(asset.getUser());
            instance.setName(asset.getName());
            instance.setAssetid(asset.getAssetid());
            instance.setCompany(asset.getCompany());
            instance.setModelname(asset.getModelname());
            instance.setQuantity(asset.getNeededquantity());
                        
            persistence.getEntityManager().persist(instance);

            alloc.add(instance);
        return alloc;
    }


/*@Override
    public Collection<Instance> calculate(Instance insta) {
	 checkPermission(EntityOp.CREATE);
	 Collection<Instance> instances = new ArrayList<>();
      Instance instance = metadata.create(Instance.class);
      instance.setTotalquantity(insta.getTotalquantity()-insta.getNeededquantity());
      persistence.getEntityManager().persist(instance);                      	instances.add(instance);
        return instances;
    }*/

     private void checkPermission(EntityOp op) {
        if (!security.isEntityOpPermitted(Instance.class, op)) {
            throw new AccessDeniedException(PermissionType.ENTITY_OP, Instance.class.getSimpleName());
        }
    }
}

