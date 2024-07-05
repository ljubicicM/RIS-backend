package com.example.teretana.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.teretana.model.TrainingProgram;

@Repository
public interface TrainingProgramRepository extends JpaRepository<TrainingProgram, Integer> {
}
