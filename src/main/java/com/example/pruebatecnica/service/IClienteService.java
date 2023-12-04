package com.example.pruebatecnica.service;

import com.example.pruebatecnica.persistance.models.Cliente;

import java.util.List;

public interface IClienteService {
    List<Cliente> getClientes();
}
