package com.example.teretana.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.teretana.model.Trainer;

@Repository
public interface TrainerRepository extends JpaRepository<Trainer, Integer> {

}
