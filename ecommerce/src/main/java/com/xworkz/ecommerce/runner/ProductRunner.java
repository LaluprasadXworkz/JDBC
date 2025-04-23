package com.xworkz.ecommerce.runner;

import com.xworkz.ecommerce.entity.ProductEntity;
import com.xworkz.ecommerce.repo.ProductRepo;
import com.xworkz.ecommerce.repo.ProductRepoimpl;

import java.time.LocalDate;
import java.util.List;

public class ProductRunner {
    public static void main(String[] args) {
        ProductEntity entity=new ProductEntity();
        entity.setProductName("Fan");
        entity.setCategory("electricals");
        entity.setMfd(LocalDate.of(2025,03,25));
        entity.setExp(LocalDate.of(2028,06,12));
        entity.setAvailable(true);
        entity.setPrice(25000);
        entity.setCompany("usha");

        ProductRepo repo =new ProductRepoimpl();
//        repo.savedProduct(entity);
//        repo.getProduct("Tv");

//        List<String> productsName =repo.getProductsName();
//        productsName.forEach((a)-> System.out.println(a));
//        for (String names:productsName){
//            System.out.println(names);
//        }

//       double price =repo.getPriceByName("Tv");
//        System.out.println("Price :"+price);

//        repo.updateMfdExpPriceIsAvailableByCompanyName(
//                LocalDate.of(2025,03,17),LocalDate.of(2026,01,25),1452.25,true,"usha");

        List<Object[]>    results= repo.getAllProduNameandCategory();
//        for(Datatyepe red:results){
//
//        }


        for (Object[] obj : results) {
            String productName = (String) obj[0];
            String category = (String) obj[1];
            System.out.println("Product: " + productName + ", Category: " + category);
        }

    }
}
