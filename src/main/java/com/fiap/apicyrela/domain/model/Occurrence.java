package com.fiap.apicyrela.domain.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@SequenceGenerator(name = "occurrence", sequenceName = "SQ_OCCURRENCE", allocationSize = 1)
@Data
public class Occurrence {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "occurence")
	private int ticketId;
	@OneToOne
	private ScheduledActivity relatedToActivity;
	private String description;

}