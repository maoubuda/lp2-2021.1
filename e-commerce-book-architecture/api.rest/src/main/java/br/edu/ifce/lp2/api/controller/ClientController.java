package br.edu.ifce.lp2.api.controller;

import br.edu.ifce.lp2.core.domain.Client;
import br.edu.ifce.lp2.core.ports.driver.CreateClientPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("clients")
public class ClientController {

    @Autowired
    private CreateClientPort createClientPort;

    @PostMapping
    public Client post(@RequestBody Client client) {
        return createClientPort.apply(client);
    }

}
