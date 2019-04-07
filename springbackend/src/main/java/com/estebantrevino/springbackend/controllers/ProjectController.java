package com.estebantrevino.springbackend.controllers;

import javax.validation.Valid;

import com.estebantrevino.springbackend.domain.Project;
import com.estebantrevino.springbackend.services.ProjectService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/project")
public class ProjectController {

    // inject project service into controller
    @Autowired
    private ProjectService projectService;

    // we need to be able to create a new project
    // response entity allows us to have more control of our json responses
    @PostMapping
    public ResponseEntity<Project> createNewProject(@Valid @RequestBody Project project) {

        Project project1 = projectService.saveOrUpdateProject(project);
        return new ResponseEntity<Project>(project1, HttpStatus.CREATED);
    }

}