package com.aavella.crud_proyectofinal.services;

import com.aavella.crud_proyectofinal.models.Cliente;
import com.aavella.crud_proyectofinal.repositories.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("clienteService")
public class ClienteServiceImpl implements ClienteService {
    @Autowired
    private ClienteRepository clienteRepository;


    @Override
    public void guardarCliente() {
        Cliente cliente1 = new Cliente();
        cliente1.setNombre("Matias");
        cliente1.setApellido("Martinez");
        clienteRepository.save(cliente1);
    }

    @Override
    public Iterable<Cliente> listarClientes() {
        return clienteRepository.findAll();
    }
}
