package com.fiap.apicyrela.controller;

import com.fiap.apicyrela.domain.model.Customer;
import com.fiap.apicyrela.domain.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("cyrela/customer")
public class CustomerController {
	
	@Autowired
	private CustomerRepository customerRepository;
	
	@ResponseStatus(HttpStatus.CREATED)
	@PostMapping
	public Customer create(@RequestBody Customer customer) {
		return customerRepository.save(customer);
	}
	
	@GetMapping
	public List<Customer> getAll(){
		return customerRepository.findAll();
	}
	
	@GetMapping("{id}")
	public Optional<Customer> getById(@PathVariable int id) {
		return customerRepository.findById(id);
	}
	
	@PutMapping("{id}")
	public Customer update(@PathVariable int id, @RequestBody Customer customer) {
		customer.setId(id);
		return customerRepository.save(customer);
	}
	
	@DeleteMapping("{id}")
	public void delete(@PathVariable int id) {
		customerRepository.deleteById(id);
	}

}
