package com.example.teretana.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.teretana.model.TrainingProgram;
import com.example.teretana.service.TrainingProgramService;

@RestController
@RequestMapping("/trainingProgram")
@CrossOrigin(origins = "http://localhost:3000")
public class TrainingProgramController {
    @Autowired
    private TrainingProgramService trainingProgramService;

    @PostMapping("/add")
    public TrainingProgram add(@RequestBody TrainingProgram trainingProgram) {
        return trainingProgramService.saveTrainingProgram(trainingProgram);
    }

    @GetMapping("/getAll")
    public List<TrainingProgram> getAll() {
        return trainingProgramService.getAllTrainingPrograms();
    }

    @GetMapping("/getById/{id}")
    public TrainingProgram getById(@PathVariable Integer id) {
        return trainingProgramService.getTrainingProgramById(id);
    }

    @PutMapping("/{id}/setTrainerToTrainingProgram/{trainerId}")
    public void setTrainerToTrainingProgram(@PathVariable Integer id, @PathVariable Integer trainerId) {
        trainingProgramService.setTrainer(id, trainerId);
    }

}
