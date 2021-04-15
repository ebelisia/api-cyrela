package com.fiap.apicyrela.domain.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

//Entidade de projetos. Nela será possível verificar custos e informações necessárias.
@Entity
@SequenceGenerator(name = "project", sequenceName = "SQ_PROJECT", allocationSize = 1)
@Data
public class Project {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "project")
	private int id;
	@JsonFormat(pattern = "dd-MM-yyyy", shape = JsonFormat.Shape.STRING, timezone = "GMT-3")
	private Date initialDate;
	@JsonFormat(pattern = "dd-MM-yyyy", shape = JsonFormat.Shape.STRING, timezone = "GMT-3")
	private Date finalDate;
	private String description;
	@ManyToOne
	private ApartamentUnity unity;
	private double cost;

}