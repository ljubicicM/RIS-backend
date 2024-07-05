package com.example.teretana.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.HashSet;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Exercise {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String muscleGroup;

    @JsonIgnore
    @OneToMany(mappedBy = "exercise")
    private Set<Sett> sets = new HashSet<Sett>();

    public Exercise() {
    }

    public Exercise(int id, String name, String muscleGroup, Set<Sett> sets) {
        this.id = id;
        this.name = name;
        this.muscleGroup = muscleGroup;
        this.sets = sets;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMuscleGroup() {
        return muscleGroup;
    }

    public void setMuscleGroup(String muscleGroup) {
        this.muscleGroup = muscleGroup;
    }

    public Set<Sett> getSets() {
        return sets;
    }

    public void setSets(Set<Sett> sets) {
        this.sets = sets;
    }

}
