package com.fiap.apicyrela.domain.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@SequenceGenerator(name = "customer", sequenceName = "SQ_CUSTOMER", allocationSize = 1)
@Data
public class Customer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "customer")
	private int id;
	private String name;
	private String cpf;
	private String email;
	private String phone;
	@ManyToOne
	private ApartamentUnity ownership;
	
}
