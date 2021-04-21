package com.fiap.apicyrela.controller;

import com.fiap.apicyrela.domain.model.Project;
import com.fiap.apicyrela.domain.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("cyrela/project")
public class ProjectController {
	
	@Autowired
	private ProjectRepository projectRepository;
	
	@GetMapping
	public List<Project> getAll(){
		return projectRepository.findAll();
	}
	
	@ResponseStatus(HttpStatus.CREATED)
	@PostMapping
	public Project create(@RequestBody Project project) {
		return projectRepository.save(project);
	}
	
	@GetMapping("{id}")
	public Optional<Project> find(@PathVariable int id) {
		return projectRepository.findById(id);
	}
	
	@PutMapping("{id}")
	public Project update(@RequestBody Project project, @PathVariable int id) {
		project.setId(id);
		return projectRepository.save(project);
	}
	
	@DeleteMapping("{id}")
	public void remove(@PathVariable int id) {
		projectRepository.deleteById(id);
	}
	
	@GetMapping("/costGreaterThan={cost}")
	public List<Project> listAll(@PathVariable double cost) {
        return projectRepository.findByCostGreaterThan(cost);
    }

}
