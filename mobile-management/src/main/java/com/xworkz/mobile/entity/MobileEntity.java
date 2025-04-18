package com.xworkz.mobile.entity;


import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@NamedQuery(name = "getDataByBrand",query = "select m from MobileEntity  m where m.brand='Vivo'")
@Table(name = "mobile_info")
public class MobileEntity {

    @Id
    @Column(name = "mobile_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int mobileId;

    @Column(name = "mobile_name")
    private String mobileName;

    @Column(name = "cost")
    private double cost;

    @Column(name = "brand")
    private String brand;

    @Column(name = "ram")
    private String ram;

    @Column(name = "storage")
    private String storage;

}
