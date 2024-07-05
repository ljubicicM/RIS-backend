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

import com.example.teretana.model.Sett;
import com.example.teretana.service.SettService;

@RestController
@RequestMapping("/sett")
@CrossOrigin(origins = "http://localhost:3000")
public class SettController {
    @Autowired
    private SettService settService;

    @PostMapping("/add")
    public Sett add(@RequestBody Sett sett) {
        return settService.saveSett(sett);
    }

    @GetMapping("/getAll")
    public List<Sett> getAll() {
        return settService.getAllSetts();
    }

    @GetMapping("/getById")
    public Sett getById(@RequestBody Integer id) {
        return settService.getSettById(id);
    }

    @PutMapping("/{id}/setWorkoutToSett/{workoutId}")
    public void setWorkoutToSett(@PathVariable Integer id, @PathVariable Integer workoutId) {
        settService.setWorkout(id, workoutId);
    }

    @PutMapping("/{id}/setExerciseToSett/{ExerciseId}")
    public void setClientToSett(@PathVariable Integer id, @PathVariable Integer ExerciseId) {
        settService.setExercise(id, ExerciseId);
    }
}
