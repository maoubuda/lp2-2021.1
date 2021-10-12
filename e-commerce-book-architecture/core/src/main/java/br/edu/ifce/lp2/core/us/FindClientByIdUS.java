package br.edu.ifce.lp2.core.us;

import br.edu.ifce.lp2.core.domain.Client;
import br.edu.ifce.lp2.core.ports.driven.repository.ClientRepositoryPort;
import br.edu.ifce.lp2.core.ports.driver.FindClientByIdPort;
import org.springframework.stereotype.Service;

@Service
public record FindClientByIdUS(ClientRepositoryPort repository) implements FindClientByIdPort {

    @Override
    public Client apply(String id) {
        return repository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Client not found!"));
    }

}
