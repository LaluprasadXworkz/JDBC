package com.xworkz.application.runner;

import com.xworkz.application.entity.ApplicationEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class CreateApplication {
    public static void main(String[] args) {
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("myName");
       ApplicationEntity entity= new ApplicationEntity();
       entity.setId(1);
       entity.setName("baba");
       entity.setGender("girl");
       entity.setContactNumber(74125863l);
       entity.setAge(100);





        EntityManager em=emf.createEntityManager();//DML,DQL
        EntityTransaction et= em.getTransaction();//tclem


        et.begin();
        em.persist(entity);
        et.commit();





    }
}
