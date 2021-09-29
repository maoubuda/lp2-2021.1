package br.edu.ifce.lp2.core.us;

import br.edu.ifce.lp2.core.domain.Client;
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

        System.out.println("Verificar se não existe nenhum email igual");

        client = repository.save(client);
        sendEmailForTokenConfirmationPort.apply(client.getEmail(), "abcd309");

        return client;
    }

}
