package com.example.pruebatecnica.service;

import com.example.pruebatecnica.persistance.models.Cliente;
import com.example.pruebatecnica.persistance.respositories.IClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService implements IClienteService {
    @Autowired
    private IClienteRepository clienteRepository;

    public List<Cliente> getClientes() {
        return (List<Cliente>) clienteRepository.findAll();
    }
}
