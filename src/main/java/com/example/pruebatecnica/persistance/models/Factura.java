package com.example.pruebatecnica.persistance.models;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Factura {
    @Id
    private String num_factura;
    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "id_cliente")
    private Cliente cliente;

    @JoinColumn(name = "id_producto")
    private Set<Detalle> detalles;
}
