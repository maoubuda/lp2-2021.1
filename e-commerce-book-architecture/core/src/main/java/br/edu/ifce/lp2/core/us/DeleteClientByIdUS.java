package br.edu.ifce.lp2.core.us;

import br.edu.ifce.lp2.core.ports.driven.repository.ClientRepositoryPort;
import br.edu.ifce.lp2.core.ports.driver.DeleteClientByIdPort;
import org.springframework.stereotype.Service;

@Service
public record DeleteClientByIdUS(ClientRepositoryPort repository) implements DeleteClientByIdPort {

    @Override
    public void apply(String id) {
        repository.deleteById(id);
    }
}
