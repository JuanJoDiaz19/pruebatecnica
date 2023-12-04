package com.example.pruebatecnica.persistance.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import java.util.Set;

@Entity
public class Cliente {
    @Id
    private String id_cliente;
    private String nombre;
    private String apellido;
    private  String direccion;
    private String fecha_nacimiento;
    private String telefono;
    private String email;
    private String categoria;

    @JoinColumn(name = "author_id")
    private Set<Factura> facturas;
}
