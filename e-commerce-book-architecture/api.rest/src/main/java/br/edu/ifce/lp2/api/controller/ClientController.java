package br.edu.ifce.lp2.api.controller;

import br.edu.ifce.lp2.api.controller.request.ClientRequest;
import br.edu.ifce.lp2.api.controller.response.ClientResponse;
import br.edu.ifce.lp2.core.ports.driver.CreateClientPort;
import br.edu.ifce.lp2.core.ports.driver.DeleteClientByIdPort;
import br.edu.ifce.lp2.core.ports.driver.EnableClientByTokenPort;
import br.edu.ifce.lp2.core.ports.driver.FindClientByIdPort;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("clients")
public record ClientController(
        CreateClientPort createClientPort,
        FindClientByIdPort findClientByIdPort,
        EnableClientByTokenPort enableClientByTokenPort,
        DeleteClientByIdPort deleteClientByIdPort
) {

    @PostMapping
    public ClientResponse post(@RequestBody ClientRequest request) {
        var client = request.toClient();
        client = createClientPort.apply(client);
        return new ClientResponse().fromClient(client);
    }

    @GetMapping("{id}")
    public ClientResponse findById(@PathVariable String id) {
        var client = findClientByIdPort.apply(id);
        return new ClientResponse().fromClient(client);
    }

    @DeleteMapping("{id}")
    public void deleteById(@PathVariable String id) {
        deleteClientByIdPort.apply(id);
    }

    @PatchMapping("enable-by-token")
    public void enableByToken(@RequestParam String token) {
        enableClientByTokenPort.apply(token);
    }

}
