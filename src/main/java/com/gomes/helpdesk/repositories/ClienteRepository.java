package com.gomes.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gomes.helpdesk.domain.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

}
