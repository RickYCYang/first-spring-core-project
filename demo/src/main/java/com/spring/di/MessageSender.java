package com.spring.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MessageSender {

    @Autowired
    @Qualifier("emailService")
    private MessageService messageService;

    @Autowired
    // @Qualifier("smsService")
    private MessageService smsService;

    // @Autowired
    // public MessageSender(@Qualifier("smsService") MessageService messageService)
    // {
    // this.messageService = messageService;
    // System.out.println("constructor based dependency injection 1");
    // }

    // @Autowired
    // public MessageSender(@Qualifier("emailService") MessageService
    // messageService,
    // @Qualifier("smsService") MessageService smsService) {
    // this.messageService = messageService;
    // this.smsService = smsService;
    // System.out.println("constructor based dependency injection 2");
    // }

    /**
     * Belows are setter based dependency injection.
     * Spring team recommend to use constructor based dependency injection.
     */
    // @Autowired
    // public void setMessageService(@Qualifier("emailService") MessageService
    // messageService) {
    // this.messageService = messageService;
    // System.out.println("setter based dependency injection 1");
    // }

    // @Autowired
    // public void setSmsService(@Qualifier("smsService") MessageService smsService)
    // {
    // this.smsService = smsService;
    // System.out.println("setter based dependency injection 2");
    // }

    public void sendMessage(String message) {
        this.messageService.sendMessage(message);
        this.smsService.sendMessage(message);
    }

}
