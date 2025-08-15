package com.programacao.web.fatec.Api_Fatec.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/clientes")
public class ClienteController {

    @GetMapping("/cliente1/{num1}/{num2}")
    public String testCliente(@PathVariable ("num1")int id, @PathVariable ("num2")int id2){
        if(id>id2){
            return "Primeiro Numero Maior";
        }else{
            return "Segundo Numero Maior";
        }
    }
    
    @GetMapping("/cliente2/{nome}")
    public String testCliente2(@PathVariable String nome){

        return nome;
    }
    
}
