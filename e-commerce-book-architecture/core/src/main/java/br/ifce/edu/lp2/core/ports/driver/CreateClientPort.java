package br.ifce.edu.lp2.core.ports.driver;

import br.ifce.edu.lp2.core.domain.Client;

public interface CreateClientPort {

    Client apply(Client client);

}
