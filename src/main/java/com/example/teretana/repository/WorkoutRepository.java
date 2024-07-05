package com.example.teretana.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.teretana.model.Workout;

@Repository
public interface WorkoutRepository extends JpaRepository<Workout, Integer> {

}
