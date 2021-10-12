package br.edu.ifce.lp2.core.ports.driver;

import br.edu.ifce.lp2.core.domain.Client;

public interface FindClientByIdPort {

    Client apply(String id);
}
