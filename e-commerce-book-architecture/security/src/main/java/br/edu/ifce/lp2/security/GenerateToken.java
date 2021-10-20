package br.edu.ifce.lp2.security;

import br.edu.ifce.lp2.core.domain.Client;
import com.nimbusds.jose.JOSEException;
import com.nimbusds.jose.JOSEObjectType;
import com.nimbusds.jose.JWSAlgorithm;
import com.nimbusds.jose.JWSHeader;
import com.nimbusds.jose.crypto.ECDSASigner;
import com.nimbusds.jose.crypto.MACSigner;
import com.nimbusds.jose.jwk.Curve;
import com.nimbusds.jose.jwk.gen.ECKeyGenerator;
import com.nimbusds.jwt.JWTClaimsSet;
import com.nimbusds.jwt.SignedJWT;

import java.security.interfaces.ECPrivateKey;
import java.time.Instant;
import java.util.Date;
import java.util.UUID;

public class GenerateToken {

    public static void main(String[] args) {

        var client = new Client();
        client.setId(UUID.randomUUID().toString());
        client.setEmail("thiago@lar.ifce.edu.br");
        client.setPassword("1234");

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

            var jwt = signedJwt.serialize();

            System.out.println(jwt);

        } catch (JOSEException e) {
            e.printStackTrace();
        }

    }

}
