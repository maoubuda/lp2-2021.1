package br.edu.ifce.lp2.core.domain;

import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang3.RandomStringUtils;

import java.time.LocalDateTime;

@Getter
@Setter
public class Token {

    private String value;
    private LocalDateTime expiredAt;

    public Token() {
    }

    public Token(int n) {
        this.expiredAt = LocalDateTime.now().plusMinutes(30);
        this.value = RandomStringUtils.randomAlphabetic(n);
    }

    public boolean hasExpired() {
        return this.expiredAt.isBefore(LocalDateTime.now());
    }

    public boolean notHasExpired() {
        return !hasExpired();
    }

}
