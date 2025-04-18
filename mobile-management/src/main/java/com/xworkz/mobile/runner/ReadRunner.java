package com.xworkz.mobile.runner;

import com.xworkz.mobile.entity.MobileEntity;

import javax.persistence.*;

public class ReadRunner {


    public static void main(String[] args) {


        MobileEntity mobile=new MobileEntity();
        mobile.setMobileName("Samsung s24");
        mobile.setCost(75000);
        mobile.setBrand("samsung");
        mobile.setRam("12 gb");
        mobile.setStorage("524Gb");


        EntityManagerFactory emf = Persistence.createEntityManagerFactory("myName");
        EntityManager em = emf.createEntityManager();//DMl(insert,update,delete),DQL(select)-(persist().....)
        EntityTransaction et = em.getTransaction();//Tcl(commit,rollback,savepoint,autocommit)-(begin() ,commit(),rollback())

        try {
      MobileEntity entity= em.find(MobileEntity.class,2);
            System.out.println(entity);

    }catch (PersistenceException e){
        et.rollback();
        e.printStackTrace();
    }finally {
        emf.close();
        em.close();
    }


    }
}
