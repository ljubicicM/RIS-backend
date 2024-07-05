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

import com.example.teretana.model.Workout;
import com.example.teretana.service.WorkoutService;

@RestController
@RequestMapping("/workout")
@CrossOrigin(origins = "http://localhost:3000")
public class WorkoutController {
    @Autowired
    private WorkoutService workoutService;

    @PostMapping("/add")
    public Workout add(@RequestBody Workout workout) {
        return workoutService.saveWorkout(workout);

    }

    @GetMapping("/getAll")
    public List<Workout> getAll() {
        return workoutService.getAllWorkouts();
    }

    @GetMapping("/getById")
    public Workout getById(@RequestBody Integer id) {
        return workoutService.getWorkoutById(id);
    }

    @PutMapping("{id}/setTrainingProgramToWorkout/{trainingProgramId}")
    public void setTrainingProgramToWorkout(@PathVariable Integer id, @PathVariable Integer trainingProgramId) {
        workoutService.setTrainingProgram(id, trainingProgramId);
    }

    @PutMapping("/update/{id}/{noSetts}")
    public Workout update(@PathVariable Integer id, @PathVariable Integer noSetts) {
        return workoutService.updateWorkout(id, noSetts);
    }
}
