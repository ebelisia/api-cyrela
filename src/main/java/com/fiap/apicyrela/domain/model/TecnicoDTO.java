package com.fiap.apicyrela.domain.model;

import lombok.Builder;
import lombok.Data;

@Data
public class TecnicoDTO {

    private String initialDate;
    private String expectedFinalDate;
    private Technical technical;

}
