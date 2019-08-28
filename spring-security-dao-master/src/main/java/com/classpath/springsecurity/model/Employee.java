package com.classpath.springsecurity.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String username;

    private String password;

    private int age;

    private String departmentName;
}