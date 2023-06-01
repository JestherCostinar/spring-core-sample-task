package com.spring.core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmailService {
    private DataSource dataSource;

    @Autowired
    public EmailService(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public void sendEmail() {
        String emails[] = this.dataSource.getEmails();
        for (String email : emails) {
            System.out.println(email);
        }
    }
}
