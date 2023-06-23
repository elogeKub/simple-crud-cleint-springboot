package com.example.client.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.client.model.Client;
import com.example.client.repository.ClientRepository;

@org.springframework.stereotype.Service
public class ClientService implements Service {
    @Autowired
    private ClientRepository clientRepository;

    @Override
    public Client addClient(Client client) {
        return clientRepository.save(client);
    }

    @Override
    public List<Client> addClients(List<Client> listClients) {
        return clientRepository.saveAll(listClients);
    }

    @Override
    public List<Client> getClients() {
        return clientRepository.findAll();

    }

    @Override
    public Client updateClient(Client client) {
        Client existingClient = clientRepository.findById(client.getId()).orElse(null);
        existingClient.setFname(client.getFname());
        existingClient.setLname(client.getLname());
        existingClient.setAge(client.getAge());
        existingClient.setAddress(client.getAddress());
        return clientRepository.save(existingClient);

    }

    @Override
    public String deleteClient(int id) {
        clientRepository.deleteById(id);
        String deleteMessage = "deleted " + id;
        return deleteMessage;
    }

    @Override
    public Client getClientById(int id) {
        return clientRepository.findById(id).orElse(null);
    }

    @Override
    public Client getClientByFname(String fname) {
        return clientRepository.getClientByFname(fname);
    }

    @Override
    public List<Client> getClientsByFname(String fname) {
        return clientRepository.getClientsByFname(fname);
    }

}
