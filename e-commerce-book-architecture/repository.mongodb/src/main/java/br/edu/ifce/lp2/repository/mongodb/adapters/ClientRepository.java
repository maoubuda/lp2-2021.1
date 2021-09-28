package br.edu.ifce.lp2.repository.mongodb.adapters;

import br.edu.ifce.lp2.repository.mongodb.connections.MongoTemplateSingleton;
import br.ifce.edu.lp2.core.domain.Client;
import br.ifce.edu.lp2.core.ports.driven.repository.ClientRepositoryPort;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.stereotype.Service;

@Service
public class ClientRepository implements ClientRepositoryPort {

    private final MongoOperations operations;

    public ClientRepository() {
        operations = MongoTemplateSingleton.operations;
    }

    @Override
    public Client save(Client client) {
        return operations.save(client);
    }

}
