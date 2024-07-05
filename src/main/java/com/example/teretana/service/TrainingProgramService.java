package com.example.teretana.service;

import java.util.List;

import com.example.teretana.model.TrainingProgram;

public interface TrainingProgramService {

    public TrainingProgram saveTrainingProgram(TrainingProgram trainingProgram);

    public TrainingProgram getTrainingProgramById(Integer id);

    public List<TrainingProgram> getAllTrainingPrograms();

    public void setTrainer(Integer id, Integer trainerId);

}
