package com.aavella.crud_proyectofinal.services;

import com.aavella.crud_proyectofinal.repositories.ProductoRepository;
import com.aavella.crud_proyectofinal.models.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("productoService")
public class ProductoServiceImpl implements ProductoService {
    @Autowired
    private ProductoRepository productoRepository;


    @Override
    public void guardar() {
        Producto producto1 = new Producto();
        producto1.setNombre("Moto Honda XR 250");
        producto1.setPrecio(49000.0);
        productoRepository.save(producto1);
    }

    @Override
    public Iterable<Producto> listar() {
        return productoRepository.findAll();
    }
}
