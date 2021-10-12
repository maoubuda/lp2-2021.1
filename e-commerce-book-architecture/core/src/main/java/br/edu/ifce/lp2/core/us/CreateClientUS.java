package br.edu.ifce.lp2.core.us;

import br.edu.ifce.lp2.core.domain.Client;
import br.edu.ifce.lp2.core.domain.Token;
import br.edu.ifce.lp2.core.ports.driven.email.SendEmailForTokenConfirmationPort;
import br.edu.ifce.lp2.core.ports.driven.repository.ClientRepositoryPort;
import br.edu.ifce.lp2.core.ports.driver.CreateClientPort;
import org.springframework.stereotype.Service;

@Service
public record CreateClientUS(
        SendEmailForTokenConfirmationPort sendEmailForTokenConfirmationPort,
        ClientRepositoryPort repository) implements CreateClientPort {

    @Override
    public Client apply(Client client) {

        if (repository.existsByEmail(client.getEmail()))
            throw new IllegalStateException("Email já cadastrado!");

        client.setToken(new Token(4));

        client = repository.save(client);

        sendEmailForTokenConfirmationPort.apply(client.getEmail(), client.getToken().getValue());

        return client;
    }

}
