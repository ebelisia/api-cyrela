package com.fiap.apicyrela.controller;

import com.fiap.apicyrela.domain.model.Occurrence;
import com.fiap.apicyrela.domain.repository.OccurrenceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("occurrence")
public class OccurenceController {

	@Autowired
	private OccurrenceRepository occurrenceRepository;
	
	@ResponseStatus(HttpStatus.CREATED)
	@PostMapping
	public Occurrence create(@RequestBody Occurrence occurrence) {
		return occurrenceRepository.save(occurrence);
	}
	
	@GetMapping
	public List<Occurrence> getAll(){
		return occurrenceRepository.findAll();
	}
	
	@GetMapping("{id}")
	public Optional<Occurrence> find(@PathVariable int id) {
		return occurrenceRepository.findById(id);
	}
	
	@PutMapping("{id}")
	public Occurrence update(@RequestBody Occurrence occurrence, @PathVariable int id) {
		occurrence.setTicketId(id);
		return occurrenceRepository.save(occurrence);
	}
	
	@DeleteMapping("{id}")
	public void remove(@PathVariable int id) {
		occurrenceRepository.deleteById(id);
	}

}