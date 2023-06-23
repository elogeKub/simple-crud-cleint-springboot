package com.example.client.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.client.model.Client;
import com.example.client.service.ClientService;

@RequestMapping("/api")
@RestController
public class ClientController {
    @Autowired
    private ClientService clientService;

    @PostMapping("/client")
    public Client addClients(@RequestBody Client client) {
        return clientService.addClient(client);
    }

    @PostMapping("/clients")
    public List<Client> addManyClient(@RequestBody List<Client> lClients) {
        return clientService.addClients(lClients);
    }

    @PutMapping("/client")
    public Client updateClient(@RequestBody Client client) {
        return clientService.updateClient(client);
    }

    @GetMapping("/clients")
    public List<Client> getAllClients() {
        return clientService.getClients();
    }

    @GetMapping("/client/{name}")
    public Client getOneClientName(@PathVariable String name) {
        return clientService.getClientByFname(name);
    }

    @GetMapping("/clients/{name}")
    public List<Client> getClientsName(@PathVariable String name) {
        return clientService.getClientsByFname(name);
    }

    @DeleteMapping("/client/{id}")
    public String deleteClient(@PathVariable int id) {
        return clientService.deleteClient(id);
    }

}
