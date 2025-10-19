package com.example.backendproductos.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import jakarta.annotation.PostConstruct;

@Configuration
public class DatabaseConfig {

    @Value("${DATABASE_URL:}")
    private String databaseUrl;

    @PostConstruct
    public void fixDatabaseUrl() {
        if (databaseUrl != null && !databaseUrl.startsWith("jdbc:")) {
            System.setProperty("DATABASE_URL", "jdbc:" + databaseUrl);
        }
    }
}