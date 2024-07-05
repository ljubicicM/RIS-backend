package com.example.teretana.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.teretana.model.Exercise;
import com.example.teretana.model.Sett;
import com.example.teretana.model.Workout;
import com.example.teretana.repository.ExerciseRepository;
import com.example.teretana.repository.SettRepository;
import com.example.teretana.repository.WorkoutRepository;

@Service
public class SettServiceImpl implements SettService {

    @Autowired
    private SettRepository settRepository;

    @Autowired
    private WorkoutRepository workoutRepository;

    @Autowired
    private ExerciseRepository exerciseRepository;

    @Override
    public Sett saveSett(Sett sett) {
        return settRepository.save(sett);
    }

    @Override
    public Sett getSettById(Integer id) {
        return settRepository.findById(id).get();
    }

    @Override
    public List<Sett> getAllSetts() {
        return settRepository.findAll();
    }

    @Override
    public void setWorkout(Integer id, Integer workoutId) {
        Sett sett = settRepository.findById(id).get();
        Workout workout = workoutRepository.findById(workoutId).get();
        sett.setWorkout(workout);
        settRepository.save(sett);
    }

    @Override
    public void setExercise(Integer id, Integer exerciseId) {
        Sett sett = settRepository.findById(id).get();
        Exercise exercise = exerciseRepository.findById(exerciseId).get();
        sett.setExercise(exercise);
        settRepository.save(sett);
    }

}
