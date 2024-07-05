package com.example.teretana.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.teretana.model.Trainer;
import com.example.teretana.service.TrainerService;

@RestController
@RequestMapping("/trainer")
@CrossOrigin(origins = "http://localhost:3000")
public class TrainerController {
    @Autowired
    private TrainerService trainerService;

    @PostMapping("/add")
    public String add(@RequestBody Trainer entity) {
        trainerService.saveTrainer(entity);
        return "New trainer is added";
    }

    @GetMapping("getAll")
    public Iterable<Trainer> getAll() {
        return trainerService.getAllTrainers();
    }

    @GetMapping("getById/{id}")
    public Trainer getById(@PathVariable Integer id) {
        return trainerService.getTrainerById(id);
    }

    @PutMapping("/updateTrainer")
    public Trainer updateTrainer(@RequestBody Trainer entity) {
        return trainerService.updateTrainer(entity);
    }
}
