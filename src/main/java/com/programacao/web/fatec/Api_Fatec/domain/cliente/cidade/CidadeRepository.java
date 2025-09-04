package com.programacao.web.fatec.Api_Fatec.controller;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.programacao.web.fatec.Api_Fatec.entities.Cidade;
import com.programacao.web.fatec.Api_Fatec.entities.Estado;

import java.util.List;

/**
 * Repositório para operações de banco de dados relacionadas à entidade Cidade.
 * Estende JpaRepository para herdar operações CRUD básicas.
 */
public interface CidadeRepository extends JpaRepository<Cidade, Long> {

}