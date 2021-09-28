package br.edu.ifce.lp2.email.adapters;

import br.ifce.edu.lp2.core.ports.driven.email.SendEmailForTokenConfirmationPort;


public class SendEmailForTokenConfirmation implements SendEmailForTokenConfirmationPort {

    @Override
    public void apply(String email, String token) {
        System.out.println("Send email for " + email);
        System.out.println("Token: " + token);
    }
}
