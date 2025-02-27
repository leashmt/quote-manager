package com.example.quoteManager;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig {

    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**")  // Applique à toutes les routes
                        .allowedOrigins("http://localhost:8080") // Autorise le front
                        .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS") // Méthodes autorisées
                        .allowCredentials(true);
            }
        };
    }
}
