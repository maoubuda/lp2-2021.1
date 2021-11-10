package br.edu.ifce.lp2.core.ports.driven.security;

import br.edu.ifce.lp2.core.domain.Client;

public interface GenerateTokenPort {

    String apply(Client client);

}
