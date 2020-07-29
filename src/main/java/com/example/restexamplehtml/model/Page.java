package com.example.restexamplehtml.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.springframework.data.rest.core.annotation.RestResource;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "page")
@Data
@AllArgsConstructor
@NoArgsConstructor 
public class Page {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    
    @NotNull
    @Column(name = "explanation")
    private String explanation;
    @NotNull
    @Column(name = "data")
    private String data;

    @ManyToOne()
    //@JoinColumn(name = "user_id",nullable = false)
    @RestResource(exported = false)
    private WebUser user; 
}