package com.xworkz.ecommerce.repo;

import com.xworkz.ecommerce.entity.ProductEntity;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.Collections;
import java.util.List;

public class ProductRepoimpl implements ProductRepo{
    @Override
    public void savedProduct(ProductEntity productEntity) {
     EntityManager em= Persistence.createEntityManagerFactory("x-workz").createEntityManager();
     em.getTransaction().begin();
     em.persist(productEntity);
        System.out.println("Data inserted");
     em.getTransaction().commit();
    }

    @Override
    public ProductEntity getProduct(String productName) {
    EntityManager entityManager=    Persistence.createEntityManagerFactory("x-workz").createEntityManager();
       Query query =entityManager.createNamedQuery("getUsersNames");
        List<String> ref=query.getResultList();
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
}
