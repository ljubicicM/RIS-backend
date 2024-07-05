package com.example.teretana.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.teretana.model.TrainingProgram;
import com.example.teretana.model.Workout;
import com.example.teretana.repository.TrainingProgramRepository;
import com.example.teretana.repository.WorkoutRepository;

@Service
public class WorkoutServiceImpl implements WorkoutService {

    @Autowired
    private WorkoutRepository workoutRepository;

    @Autowired
    private TrainingProgramRepository trainingProgramRepository;

    @Override
    public Workout saveWorkout(Workout workout) {
        return workoutRepository.save(workout);
    }

    @Override
    public Workout getWorkoutById(Integer id) {
        return workoutRepository.findById(id).get();
    }

    @Override
    public List<Workout> getAllWorkouts() {
        return workoutRepository.findAll();
    }

    @Override
    public Workout setTrainingProgram(Integer id, Integer trainingProgramId) {
        Workout workout = workoutRepository.findById(id).get();
        TrainingProgram trainingProgram = trainingProgramRepository.findById(trainingProgramId).get();
        workout.setTrainingProgram(trainingProgram);
        return workoutRepository.save(workout);
    }

    @Override
    public Workout updateWorkout(Integer id, Integer noSetts) {
        Workout workout = workoutRepository.findById(id).get();
        workout.setNumberOfSets(noSetts);
        return workoutRepository.save(workout);
    }
}
