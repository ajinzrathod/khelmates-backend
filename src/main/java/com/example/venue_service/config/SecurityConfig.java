package com.example.venue_service.config;


import com.ajinz.common.config.BaseSecurityConfig;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;

@Configuration
public class SecurityConfig extends BaseSecurityConfig {
    @Override
    protected void configureAuthorization(HttpSecurity http) throws Exception {
        http.authorizeHttpRequests(auth -> auth
                .anyRequest().permitAll()
        );
    }
}
