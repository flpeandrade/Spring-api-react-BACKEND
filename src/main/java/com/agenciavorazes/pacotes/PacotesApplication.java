package com.agenciavorazes.pacotes;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.agenciavorazes.pacotes.entities.Pacotes;
import com.agenciavorazes.pacotes.repositories.PacotesRepository;



@SpringBootApplication
public class PacotesApplication implements CommandLineRunner {
	
	@Autowired
	private PacotesRepository pacotesRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(PacotesApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		/*Pacotes p1 = new Pacotes();
		p1.setIdPacotes(null);
		p1.setOrigem("Salvador");
		p1.setDestino("Natal");
		p1.setPreco(800);
		p1.setDataIda("11/09/2022");
		p1.setDataVolta("30/09/2022");
		
		pacotesRepository.save(p1);*/
		
		Pacotes p2 = new Pacotes();
		p2.setIdPacotes(null);
		p2.setOrigem("Bahia");
		p2.setDestino("Belo Horizonte");
		p2.setPreco(1800);
		p2.setDataIda("10/09/2022");
		p2.setDataVolta("20/10/2022");
		
		pacotesRepository.save(p2);
		
		
		
	}

}
