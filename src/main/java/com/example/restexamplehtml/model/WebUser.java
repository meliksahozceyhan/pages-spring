package com.example.restexamplehtml.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "webuser")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class WebUser {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    
    @NotNull
    @Column(name = "name")
    private String name;
    @NotNull
    @Column(name = "email")
    private String email;

    @OneToMany(mappedBy = "user",cascade = CascadeType.REMOVE)
    private List<Page> pages;

}