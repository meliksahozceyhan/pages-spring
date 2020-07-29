package com.example.restexamplehtml.config;

import com.example.restexamplehtml.handlers.UserEventHandler;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RepositoryConfiguration {
    public RepositoryConfiguration(){
        super();
    }

    @Bean
    UserEventHandler userEventHandler(){
        return new UserEventHandler();
    }
}