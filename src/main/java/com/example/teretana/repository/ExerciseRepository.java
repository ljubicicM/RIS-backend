package com.example.teretana.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.teretana.model.Exercise;

@Repository
public interface ExerciseRepository extends JpaRepository<Exercise, Integer> {

}
