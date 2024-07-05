package com.example.teretana.model;

import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.HashSet;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Workout {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int numberOfSets;
    private int workoutNumber;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "training_program_id", referencedColumnName = "id")
    private TrainingProgram trainingProgram;

    @JsonIgnore
    @OneToMany(mappedBy = "workout")
    private Set<Sett> sets = new HashSet<Sett>();

    public Workout() {
    }

    public Workout(int id, int workoutNumber, TrainingProgram trainingProgram, Set<Sett> sets, int numberOfSets) {
        this.id = id;
        this.workoutNumber = workoutNumber;
        this.trainingProgram = trainingProgram;
        this.sets = sets;
        this.numberOfSets = numberOfSets;
    }

    public int getNumberOfSets() {
        return numberOfSets;
    }

    public void setNumberOfSets(int numberOfSets) {
        this.numberOfSets = numberOfSets;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getworkoutNumber() {
        return workoutNumber;
    }

    public void setworkoutNumber(int workoutNumber) {
        this.workoutNumber = workoutNumber;
    }

    public TrainingProgram getTrainingProgram() {
        return trainingProgram;
    }

    public void setTrainingProgram(TrainingProgram trainingProgram) {
        this.trainingProgram = trainingProgram;
    }

    public Set<Sett> getSets() {
        return sets;
    }

    public void setSets(Set<Sett> sets) {
        this.sets = sets;
    }

}
