package com.exemple.vinnisv.service;

import com.exemple.vinnisv.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.exemple.vinnisv.model.Client;

@Service
public class ClientService {
    private ClientRepository repository;
    @Autowired
    public ClientService(ClientRepository repository){
        this.repository = repository;
    }

    public void salvarCliente(Client client){
        validarClient(client);
        this.repository.persistir(client);
    }
    public void validarClient(Client cliente) {

    }

}
