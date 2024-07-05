package com.example.teretana.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.teretana.model.Client;
import com.example.teretana.model.Trainer;
import com.example.teretana.model.TrainingProgram;
import com.example.teretana.repository.ClientRepository;
import com.example.teretana.repository.TrainerRepository;
import com.example.teretana.repository.TrainingProgramRepository;

@Service
public class ClientServiceImpl implements ClientService {

    @Autowired
    private ClientRepository clientRepository;

    @Autowired
    private TrainerRepository trainerRepository;

    @Autowired
    private TrainingProgramRepository trainingProgramRepository;

    @Override
    public Client saveClient(Client client) {
        return clientRepository.save(client);
    }

    @Override
    public Client getClientById(Integer id) {
        return clientRepository.findById(id).get();
    }

    @Override
    public List<Client> getAllClients() {
        return clientRepository.findAll();
    }

    @Override
    public Client updateClient(Client client) {
        return clientRepository.save(client);
    }

    @Override
    public Client setTrainer(Integer id, Integer trainerId) {
        Client client = clientRepository.findById(id).get();
        Trainer trainer = trainerRepository.findById(trainerId).get();
        client.setTrainer(trainer);
        return clientRepository.save(client);
    }

    @Override
    public Client setTrainingProgram(Integer id, Integer trainingProgramId) {
        Client client = clientRepository.findById(id).get();
        TrainingProgram trainingProgram = trainingProgramRepository.findById(trainingProgramId).get();
        client.setTrainingProgram(trainingProgram);
        return clientRepository.save(client);

    }

    @Override
    public Client updateClientWeight(Integer id, String weight) {
        Client client = clientRepository.findById(id).get();
        client.setBodyWeight(weight);
        return clientRepository.save(client);
    }
}
