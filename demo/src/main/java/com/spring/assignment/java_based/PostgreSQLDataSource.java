package com.spring.assignment.java_based;

public class PostgreSQLDataSource implements DataSource {
    @Override
    public String[] getEmails() {
        return new String[] { "rick@postgresql.com", "aris@postgresql.com" };
    }
}
