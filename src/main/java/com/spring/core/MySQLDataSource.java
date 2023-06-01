package com.spring.core;

import org.springframework.stereotype.Component;

@Component
public class MySQLDataSource implements DataSource{
    @Override
    public String[] getEmails() {
        String emails[] = {"jesther.jc15@gmail.com", "jersey.alto@gmail.com"};
        return emails;
    }
}
