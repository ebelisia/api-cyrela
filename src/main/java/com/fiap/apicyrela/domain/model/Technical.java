package com.fiap.apicyrela.domain.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@SequenceGenerator(name = "technical", sequenceName = "SQ_TECHNICAL", allocationSize = 1)
@Data
public class Technical {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "technical")
    private int id;
    private String name;

}
