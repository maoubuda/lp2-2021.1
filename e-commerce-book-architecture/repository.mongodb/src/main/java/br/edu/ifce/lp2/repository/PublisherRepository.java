package br.edu.ifce.lp2.repository;

import br.edu.ifce.lp2.core.domain.Publisher;
import br.edu.ifce.lp2.core.ports.driven.repository.PublisherRepositoryPort;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PublisherRepository extends MongoRepository<Publisher, String>, PublisherRepositoryPort {
}
