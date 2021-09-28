package br.ifce.edu.lp2.core.us;

import br.ifce.edu.lp2.core.domain.Publisher;
import br.ifce.edu.lp2.core.ports.driven.repository.PublisherRepositoryPort;
import br.ifce.edu.lp2.core.ports.driver.CreatePublisherPort;

public record CreatePublisherUS(PublisherRepositoryPort repository) implements CreatePublisherPort {

    @Override
    public Publisher apply(Publisher publisher) {
        return repository.save(publisher);
    }

}
