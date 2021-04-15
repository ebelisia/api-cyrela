package com.fiap.apicyrela.domain.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@SequenceGenerator(name = "apartamentUnity", sequenceName = "SQ_APARTAMENT", allocationSize = 1)
@Data
public class ApartamentUnity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "apartamentUnity")
	private int id;
	private int number;
	private int block;
	@ManyToOne
	private Enterprise enterprise;	

}