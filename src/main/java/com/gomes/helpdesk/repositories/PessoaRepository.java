package com.gomes.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gomes.helpdesk.domain.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Integer> {

}
