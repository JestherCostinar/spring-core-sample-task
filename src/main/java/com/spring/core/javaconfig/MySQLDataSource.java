package com.spring.core.javaconfig;

public class MySQLDataSource implements DataSource {
    @Override
    public String[] getEmails() {
        String emails[] = {"jesther.jc15@gmail.com", "jersey.alto@gmail.com"};
        return emails;
    }
}
