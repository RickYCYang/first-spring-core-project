package com.spring.assignment.java_based;

public class MySQLDataSource implements DataSource {
    @Override
    public String[] getEmails() {
        return new String[] { "rick@mysql.com", "aris@mysql.com" };
    }
}
