package br.edu.ifce.lp2.core.ports.driver;

import br.edu.ifce.lp2.core.domain.Publisher;

public interface CreatePublisherPort {

    Publisher apply(Publisher publisher);

}
