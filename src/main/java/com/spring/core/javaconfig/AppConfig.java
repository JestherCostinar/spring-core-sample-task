package com.spring.core.javaconfig;

import com.spring.core.DataSource;
import com.spring.core.EmailService;
import com.spring.core.MySQLDataSource;
import com.spring.core.PostgreSQLDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.spring.core.javaconfig")
public class AppConfig {

    @Bean
    public DataSource mySQLDataSource() {
        return new MySQLDataSource();
    }

    @Bean
    public DataSource postgreSQLDataSource() {
        return new PostgreSQLDataSource();
    }

    @Bean
    public EmailService emailService() {
        return new EmailService(postgreSQLDataSource());
    }
}
