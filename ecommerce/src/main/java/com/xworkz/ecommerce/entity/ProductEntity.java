package com.xworkz.ecommerce.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;



@NamedQuery(name = "getProductByName",query = "select  p from ProductEntity p where p.productName=:name")
@NamedQuery(name = "getProductsNames",query = "select p.productName from ProductEntity p ")
@NamedQuery(name = "getPriceByProductName",query = "select p.price from ProductEntity p where" +
        " p.productName=:name ")

@NamedQuery(name = "getProductName",query = "select p.productName from ProductEntity p")//List<Object>
@NamedQuery(name = "getAllProduNameandCategory",query = "select p.productName ,p.category from ProductEntity p")
@NamedQuery(name = "updateMfdExpPriceIsAvailableByCompanyName",query = "Update ProductEntity p set p.mfd=:mDate," +
                                                        "p.exp=:exp ,p.price=:price ,p.isAvailable=:available where p.company=:company")
@Entity
@Setter
@Getter
@Table(name = "product_info")
public class ProductEntity {

    @Id
    @Column(name = "product_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int productId;

    @Column(name = "product_name")
    private String productName;

    @Column(name = "category")
    private String category;

    @Column(name = "mf_date")
    private LocalDate mfd;

    @Column(name = "ex_date")
    private LocalDate exp;

    @Column(name = "price")
    private double price;

    @Column(name = "is_availabe")
    private boolean isAvailable;

    @Column(name = "company")
    private String company;

}
