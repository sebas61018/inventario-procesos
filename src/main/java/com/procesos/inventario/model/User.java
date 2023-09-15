package com.procesos.inventario.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Data
@AllArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String fistName;
    private String lastName;
    private String address;
    private String email;
    private String phone;
    private String password;
    private String document;
}