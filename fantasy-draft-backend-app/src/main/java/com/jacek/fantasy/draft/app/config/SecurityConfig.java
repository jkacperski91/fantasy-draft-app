package com.jacek.fantasy.draft.app.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.stereotype.Component;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http.authorizeHttpRequests(auth ->
                        auth.anyRequest().permitAll())
                .csrf(csrf -> csrf.disable())
                .httpBasic(httpBasic -> httpBasic.disable());
        return http.build();
    }
}
