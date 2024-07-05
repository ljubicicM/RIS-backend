package com.example.teretana.service;

import java.util.List;

import com.example.teretana.model.Sett;

public interface SettService {

    public Sett saveSett(Sett sett);

    public Sett getSettById(Integer id);

    public List<Sett> getAllSetts();

    public void setWorkout(Integer id, Integer workoutId);

    public void setExercise(Integer id, Integer exerciseId);
}
