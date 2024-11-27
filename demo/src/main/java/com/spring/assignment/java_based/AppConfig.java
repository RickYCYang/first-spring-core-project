package com.spring.assignment.java_based;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public DataSource mySQLDataSource() {
        return new MySQLDataSource();
    }

    @Bean
    public DataSource postgreSQLDataSource() {
        return new PostgreSQLDataSource();
    }

    @Bean
    public EmailService emailService() {
        return new EmailService(postgreSQLDataSource());
    }
}
