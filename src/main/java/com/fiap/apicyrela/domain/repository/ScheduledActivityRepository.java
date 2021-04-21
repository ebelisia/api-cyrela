package com.fiap.apicyrela.domain.repository;

import com.fiap.apicyrela.domain.model.ScheduledActivity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ScheduledActivityRepository extends JpaRepository<ScheduledActivity, Integer> {

	List<ScheduledActivity> findByFinished(boolean finished);
	List<ScheduledActivity> findByTechnicalId(int technicalId);

}