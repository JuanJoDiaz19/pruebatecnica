package com.example.pruebatecnica.persistance.respositories;

import com.example.pruebatecnica.persistance.models.Cliente;
import org.springframework.data.repository.CrudRepository;

public interface IClienteRepository extends CrudRepository<Cliente, String> {

}
