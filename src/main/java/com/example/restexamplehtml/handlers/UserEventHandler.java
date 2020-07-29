package com.example.restexamplehtml.handlers;


import com.example.restexamplehtml.model.WebUser;
import com.example.restexamplehtml.repository.PageRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.core.annotation.HandleBeforeDelete;
import org.springframework.data.rest.core.annotation.RepositoryEventHandler;

@RepositoryEventHandler
public class UserEventHandler {
    @Autowired
    PageRepository pageRepository;
    @HandleBeforeDelete()
    public void handleUserBeforeDelete(WebUser user){
    }
}