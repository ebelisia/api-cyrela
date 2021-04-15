package com.fiap.apicyrela.domain.repository;

import com.fiap.apicyrela.domain.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
}
