package com.example.teretana.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.teretana.model.Exercise;
import com.example.teretana.service.ExerciseService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/exercise")
@CrossOrigin(origins = "http://localhost:3000")
public class ExerciseController {
    @Autowired
    private ExerciseService exerciseService;

    @PostMapping("/add")
    public String add(@RequestBody Exercise exercise) {
        exerciseService.saveExercise(exercise);
        return "New exercise is added";
    }

    @GetMapping("/getAll")
    public List<Exercise> getAll() {
        return exerciseService.getAllExercises();
    }

    @GetMapping("getById")
    public Exercise getById(@RequestBody Integer id) {
        return exerciseService.getExerciseById(id);
    }
}
