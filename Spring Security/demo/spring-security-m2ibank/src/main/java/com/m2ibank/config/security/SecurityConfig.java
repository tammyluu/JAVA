package com.m2ibank.config.security;

import com.m2ibank.config.jwt.JwtAuthenticationEntryPoint;
import com.m2ibank.config.jwt.JwtRequestFilter;
import com.m2ibank.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;

import java.util.Arrays;
import java.util.Collections;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    private final CustomerService customerService;

    private final JwtAuthenticationEntryPoint jwtAuthentificationEntryPoint;
    @Autowired
    JwtRequestFilter jwtRequestFilter;
    public SecurityConfig(CustomerService customerService, JwtAuthenticationEntryPoint jwtAuthentificationEntryPoint) {
        this.customerService = customerService;
        this.jwtAuthentificationEntryPoint = jwtAuthentificationEntryPoint;
    }


    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .csrf(csrf -> csrf.disable())
                .cors(cors -> cors.configurationSource(corsConfigurationSource()))
                .sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
                .authorizeHttpRequests((authorize) -> authorize
                        .requestMatchers("/notices","/contact","/auth/register").permitAll()
                        .requestMatchers("/myAccount","/myLoans").hasAnyRole("USER")
                        .requestMatchers("/myBalance").hasAnyRole("USER","ADMIN")
                        .requestMatchers("*").authenticated()

                )
                .exceptionHandling(exceptions->exceptions.authenticationEntryPoint(jwtAuthentificationEntryPoint))
                .addFilterBefore(jwtRequestFilter, UsernamePasswordAuthenticationFilter.class)
                .httpBasic(Customizer.withDefaults())
                .formLogin(Customizer.withDefaults());

        return http.build();
    }
    @Bean
    public JwtRequestFilter jwtAuthenticationFilter() {
        return new JwtRequestFilter(customerService);
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Autowired
    private AuthenticationConfiguration authenticationConfiguration;

    @Bean
    public AuthenticationManager authenticationManager() throws Exception {
        return authenticationConfiguration.getAuthenticationManager();
    }
    @Bean
    public CorsConfigurationSource corsConfigurationSource() {
        CorsConfiguration configuration = new CorsConfiguration();
        configuration.setAllowedOriginPatterns(Collections.singletonList("*")); // Permettre toutes les origines
        configuration.setAllowedMethods(Arrays.asList("GET", "POST", "PUT", "PATCH", "DELETE", "OPTIONS")); // Permettre toutes les méthodes
        configuration.setAllowedHeaders(Arrays.asList("*")); // Permettre tous les headers si non préciser le type de retour de header
        configuration.setAllowCredentials(true); // Important pour les cookies, l'autorisation, etc.
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        // à quel niveau  que j'applique
        source.registerCorsConfiguration("/**", configuration); // Appliquer cette configuration à tous les chemins
        return source;
    }

}
