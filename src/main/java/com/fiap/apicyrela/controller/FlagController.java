package com.fiap.apicyrela.controller;

import com.fiap.apicyrela.domain.model.Flag;
import com.fiap.apicyrela.domain.repository.FlagRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("cyrela/flag")
public class FlagController {

    @Autowired
    private FlagRepository flagRepository;

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public Flag create(@RequestBody Flag flag) {
        return flagRepository.save(flag);
    }

    @GetMapping
    public List<Flag> getAll(){
        return flagRepository.findAll();
    }

    @GetMapping("{id}")
    public Flag find(@PathVariable int id) {
        return flagRepository.findById(id).get();
    }

    @PutMapping("{id}")
    public Flag update(@RequestBody Flag flag, @PathVariable int id) {
        flag.setId(id);
        return flagRepository.save(flag);
    }

    @DeleteMapping("{id}")
    public void remove(@PathVariable int id) {
        flagRepository.deleteById(id);
    }

}