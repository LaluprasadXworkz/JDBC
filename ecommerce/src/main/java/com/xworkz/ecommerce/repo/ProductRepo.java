package com.xworkz.ecommerce.repo;

import com.xworkz.ecommerce.entity.ProductEntity;

import java.time.LocalDate;
import java.util.List;

public interface ProductRepo {
    void savedProduct(ProductEntity productEntity);
    ProductEntity getProduct(String productName);
    List<String> getProductsName();
    double getPriceByName(String name);
    boolean updateMfdExpPriceIsAvailableByCompanyName(LocalDate mfg, LocalDate exp, double price, boolean isAvailable, String company);

}
