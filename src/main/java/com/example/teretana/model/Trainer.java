package com.example.teretana.model;

import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.HashSet;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Trainer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String userName;
    private String password;
    private String name;
    private String lastname;
    private String phoneNumber;

    @JsonIgnore
    @OneToMany(mappedBy = "trainer")
    private Set<Client> clients = new HashSet<>();

    @JsonIgnore
    @OneToMany(mappedBy = "trainer")
    private Set<TrainingProgram> trainingPrograms = new HashSet<>();

    public Trainer() {
    }

    public Trainer(int id, String userName, String password, String name, String lastname, String phoneNumber,
            Set<Client> clients, Set<TrainingProgram> trainingPrograms) {
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.name = name;
        this.lastname = lastname;
        this.phoneNumber = phoneNumber;
        this.clients = clients;
        this.trainingPrograms = trainingPrograms;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Set<Client> getClients() {
        return clients;
    }

    public void setClients(Set<Client> clients) {
        this.clients = clients;
    }

    public Set<TrainingProgram> getTrainingPrograms() {
        return trainingPrograms;
    }

    public void setTrainingPrograms(Set<TrainingProgram> trainingPrograms) {
        this.trainingPrograms = trainingPrograms;
    }

}
