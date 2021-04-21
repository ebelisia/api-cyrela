package com.fiap.apicyrela.domain.repository;

import com.fiap.apicyrela.domain.model.Technical;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TechnicalRepository extends JpaRepository<Technical, Integer> {

}
