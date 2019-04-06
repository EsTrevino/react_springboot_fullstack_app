package com.estebantrevino.springbackend.repositories;

import com.estebantrevino.springbackend.domain.Project;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends MongoRepository<Project, String> {
    // find all by id
    @Override
    Iterable<Project> findAllById(Iterable<String> ids);

}