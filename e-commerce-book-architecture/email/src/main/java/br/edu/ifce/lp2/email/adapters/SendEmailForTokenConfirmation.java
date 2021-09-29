package br.edu.ifce.lp2.email.adapters;

import br.edu.ifce.lp2.core.ports.driven.email.SendEmailForTokenConfirmationPort;
import org.springframework.stereotype.Service;

@Service
public class SendEmailForTokenConfirmation implements SendEmailForTokenConfirmationPort {

    @Override
    public void apply(String email, String token) {
        System.out.println("Send email for " + email);
        System.out.println("Token: " + token);
    }
}
