package com.aavella.crud_proyectofinal.controllers;

import com.aavella.crud_proyectofinal.services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
@Controller
public class ClienteControllers {
    //Autowired esta
    @Autowired
    @Qualifier("clienteService")
    private ClienteService clienteService;

    @RequestMapping("/addCliente")
    //Vamos a agregar la notacion de PathVariable que nos permitira tomar desde la url del navegador un valor.
    public ResponseEntity<String> addCliente(){

        clienteService.guardarCliente();

        return new ResponseEntity<>("guardado", HttpStatus.OK);
    }

    @RequestMapping(value="/listarClientes", method= RequestMethod.GET)
    public String listarClientes(Model model){
        model.addAttribute("titulo", "Listado de Clientes");
        model.addAttribute("Clientes", clienteService.listarClientes());
        return "listarClientes";
    }
}
