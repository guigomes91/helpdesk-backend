package com.gomes.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gomes.helpdesk.domain.Chamado;

public interface ChamadoRepository extends JpaRepository<Chamado, Integer> {

}
