package com.example.client.service;

import java.util.List;

import com.example.client.model.Client;

public interface Service {
    public Client addClient(Client client);

    public List<Client> addClients(List<Client> listcList);

    public List<Client> getClients();

    public Client updateClient(Client client);

    public String deleteClient(int id);

    public Client getClientById(int id);

    public Client getClientByFname(String name);

    public List<Client> getClientsByFname(String name);

}
