package com.fiap.apicyrela.domain.repository;

import com.fiap.apicyrela.domain.model.Occurrence;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OccurrenceRepository extends JpaRepository<Occurrence, Integer> {
}