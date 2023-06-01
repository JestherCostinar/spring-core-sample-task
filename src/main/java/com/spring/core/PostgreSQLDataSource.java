package com.spring.core;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class PostgreSQLDataSource implements DataSource{
    @Override
    public String[] getEmails() {
        String emails[] = {"walanagege@gmail.com", "jeffcostinar@gmail.com"};
        return emails;
    }
}
