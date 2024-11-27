package com.spring.assignment.annotation_based;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {
    public static void main(String[] args) {
        try (var applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);) {
            EmailService emailService = applicationContext.getBean(EmailService.class);
            emailService.sendEmail();
        }
    }
}
