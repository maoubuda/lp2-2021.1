package br.ifce.edu.lp2.core.ports.driven;

public interface SendEmailForTokenConfirmationPort {

    void apply(String email, String token);

}
