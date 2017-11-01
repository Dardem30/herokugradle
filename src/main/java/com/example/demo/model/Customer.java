package com.example.demo.model;
import lombok.Data;

import javax.persistence.*;

/**
 * Created by Роман on 01.11.2017.
 */
@Entity
@Table(name = "customer")
@Data
public class Customer {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Basic
    @Column(name = "firstname")
    private String firstName;
    @Basic
    @Column(name = "lastname")
    private String lastName;
}
