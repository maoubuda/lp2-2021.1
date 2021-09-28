package br.ifce.edu.lp2.core.ports.driver;

import br.ifce.edu.lp2.core.domain.Publisher;

public interface CreatePublisherPort {

    Publisher apply(Publisher publisher);

}
