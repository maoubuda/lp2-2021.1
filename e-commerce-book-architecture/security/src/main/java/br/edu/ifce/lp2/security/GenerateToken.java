package br.edu.ifce.lp2.security;

import br.edu.ifce.lp2.core.domain.Client;
import br.edu.ifce.lp2.core.ports.driven.security.GenerateTokenPort;
import com.nimbusds.jose.JOSEException;
import com.nimbusds.jose.JOSEObjectType;
import com.nimbusds.jose.JWSAlgorithm;
import com.nimbusds.jose.JWSHeader;
import com.nimbusds.jose.crypto.MACSigner;
import com.nimbusds.jwt.JWTClaimsSet;
import com.nimbusds.jwt.SignedJWT;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.Date;

@Service
public record GenerateToken() implements GenerateTokenPort {

    @Override
    public String apply(Client client) {
        try {

            var header = new JWSHeader.Builder(JWSAlgorithm.HS256)
                    .type(JOSEObjectType.JWT)
                    .keyID("123")
                    .build();

            var payload = new JWTClaimsSet.Builder()
                    .issuer("server")
                    .audience("user")
                    .subject(client.getId())
                    .expirationTime(new Date().from(Instant.now().plusSeconds(60 * 60 * 24 * 30)))
                    .build();

            var signedJwt = new SignedJWT(header, payload);
            signedJwt.sign(new MACSigner("e9d8c4bb-e5b0-4237-ad9c-a0e9b00b6a0b"));

            return signedJwt.serialize();

        } catch (JOSEException e) {
            throw new RuntimeException("Token is not valid!");
        }
    }
}
