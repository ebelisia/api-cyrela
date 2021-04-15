package com.fiap.apicyrela.domain.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@SequenceGenerator(name = "flag", sequenceName = "SQ_FLAG", allocationSize = 1)
@Data
public class Flag {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "enterprise")
	private int id;
	private String name;

}