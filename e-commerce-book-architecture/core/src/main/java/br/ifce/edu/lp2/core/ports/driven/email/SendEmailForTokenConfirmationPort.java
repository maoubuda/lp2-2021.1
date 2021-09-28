package br.ifce.edu.lp2.core.ports.driven.email;

public interface SendEmailForTokenConfirmationPort {

    void apply(String email, String token);

}
