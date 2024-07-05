package com.example.teretana.service;

import java.util.List;

import com.example.teretana.model.Client;

public interface ClientService {

    public Client saveClient(Client client);

    public Client getClientById(Integer id);

    public List<Client> getAllClients();

    public Client updateClient(Client client);

    public Client setTrainer(Integer id, Integer trainerId);

    public Client setTrainingProgram(Integer id, Integer trainingProgramId);

    public Client updateClientWeight(Integer id, String weight);
}
