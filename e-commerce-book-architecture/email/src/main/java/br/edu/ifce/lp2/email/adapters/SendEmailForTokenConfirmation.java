package br.edu.ifce.lp2.email.adapters;

import br.edu.ifce.lp2.core.ports.driven.email.SendEmailForTokenConfirmationPort;
import br.edu.ifce.lp2.email.SmtpSendEmail;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public record SendEmailForTokenConfirmation(SmtpSendEmail sendEmail) implements SendEmailForTokenConfirmationPort {

    @Override
    public void apply(String email, String token) {
        sendEmail.apply(Set.of(email), "Email for confirmation!", token);
    }
}
