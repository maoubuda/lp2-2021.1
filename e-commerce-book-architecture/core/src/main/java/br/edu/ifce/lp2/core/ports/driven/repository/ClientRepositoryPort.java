package br.edu.ifce.lp2.core.ports.driven.repository;

import br.edu.ifce.lp2.core.domain.Client;

import java.util.Optional;

public interface ClientRepositoryPort {

    Client save(Client client);

    Optional<Client> findById(String id);

    boolean existsByEmail(String email);

    Client findByTokenValue(String token);

    void deleteById(String id);

}
