package com.xworkz.mobile.runner;

import com.xworkz.mobile.entity.MobileEntity;

import javax.persistence.*;

public class DeleteRunner {
    public static void main(String[] args) {

    EntityManagerFactory emf =Persistence.createEntityManagerFactory("myName");
    EntityManager em=emf.createEntityManager();
    EntityTransaction et =em.getTransaction();
    try {
        et.begin();
        MobileEntity entity=em.find(MobileEntity.class,1);
        if(entity!=null) {
            em.remove(entity);
            et.commit();
        }else{
            System.out.println("Mobile Data Is not deleted/not found");
        }
    }catch (PersistenceException e){

    }finally {
        emf.close();
        em.close();
    }


    }
}
