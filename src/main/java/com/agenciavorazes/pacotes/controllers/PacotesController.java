package com.agenciavorazes.pacotes.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.agenciavorazes.pacotes.entities.Pacotes;
import com.agenciavorazes.pacotes.repositories.PacotesRepository;

@CrossOrigin(origins = "http://localhost:8080")
@RestController
@RequestMapping(value = "/pacotes")
public class PacotesController {
	
	@Autowired
	private PacotesRepository pacotesRepository;
	
	// GET
	@GetMapping
	public ResponseEntity<List<Pacotes>> findAll() {
		
		List<Pacotes> pacotes = pacotesRepository.findAll();
		
		return ResponseEntity.ok().body(pacotes);
	}
	
	// GET por id
	@GetMapping(value = "/{id}")
	public ResponseEntity<Pacotes> findById(@PathVariable Long id) {
		
		Pacotes pacotes = pacotesRepository.findById(id).get();
		
		return ResponseEntity.ok().body(pacotes);
	}
	
	// CREATE
    @PostMapping
    public Pacotes create(@RequestBody Pacotes pacotes) {
    	
        return pacotesRepository.save(pacotes);
    }
    
    // UPDATE
    @PutMapping("{id}")
    public ResponseEntity<Pacotes> update(@PathVariable long id,@RequestBody Pacotes pacotesDetails) {
    	Pacotes updatePacotes = pacotesRepository.findById(id).get();

    	updatePacotes.setIdPacotes(pacotesDetails.getIdPacotes());
    	
    	updatePacotes.setOrigem(pacotesDetails.getOrigem());
    	
        updatePacotes.setDestino(pacotesDetails.getDestino());
        
    	updatePacotes.setPreco(pacotesDetails.getPreco());
    	
        updatePacotes.setDataIda(pacotesDetails.getDataIda());
        
    	updatePacotes.setDataVolta(pacotesDetails.getDataVolta());

        pacotesRepository.save(updatePacotes);

        return ResponseEntity.ok(updatePacotes);
    }

    // DELETE
    @DeleteMapping("{id}")
    public ResponseEntity<HttpStatus> delete(@PathVariable long id) {

    	Pacotes pacotes = pacotesRepository.findById(id).get();

    	pacotesRepository.delete(pacotes);

        return new ResponseEntity<>(HttpStatus.NO_CONTENT);

    }
    
}