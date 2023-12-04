package com.example.pruebatecnica.persistance.models;

import javax.persistence.*;


@Entity
public class Detalle {
    @Id
    private String num_datalle;
    @Id
    private String id_factura;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "id_producto")
    private Factura factura;


    private int cantidad;
    private double precio;

}
