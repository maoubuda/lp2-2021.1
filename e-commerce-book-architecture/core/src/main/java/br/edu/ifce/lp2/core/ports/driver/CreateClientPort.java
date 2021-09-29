package br.edu.ifce.lp2.core.ports.driver;

import br.edu.ifce.lp2.core.domain.Client;

public interface CreateClientPort {

    Client apply(Client client);

}
