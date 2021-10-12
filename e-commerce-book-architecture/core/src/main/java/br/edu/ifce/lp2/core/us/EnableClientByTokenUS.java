package br.edu.ifce.lp2.core.us;

import br.edu.ifce.lp2.core.ports.driven.repository.ClientRepositoryPort;
import br.edu.ifce.lp2.core.ports.driver.EnableClientByTokenPort;
import org.springframework.stereotype.Service;

@Service
public record EnableClientByTokenUS(ClientRepositoryPort repository) implements EnableClientByTokenPort {

    @Override
    public void apply(String token) {

        var client = repository.findByTokenValue(token);

        if (client != null && client.getToken().notHasExpired()) {
            client.setEnabled(true);
            client.setToken(null);
        }

        repository.save(client);

    }

}
