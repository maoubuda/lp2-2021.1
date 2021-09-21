package br.edu.ifce.lp2.app;

import br.edu.ifce.lp2.email.adapters.SendEmailForTokenConfirmation;
import br.ifce.edu.lp2.core.domain.Client;
import br.ifce.edu.lp2.core.us.CreateClientUS;

public class App {

    public static void main(String[] args) {

        var client = new Client();
        client.setEmail("thiago@lar.ifce.edu.br");

        var send = new SendEmailForTokenConfirmation();
        var port = new CreateClientUS(send);

        port.apply(client);

    }

}
