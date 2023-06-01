package com.spring.core.javaconfig;

public class PostgreSQLDataSource implements DataSource {
    @Override
    public String[] getEmails() {
        String emails[] = {"walanagege@gmail.com", "jeffcostinar@gmail.com"};
        return emails;
    }
}
