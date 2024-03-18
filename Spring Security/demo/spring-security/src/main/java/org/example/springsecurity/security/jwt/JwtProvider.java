package org.example.springsecurity.security.jwt;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.authentication.AuthenticationCredentialsNotFoundException;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Component;

import javax.crypto.SecretKey;
import java.util.Base64;
import java.util.Date;

@Component //gerer par contexte spring
public class JwtProvider {

    @Value("${jwt.secret}") //dans application.properties
    private String secret;
    private SecretKey  getSigninKey(){

        byte[] keyBytes = Base64.getDecoder().decode(secret);
        return Keys.hmacShaKeyFor(keyBytes);
    }
    // Authentification est interface core
    public String generateToken(Authentication authentication){
        String username = authentication.getName();
        Date currentDate = new Date();
        Date expireDate = new Date (currentDate.getTime()+  86400000);


        String token = Jwts.builder()
                .setSubject(username)
                .setExpiration(expireDate)
                .setIssuedAt(new Date())
                .signWith( getSigninKey(), SignatureAlgorithm.HS512)
                .compact();
        return token;
    }

    public boolean validateToken(String token){
        try {
            Jwts.parserBuilder()
                    .setSigningKey(getSigninKey())
                    .build()
                    .parseClaimsJws(token);
            return true;
        }catch (Exception e){
            throw new AuthenticationCredentialsNotFoundException("JWT expried or incorect");
        }
    }

}
