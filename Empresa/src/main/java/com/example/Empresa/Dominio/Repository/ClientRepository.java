package com.example.Empresa.Dominio.Repository;

import com.example.Empresa.Dominio.Client;

import java.util.List;

public interface ClientRepository {

    List<Client> getAll();

    Client getByClient(String clienteId);

    Client save(Client client);

    boolean delete(String clientId);
}