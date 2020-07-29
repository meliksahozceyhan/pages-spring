package com.example.restexamplehtml.repository;

import java.util.List;

import com.example.restexamplehtml.model.WebUser;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "users",path = "users")
public interface WebUserRepository extends PagingAndSortingRepository<WebUser,Long> {
    List<WebUser> findByName(@Param("name")String name);
}