package com.xworkz.ecommerce.repo;

import com.xworkz.ecommerce.entity.ProductEntity;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;

import java.time.LocalDate;
import java.util.Collections;
import java.util.List;

public class ProductRepoimpl implements ProductRepo{
    @Override
    public void savedProduct(ProductEntity productEntity) {
     EntityManager em= Persistence.createEntityManagerFactory("x-workz")
             .createEntityManager();
     em.getTransaction().begin();
     em.persist(productEntity);//SAVE //MERGE//FIND //REMOVE
        System.out.println("Data inserted");
     em.getTransaction().commit();

    }

    @Override
    public ProductEntity getProduct(String productName) {
    EntityManager entityManager=    Persistence.createEntityManagerFactory("x-workz").createEntityManager();
       Query query =entityManager.createNamedQuery("getProductByName");
        ProductEntity entity=(ProductEntity) query.getResultList();
        System.out.println(entity);
        return null;
    }

    @Override
    public List<String> getProductsName() {
      return   Persistence.createEntityManagerFactory("x-workz")
                .createEntityManager().createNamedQuery("getProductsNames").getResultList();
    }

    @Override
    public double getPriceByName(String productName) {
        return (double) Persistence.createEntityManagerFactory("x-workz").createEntityManager()
                .createNamedQuery("getPriceByProductName").setParameter("name",productName)
                .getSingleResult();
    }

    @Override
    public boolean updateMfdExpPriceIsAvailableByCompanyName(LocalDate mfg, LocalDate exp, double price, boolean isAvailable, String company) {
      EntityManager entityManager =Persistence.createEntityManagerFactory("x-workz").createEntityManager();
        entityManager.getTransaction().begin();
        Query query=entityManager.createNamedQuery("updateMfdExpPriceIsAvailableByCompanyName");
//        Query query = entityManager.createQuery("UPDATE ProductEntity p SET p.mfd " +
//                "= :mfg, p.exp = :exp, p.price = :price, p.isAvailable = :isAvailable " +
//                "WHERE p.company = :company");

        query.setParameter("mDate",mfg);
        query.setParameter("exp",exp);
        query.setParameter("price",price);
        query.setParameter("available",isAvailable);
        query.setParameter("company",company);
        int a=query.executeUpdate();

        entityManager.getTransaction().commit();
        if(a>1){
            return true;
        }
        return false;
    }

    @Override
    public List<Object[]> getAllProduNameandCategory() {
        EntityManager entityManager = Persistence.createEntityManagerFactory("x-workz").createEntityManager();
        Query query = entityManager.createNamedQuery("getAllProduNameandCategory");
        List<Object[]> results = query.getResultList();
        return results;
    }


}






//        entityManager.createQuery("Update ProductEntity p set p.mfd='"+mfg+"',p.exp='"+exp+",'p.price="+price+"p.isAvailable='"+isAvailable+"'where p.company='"+company+"'");
