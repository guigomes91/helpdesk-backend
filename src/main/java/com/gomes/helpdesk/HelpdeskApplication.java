package com.gomes.helpdesk;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.gomes.helpdesk.domain.Chamado;
import com.gomes.helpdesk.domain.Cliente;
import com.gomes.helpdesk.domain.Tecnico;
import com.gomes.helpdesk.domain.enums.Perfil;
import com.gomes.helpdesk.domain.enums.Prioridade;
import com.gomes.helpdesk.domain.enums.Status;
import com.gomes.helpdesk.repositories.ChamadoRepository;
import com.gomes.helpdesk.repositories.ClienteRepository;
import com.gomes.helpdesk.repositories.TecnicoRepository;

@SpringBootApplication
public class HelpdeskApplication implements CommandLineRunner {

	@Autowired
	private TecnicoRepository tecnicoRepository;
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	@Autowired
	private ChamadoRepository chamadoRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(HelpdeskApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Tecnico tec1 = new Tecnico(null, "Guilherme Gomes", "926.306.070-38", "guilherme@mail.com", "123");
		tec1.addPerfil(Perfil.ADMIN);
		
		Cliente cl1 = new Cliente(null, "Bill", "718.174.300-76", "bill@mail.com", "123");
		
		Chamado ch1 = new Chamado(null, Prioridade.MEDIA, Status.ANDAMENTO, "Chamado 01", "Primeiro chamado", tec1, cl1);
		
		tecnicoRepository.saveAll(Arrays.asList(tec1));
		clienteRepository.saveAll(Arrays.asList(cl1));
		chamadoRepository.saveAll(Arrays.asList(ch1));
	}

}
