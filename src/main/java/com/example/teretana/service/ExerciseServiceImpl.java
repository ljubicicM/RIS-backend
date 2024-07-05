package com.example.teretana.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.teretana.model.Exercise;
import com.example.teretana.repository.ExerciseRepository;

@Service
public class ExerciseServiceImpl implements ExerciseService {

    @Autowired
    private ExerciseRepository exerciseRepository;

    @Override
    public Exercise saveExercise(Exercise exercise) {
        return exerciseRepository.save(exercise);
    }

    @Override
    public Exercise getExerciseById(Integer id) {
        return exerciseRepository.findById(id).get();
    }

    @Override
    public List<Exercise> getAllExercises() {
        return exerciseRepository.findAll();
    }
}
