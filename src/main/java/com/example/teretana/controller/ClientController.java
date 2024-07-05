package com.example.teretana.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.teretana.model.Client;
import com.example.teretana.service.ClientService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("/client")
@CrossOrigin(origins = "http://localhost:3000")
public class ClientController {

    @Autowired
    private ClientService clientService;

    @PostMapping("/add")
    public String add(@RequestBody Client entity) {
        clientService.saveClient(entity);
        return "New client is added";
    }

    @GetMapping("getAll")
    public Iterable<Client> getAll() {
        return clientService.getAllClients();
    }

    @GetMapping("getById/{id}")
    public Client getById(@PathVariable Integer id) {
        return clientService.getClientById(id);
    }

    @PutMapping("/updateClient")
    public Client updateClient(@RequestBody Client entity) {
        return clientService.updateClient(entity);
    }

    @PutMapping("/{id}/setTrainerToClient/{trainerId}")
    public void setTrainerToClient(@PathVariable Integer id, @PathVariable Integer trainerId) {
        clientService.setTrainer(id, trainerId);
    }

    @PutMapping("/{id}/setTrainingProgramToClient/{trainingProgramId}")
    public void setTrainingProgramToClient(@PathVariable Integer id, @PathVariable Integer trainingProgramId) {
        clientService.setTrainingProgram(id, trainingProgramId);
    }

    @PutMapping("/updateClientWeight/{id}/{weight}")
    public Client updateClientWeight(@PathVariable Integer id, @PathVariable String weight) {
        System.out.println("id: " + id + " weight: " + weight);
        return clientService.updateClientWeight(id, weight);
    }

}
