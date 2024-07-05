package com.example.teretana.service;

import java.util.List;

import com.example.teretana.model.Exercise;

public interface ExerciseService {

    public Exercise saveExercise(Exercise exercise);

    public Exercise getExerciseById(Integer id);

    public List<Exercise> getAllExercises();
}
