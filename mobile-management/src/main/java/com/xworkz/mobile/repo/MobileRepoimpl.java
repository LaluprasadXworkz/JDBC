package com.xworkz.mobile.repo;

import com.xworkz.mobile.entity.MobileEntity;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.Collections;
import java.util.List;

public class MobileRepoimpl implements MobileRepo {


    @Override
    public void savedMobile(MobileEntity entity) {
      EntityManager manager= Persistence.createEntityManagerFactory("myName").createEntityManager();
      manager.getTransaction().begin();
      manager.persist(entity);
      manager.getTransaction().commit();
    }

    @Override
    public List<MobileEntity> getAllMobielEntity() {
        Query query =Persistence.createEntityManagerFactory("myName").createEntityManager().createNamedQuery("getDataByBrand");
         List ref  =query.getResultList();
        System.out.println("Ref :"+ref);
//        for (Object re:ref){
//            System.out.println(ref);
//        }
        return Collections.emptyList();
    }
}
