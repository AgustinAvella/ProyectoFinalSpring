package com.aavella.crud_proyectofinal.controllers;

import com.aavella.crud_proyectofinal.services.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ProductoControllers {

    //Autowired esta
    @Autowired
    @Qualifier("productoService")
    private ProductoService productoService;

    @RequestMapping("/addProducto")
    //Vamos a agregar la notacion de PathVariable que nos permitira tomar desde la url del navegador un valor.
    public ResponseEntity<String> addProducto(){

        productoService.guardarProducto();

        return new ResponseEntity<>("guardado", HttpStatus.OK);
    }
    @RequestMapping("/eliminarProducto")
    public void eliminarProductos(Integer id) {
        productoService.eliminarProductos(id);
    }

    @RequestMapping(value="/listarProductos", method= RequestMethod.GET)
    public String listarProductos(Model model){
        model.addAttribute("titulo", "Listado de Productos");
        model.addAttribute("productos", productoService.listarProductos());
        return "listarProductos";
    }

}
