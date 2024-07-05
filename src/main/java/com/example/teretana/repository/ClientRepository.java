package com.example.teretana.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.teretana.model.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Integer> {
}
