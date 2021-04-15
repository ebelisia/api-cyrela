package com.fiap.apicyrela.domain.repository;

import com.fiap.apicyrela.domain.model.Project;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProjectRepository extends JpaRepository<Project, Integer> {
	public List<Project> findByCostGreaterThan(double cost);
}