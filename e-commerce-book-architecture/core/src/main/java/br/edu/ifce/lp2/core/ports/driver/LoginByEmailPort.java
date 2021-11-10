package br.edu.ifce.lp2.core.ports.driver;

public interface LoginByEmailPort {

    String apply(String email, String password);
}
