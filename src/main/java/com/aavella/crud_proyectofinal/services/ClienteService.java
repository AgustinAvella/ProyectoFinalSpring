package com.aavella.crud_proyectofinal.services;

import com.aavella.crud_proyectofinal.models.Cliente;


public interface ClienteService {
    void guardarCliente();
    Iterable<Cliente> listarClientes();
}
