package br.edu.ifce.lp2.core.us;

import br.edu.ifce.lp2.core.domain.Client;
import br.edu.ifce.lp2.core.ports.driven.repository.ClientRepositoryPort;
import br.edu.ifce.lp2.core.ports.driven.security.GenerateTokenPort;
import br.edu.ifce.lp2.core.ports.driver.LoginByEmailPort;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public record LoginByEmailUS(
        ClientRepositoryPort repository,
        GenerateTokenPort generateToken) implements LoginByEmailPort {

    @Override
    public String apply(String email, String password) {

        var client = repository.findByEmail(email);

        if(isNotClientValid(password, client)) {
            throw new RuntimeException("Client no is valid!");
        }

        return generateToken.apply(client);
    }

    private boolean isNotClientValid(String password, Client client) {
        return Objects.isNull(client) || !client.isEnabled() || !client.getPassword().equals(password);
    }

}
