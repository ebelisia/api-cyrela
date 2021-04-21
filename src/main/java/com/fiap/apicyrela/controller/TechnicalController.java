package com.fiap.apicyrela.controller;

import com.fiap.apicyrela.domain.model.TecnicoDTO;
import com.fiap.apicyrela.domain.repository.ScheduledActivityRepository;
import com.fiap.apicyrela.service.ScheduledActivityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.util.List;

@RestController
@RequestMapping("/technical")
public class TechnicalController {

    @Autowired
    private ScheduledActivityRepository scheduledActivityRepository;

    @Autowired
    private ScheduledActivityService scheduledActivityService;

    @GetMapping("{id}")
    public List<TecnicoDTO> find(@PathVariable Integer id) throws ParseException {

        List<TecnicoDTO> tecnico = scheduledActivityService.getTecnico(id);

        return tecnico;
    }

    @GetMapping
    public List<TecnicoDTO> getAll() throws ParseException {
        return scheduledActivityService.getAllTecnico();
    }

}
