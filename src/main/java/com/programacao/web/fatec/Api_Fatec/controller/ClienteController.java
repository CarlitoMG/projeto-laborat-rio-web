package com.programacao.web.fatec.Api_Fatec.controller;

import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.programacao.web.fatec.Api_Fatec.entities.Cliente;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;



@RestController
@RequestMapping("/api/clientes")
public class ClienteController {

    private final List<Cliente> listaDeCliente = new ArrayList<>();

    public ClienteController(){
        //1 forma
        listaDeCliente.add(new Cliente(1L,"Carlito"));

        //2 forma
        Cliente cliente2 = new Cliente();
        cliente2.setId(2L);
        cliente2.setNome("Diego");
        listaDeCliente.add(cliente2);
    }
    @GetMapping("/listarClientes")
    public List<Cliente> listarClientes() {
        return listaDeCliente;
    }
    

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
    
    @PostMapping("")
    public Cliente createCliente(@RequestBody Cliente cliente){

        listaDeCliente.add(cliente);

        return cliente;
    }

    @DeleteMapping("/{id}")
    public String deletarCliente(@PathVariable Long id){
        for(Cliente cliente: listaDeCliente){
            if(cliente.getId() == id){
                listaDeCliente.remove(cliente);
                return "OK";
            }
        }
        return "NÃO ENCONTRADO ID:"+id;
    }

    @PutMapping("/{id}")
    public String alterarCliente(@PathVariable Long id, @RequestBody Cliente entity) {
    
         for(Cliente cliente: listaDeCliente){
            if(cliente.getId() == id){
                cliente.setId(entity.getId());
                cliente.setNome( entity.getNome());
                return "Id encontrado";
            }    
         }
         return "Id não encontrado"+id;      
    }
}
