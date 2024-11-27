package com.spring.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {

    public static void main(String[] args) {

        String message = "Hello World! Have a nice day!";

        /** without using spring framework */
        // SMSService smsService = new SMSService();
        // EmailService emailService = new EmailService();
        // MessageSender messageSender = new MessageSender(emailService);
        // messageSender.sendMessage(message);

        /** using spring framework */
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        MessageSender messageSender = applicationContext.getBean(MessageSender.class);
        messageSender.sendMessage(message);

    }
}
