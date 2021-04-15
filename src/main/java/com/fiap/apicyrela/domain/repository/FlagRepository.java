package com.fiap.apicyrela.domain.repository;

import com.fiap.apicyrela.domain.model.Flag;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FlagRepository extends JpaRepository<Flag, Integer> {
	
}