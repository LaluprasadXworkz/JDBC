package com.xworkz.mobile.runner;

import com.xworkz.mobile.entity.MobileEntity;

import javax.persistence.*;

public class CreateRunner {

    public static void main(String[] args) {

       MobileEntity mobile=new MobileEntity();
       mobile.setMobileName("vivo y30");
       mobile.setCost(22000);
       mobile.setBrand("Vivo");
       mobile.setRam("8 gb");
       mobile.setStorage("128 Gb");


      EntityManagerFactory emf= Persistence.createEntityManagerFactory("myName");//to get connection to DB
     EntityManager em= emf.createEntityManager();//DML(insert,update,delete)
      EntityTransaction et = em.getTransaction();//TCL(commit,rollback,begin)
        try{
            et.begin(); //set autocommit=0;

            em.persist(mobile);//inset /save operation/ create
            System.out.println("Data saved");
            et.commit();//commit

        }catch (PersistenceException p){
            p.printStackTrace();
            et.rollback();//rollback
        }finally {

        }

    }
}
