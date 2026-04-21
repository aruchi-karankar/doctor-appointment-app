package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
public class Doctor {

    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private String specialization;
}
