package com.spring.assignment.java_based;

public class EmailService {
    DataSource dataSource;

    public EmailService(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    /**
     * Default (package-private): If no access modifier is specified,
     * the function is accessible only from classes within the same package.
     */
    void sendEmail() {
        String[] emails = this.dataSource.getEmails();
        for (String email : emails) {
            System.out.println("send email to " + email);
        }
    }
}
