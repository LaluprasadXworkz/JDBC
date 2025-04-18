package com.xworkz.mobile.runner;

import com.xworkz.mobile.entity.MobileEntity;

import javax.persistence.*;

public class UpdateRunner {

    public static void main(String[] args) {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("myName");
        EntityManager manager = entityManagerFactory.createEntityManager();
        EntityTransaction transaction = manager.getTransaction();

        try {
            transaction.begin();
            MobileEntity entity = manager.find(MobileEntity.class, 3);//find
            System.out.println("Old Data :" + entity);
            if (entity != null) {
//                entity.setMobileName("iphone");
//                entity.setCost(145263);
//                entity.setRam("47 Gb");
//                entity.setStorage("2Tb");
                entity.setBrand("Apple");
                MobileEntity isUpdated = manager.merge(entity);
                System.out.println("new  Data :" + isUpdated);
                transaction.commit();
            } else {
                System.out.println("Not Updated");
            }


        } catch (PersistenceException e) {
            transaction.rollback();
        } finally {
            entityManagerFactory.close();
            manager.close();
        }

    }
}
