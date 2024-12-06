package com.teste.festa.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.teste.festa.DTO.FestaDTO;
import com.teste.festa.Model.FestaModel;
import com.teste.festa.Repository.FestaRepository;

@RestController
@RequestMapping("/api/festa")
public class FestaController {

	@Autowired
	FestaRepository repository;

	@PostMapping
	public ResponseEntity<FestaModel> create(@RequestBody FestaDTO festa){
		FestaModel savedFesta = new FestaModel(festa);
		return ResponseEntity.ok(savedFesta);
	}

	@GetMapping()
	ResponseEntity getAll() {
		return ResponseEntity.ok(repository.findAll());
	}

}
