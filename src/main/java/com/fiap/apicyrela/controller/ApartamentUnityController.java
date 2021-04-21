package com.fiap.apicyrela.controller;

import com.fiap.apicyrela.domain.model.ApartamentUnity;
import com.fiap.apicyrela.domain.repository.BuildingUnityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("cyrela/unity")
public class ApartamentUnityController {
	
	@Autowired
	private BuildingUnityRepository buildingUnityRepository;
	
	@ResponseStatus(HttpStatus.CREATED)
	@PostMapping
	public ApartamentUnity create(@RequestBody ApartamentUnity unity) {
		return buildingUnityRepository.save(unity);
	}
	
	@GetMapping
	public List<ApartamentUnity> getAll(){
		return buildingUnityRepository.findAll();
	}
	
	@GetMapping("{id}")
	public Optional<ApartamentUnity> find(@PathVariable int id) {
		return buildingUnityRepository.findById(id);
	}
	
	@PutMapping("{id}")
	public ApartamentUnity update(@RequestBody ApartamentUnity unity, @PathVariable int id) {
		unity.setId(id);
		return buildingUnityRepository.save(unity);
	}
	
	@DeleteMapping("{id}")
	public void remove(@PathVariable int id) {
		buildingUnityRepository.deleteById(id);
	}
	
}
