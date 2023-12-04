package com.example.pruebatecnica.controllers;


import com.example.pruebatecnica.persistance.models.Cliente;
import com.example.pruebatecnica.persistance.respositories.IClienteRepository;
import com.example.pruebatecnica.service.ClientService;
import com.example.pruebatecnica.service.IClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClientController {

    @Autowired
    private IClienteService clientService;

    @GetMapping("")
    public List<Cliente> getClients() {
        return clientService.getClientes();
    }
}
