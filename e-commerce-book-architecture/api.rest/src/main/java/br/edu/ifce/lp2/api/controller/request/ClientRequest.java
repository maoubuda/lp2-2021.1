package br.edu.ifce.lp2.api.controller.request;

import br.edu.ifce.lp2.core.domain.Client;
import lombok.Setter;

@Setter
public class ClientRequest {

    private String name;
    private String password;
    private String email;

    public Client toClient() {
        var client = new Client();

        client.setName(name);
        client.setPassword(password);
        client.setEmail(email);

        return client;
    }

}
