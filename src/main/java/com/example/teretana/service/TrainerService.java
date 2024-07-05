package com.example.teretana.service;

import java.util.List;

import com.example.teretana.model.Trainer;

public interface TrainerService {

    public Trainer saveTrainer(Trainer trainer);

    public Trainer getTrainerById(Integer id);

    public List<Trainer> getAllTrainers();

    public Trainer updateTrainer(Trainer trainer);
}
