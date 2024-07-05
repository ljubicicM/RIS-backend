package com.example.teretana.service;

import java.util.List;
import com.example.teretana.model.Workout;

public interface WorkoutService {

    public Workout saveWorkout(Workout workout);

    public Workout getWorkoutById(Integer id);

    public List<Workout> getAllWorkouts();

    public Workout setTrainingProgram(Integer id, Integer trainingProgramId);

    public Workout updateWorkout(Integer id, Integer noSetts);
}