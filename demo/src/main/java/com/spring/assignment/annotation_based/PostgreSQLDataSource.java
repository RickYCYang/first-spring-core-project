package com.spring.assignment.annotation_based;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class PostgreSQLDataSource implements DataSource {
    @Override
    public String[] getEmails() {
        return new String[] { "rick@postgresql.com", "aris@postgresql.com" };
    }
}
