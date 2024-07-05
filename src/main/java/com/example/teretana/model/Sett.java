package com.example.teretana.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Sett {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int repetitons;
    private int weight;
    private int rest;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "exercise_id", referencedColumnName = "id")
    private Exercise exercise;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "workout_id", referencedColumnName = "id")
    private Workout workout;

    public Sett() {
    }

    public Sett(int id, int repetitons, int weight, int rest, Exercise exercise, Workout workout) {
        this.id = id;
        this.repetitons = repetitons;
        this.weight = weight;
        this.rest = rest;
        this.exercise = exercise;
        this.workout = workout;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRepetitons() {
        return repetitons;
    }

    public void setRepetitons(int repetitons) {
        this.repetitons = repetitons;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getRest() {
        return rest;
    }

    public void setRest(int rest) {
        this.rest = rest;
    }

    public Exercise getExercise() {
        return exercise;
    }

    public void setExercise(Exercise exercise) {
        this.exercise = exercise;
    }

    public Workout getWorkout() {
        return workout;
    }

    public void setWorkout(Workout workout) {
        this.workout = workout;
    }

}
