package br.ifce.edu.lp2.core.us;

import br.ifce.edu.lp2.core.domain.Client;
import br.ifce.edu.lp2.core.ports.driven.SendEmailForTokenConfirmationPort;
import br.ifce.edu.lp2.core.ports.driver.CreateClientPort;

import java.util.UUID;

public record CreateClientUS(
        SendEmailForTokenConfirmationPort sendEmailForTokenConfirmationPort) implements CreateClientPort {

    @Override
    public String apply(Client client) {
        System.out.println("Verificar se não existe nenhum email igual");
        System.out.println("Salvar no banco de dados");

        sendEmailForTokenConfirmationPort.apply(client.getEmail(), "abcd309");

        return UUID.randomUUID().toString();
    }

}
