package com.example.restexamplehtml.repository;

import java.util.List;

import javax.websocket.server.PathParam;

import com.example.restexamplehtml.model.Page;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource()
public interface PageRepository extends PagingAndSortingRepository<Page,Long>{
    List<Page> findPagesByUserId(@PathParam("id") long id);
}