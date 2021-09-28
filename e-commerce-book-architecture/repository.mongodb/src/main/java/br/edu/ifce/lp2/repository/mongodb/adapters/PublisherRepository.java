package br.edu.ifce.lp2.repository.mongodb.adapters;

import br.edu.ifce.lp2.repository.mongodb.connections.MongoTemplateSingleton;
import br.ifce.edu.lp2.core.domain.Publisher;
import br.ifce.edu.lp2.core.ports.driven.repository.PublisherRepositoryPort;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.stereotype.Service;

@Service
public class PublisherRepository implements PublisherRepositoryPort {

    private final MongoOperations operations;

    public PublisherRepository() {
        operations = MongoTemplateSingleton.operations;
    }

    @Override
    public Publisher save(Publisher publisher) {
        return operations.save(publisher);
    }
}
