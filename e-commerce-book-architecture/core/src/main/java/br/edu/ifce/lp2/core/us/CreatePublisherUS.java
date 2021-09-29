package br.edu.ifce.lp2.core.us;

import br.edu.ifce.lp2.core.domain.Publisher;
import br.edu.ifce.lp2.core.ports.driven.repository.PublisherRepositoryPort;
import br.edu.ifce.lp2.core.ports.driver.CreatePublisherPort;
import org.springframework.stereotype.Service;

@Service
public record CreatePublisherUS(PublisherRepositoryPort repository) implements CreatePublisherPort {

    @Override
    public Publisher apply(Publisher publisher) {
        return repository.save(publisher);
    }

}
