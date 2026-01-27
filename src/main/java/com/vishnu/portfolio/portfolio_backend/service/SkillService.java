package com.vishnu.portfolio.portfolio_backend.service;

import com.vishnu.portfolio.portfolio_backend.model.Skill;
import com.vishnu.portfolio.portfolio_backend.repository.SkillRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SkillService {

    private final SkillRepository repository;

    public SkillService(SkillRepository repository) {
        this.repository = repository;
    }

    public List<Skill> getAllSkills() {
        return repository.findAll();
    }

    public Skill saveSkill(Skill skill) {
        return repository.save(skill);
    }
}