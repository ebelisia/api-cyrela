package com.fiap.apicyrela.domain.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.persistence.*;

@Entity
@SequenceGenerator(name = "scheduledActivity", sequenceName = "SQ_SCHED_ACTIV", allocationSize = 1)
@Data
public class ScheduledActivity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "scheduledActivity")
	private int id;
	@JsonFormat(pattern = "dd/MM/yyyy", shape = JsonFormat.Shape.STRING)
	private String initialDate;
	@JsonFormat(pattern = "dd/MM/yyyy", shape = JsonFormat.Shape.STRING)
	private String expectedFinalDate;
	@ManyToOne
	private Customer customer;
	@ManyToOne
	private ApartamentUnity unity;
	private String activityType;
	private String subject;
	private boolean finished;
	@ManyToOne
	private Technical technical;

}