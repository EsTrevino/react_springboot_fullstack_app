package com.estebantrevino.springbackend.services;

import com.estebantrevino.springbackend.domain.Project;
import com.estebantrevino.springbackend.repositories.ProjectRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//using a service allows the business logic to be seperated from the controller object
//this allows us to decouple business logic from routing 
@Service
public class ProjectService {

    // autowired injects the project repository into this service object
    @Autowired
    private ProjectRepository projectRepository;

    public Project saveOrUpdateProject(Project project) {
        // business object goes here
        return projectRepository.save(project);
    }

}