package com.fiap.apicyrela.service;

import com.fiap.apicyrela.domain.model.ScheduledActivity;
import com.fiap.apicyrela.domain.model.TecnicoDTO;
import com.fiap.apicyrela.domain.repository.ScheduledActivityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class ScheduledActivityService {

    @Autowired
    private ScheduledActivityRepository scheduledActivityRepository;

    public List<TecnicoDTO> getTecnico(int tecnicoId) throws ParseException {

        List<ScheduledActivity> scheduledActivities = scheduledActivityRepository.findByTechnicalId(tecnicoId);

        List<TecnicoDTO> dtos = new ArrayList<>();

        for (int i = 0; i < scheduledActivities.size(); i++) {

           TecnicoDTO tecnicoDTO = new TecnicoDTO();

            tecnicoDTO.setTechnical(scheduledActivities.get(i).getTechnical());
            tecnicoDTO.setInitialDate(scheduledActivities.get(i).getInitialDate());
            tecnicoDTO.setExpectedFinalDate(scheduledActivities.get(i).getExpectedFinalDate());

            dtos.add(tecnicoDTO);

        }

        return dtos;

    }

    public List<TecnicoDTO> getAllTecnico() throws ParseException {

        List<ScheduledActivity> scheduledActivities = scheduledActivityRepository.findAll();

        List<TecnicoDTO> dtos = new ArrayList<>();

        for (int i = 0; i < scheduledActivities.size(); i++) {

            TecnicoDTO tecnicoDTO = new TecnicoDTO();

            tecnicoDTO.setTechnical(scheduledActivities.get(i).getTechnical());
            tecnicoDTO.setInitialDate(scheduledActivities.get(i).getInitialDate());
            tecnicoDTO.setExpectedFinalDate(scheduledActivities.get(i).getExpectedFinalDate());

            dtos.add(tecnicoDTO);

        }

        return dtos;

    }


}
