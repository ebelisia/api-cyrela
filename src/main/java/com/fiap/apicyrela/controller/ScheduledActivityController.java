package com.fiap.apicyrela.controller;

import com.fiap.apicyrela.domain.model.ScheduledActivity;
import com.fiap.apicyrela.domain.repository.ScheduledActivityRepository;
import com.fiap.apicyrela.service.ScheduledActivityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("activity")
public class ScheduledActivityController {

    @Autowired
    private ScheduledActivityRepository scheduledActivityRepository;

    @Autowired
    private ScheduledActivityService scheduledActivityService;

    @GetMapping
    public List<ScheduledActivity> getAll(){
        return scheduledActivityRepository.findAll();
    }

    @GetMapping("/finished") //http:localhost:8080/activity/finished
    public List<ScheduledActivity> listAllFinished(@RequestParam(defaultValue = "true") boolean finished) {
        return scheduledActivityRepository.findByFinished(finished);
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public ScheduledActivity create(@RequestBody ScheduledActivity activity) throws ParseException {
        return scheduledActivityRepository.save(activity);
    }

    @GetMapping("{id}")
    public Optional<ScheduledActivity> find(@PathVariable int id) {
        return scheduledActivityRepository.findById(id);
    }

    @PutMapping("{id}")
    public ScheduledActivity update(@RequestBody ScheduledActivity activity, @PathVariable int id) {
        activity.setId(id);
        return scheduledActivityRepository.save(activity);
    }

    @DeleteMapping("{id}")
    public void remove(@PathVariable int id) {
        scheduledActivityRepository.deleteById(id);
    }

    @GetMapping("notFinished") //http:localhost:8080/app/activity/notFinished
    public List<ScheduledActivity> listAllNotFinished(@RequestParam(defaultValue = "false") boolean finished) {
        return scheduledActivityRepository.findByFinished(finished);
    }

}
