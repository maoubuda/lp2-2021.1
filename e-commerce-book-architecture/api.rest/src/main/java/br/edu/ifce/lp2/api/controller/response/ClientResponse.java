package br.edu.ifce.lp2.api.controller.response;

import br.edu.ifce.lp2.core.domain.Client;
import lombok.Getter;

@Getter
public class ClientResponse {

    private String id;
    private String name;
    private String email;

    public ClientResponse fromClient(Client client) {
        this.id = client.getId();
        this.name = client.getName();
        this.email = client.getEmail();

        return this;
    }

}
