package com.vishnu.portfolio.portfolio_backend.service;


import java.util.List;

import org.springframework.stereotype.Service;

import com.vishnu.portfolio.portfolio_backend.model.Project;
import com.vishnu.portfolio.portfolio_backend.repository.ProjectRepository;

@Service
public class ProjectService {

    private final ProjectRepository repository;

    public ProjectService(ProjectRepository repository) {
        this.repository = repository;
    }

    public List<Project> getAllProjects() {
        return repository.findAll();
    }

    public Project saveProject(Project project) {
        return repository.save(project);
    }
}