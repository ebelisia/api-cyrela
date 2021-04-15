package com.fiap.apicyrela.domain.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@SequenceGenerator(name = "enterprise", sequenceName = "SQ_ENTERPRISE", allocationSize = 1)
@Data
public class Enterprise {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "enterprise")
	private int id;
	private String address;
	private int number;
	private String city;
	private String state;
	private String zipcode;
	private String condominium;
	@OneToOne
	private Flag flag;

}
