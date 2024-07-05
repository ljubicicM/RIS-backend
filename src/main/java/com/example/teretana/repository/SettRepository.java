package com.example.teretana.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.teretana.model.Sett;

@Repository
public interface SettRepository extends JpaRepository<Sett, Integer> {

}
