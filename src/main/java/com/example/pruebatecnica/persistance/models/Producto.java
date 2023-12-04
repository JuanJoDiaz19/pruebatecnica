package com.example.pruebatecnica.persistance.models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Producto {
    @Id
    private String id_producto;
    private String nombre;
    private double precio;
    private int stock;
}
