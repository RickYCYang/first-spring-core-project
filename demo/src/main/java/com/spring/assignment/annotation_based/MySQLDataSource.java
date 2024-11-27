package com.spring.assignment.annotation_based;

import org.springframework.stereotype.Component;

@Component
public class MySQLDataSource implements DataSource {
    @Override
    public String[] getEmails() {
        return new String[] { "rick@mysql.com", "aris@mysql.com" };
    }
}
