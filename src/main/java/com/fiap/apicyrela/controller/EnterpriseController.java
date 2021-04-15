package com.fiap.apicyrela.controller;

import com.fiap.apicyrela.domain.model.Enterprise;
import com.fiap.apicyrela.domain.repository.EnterpriseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("cyrela/enterprise")
public class EnterpriseController {
	
	@Autowired
	private EnterpriseRepository enterpriseRepository;
	
	@ResponseStatus(HttpStatus.CREATED)
	@PostMapping
	public Enterprise create(@RequestBody Enterprise enterprise) {
		return enterpriseRepository.save(enterprise);
	}
	
	@GetMapping
	public List<Enterprise> getAll(){
		return enterpriseRepository.findAll();
	}
	
	@GetMapping("{id}")
	public Optional<Enterprise> find(@PathVariable int id) {
		return enterpriseRepository.findById(id);
	}
	
	@PutMapping("{id}")
	public Enterprise update(@RequestBody Enterprise enterprise, @PathVariable int id) {
		enterprise.setId(id);
		return enterpriseRepository.save(enterprise);
	}
	
	@DeleteMapping("{id}")
	public void remove(@PathVariable int id) {
		enterpriseRepository.deleteById(id);
	}
	
}