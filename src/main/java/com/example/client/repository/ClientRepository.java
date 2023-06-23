package com.example.client.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.client.model.Client;

public interface ClientRepository extends JpaRepository<Client, Integer> {
    Client getClientByFname(String fname);

    List<Client> getClientsByFname(String fname);
}
