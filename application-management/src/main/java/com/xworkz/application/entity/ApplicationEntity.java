package com.xworkz.application.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "application_info")
@Entity
@Data
public class ApplicationEntity {

    @Id
    @Column(name = "application_id")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "gender")
    private String gender;

    @Column(name = "contactNumber")
    private long contactNumber;

    @Column(name = "age")
    private int age;
}
