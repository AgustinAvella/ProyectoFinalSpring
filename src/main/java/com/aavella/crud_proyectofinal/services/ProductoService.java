package com.aavella.crud_proyectofinal.services;

import com.aavella.crud_proyectofinal.models.Producto;


public interface ProductoService {
    void guardarProducto();
    Iterable<Producto> listarProductos();

    void eliminarProductos(Integer id);

}
