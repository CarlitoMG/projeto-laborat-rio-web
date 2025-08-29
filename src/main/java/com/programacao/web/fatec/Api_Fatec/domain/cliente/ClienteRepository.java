package com.programacao.web.fatec.Api_Fatec.domain.cliente;

import org.springframework.data.jpa.repository.JpaRepository;

import com.programacao.web.fatec.Api_Fatec.entities.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long>{
    
}
