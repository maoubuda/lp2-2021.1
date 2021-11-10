package br.edu.ifce.lp2.api.controller;

import br.edu.ifce.lp2.api.controller.request.LoginRequest;
import br.edu.ifce.lp2.core.ports.driver.LoginByEmailPort;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("login")
public record LoginController(
        LoginByEmailPort loginByEmailPort
) {

    @PostMapping
    public String post(@RequestBody LoginRequest request) {
        var client = request.toClient();
        return loginByEmailPort.apply(client.getEmail(), client.getPassword());
    }

}
