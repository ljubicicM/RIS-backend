package com.example.teretana.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.teretana.model.Trainer;
import com.example.teretana.model.TrainingProgram;
import com.example.teretana.repository.TrainerRepository;
import com.example.teretana.repository.TrainingProgramRepository;

@Service
public class TrainingProgramServiceImpl implements TrainingProgramService {

    @Autowired
    private TrainingProgramRepository trainingProgramRepository;
    @Autowired
    private TrainerRepository trainerRepository;

    @Override
    public TrainingProgram saveTrainingProgram(TrainingProgram trainingProgram) {
        return trainingProgramRepository.save(trainingProgram);
    }

    @Override
    public TrainingProgram getTrainingProgramById(Integer id) {
        return trainingProgramRepository.findById(id).get();
    }

    @Override
    public List<TrainingProgram> getAllTrainingPrograms() {
        return trainingProgramRepository.findAll();
    }

    @Override
    public void setTrainer(Integer id, Integer trainerId) {
        TrainingProgram trainingProgram = trainingProgramRepository.findById(id).get();
        Trainer trainer = trainerRepository.findById(trainerId).get();
        trainingProgram.setTrainer(trainer);
        trainingProgramRepository.save(trainingProgram);
    }
}
