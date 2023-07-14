package com.aavella.crud_proyectofinal.services;

import com.aavella.crud_proyectofinal.models.Producto;


public interface ProductoService {
    void guardar();
    Iterable<Producto> listar();
}
