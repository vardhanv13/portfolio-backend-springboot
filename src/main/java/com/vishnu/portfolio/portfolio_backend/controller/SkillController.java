package com.vishnu.portfolio.portfolio_backend.controller;

import com.vishnu.portfolio.portfolio_backend.model.Skill;
import com.vishnu.portfolio.portfolio_backend.service.SkillService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/skills")
@CrossOrigin(origins = "*")
public class SkillController {

    private final SkillService service;

    public SkillController(SkillService service) {
        this.service = service;
    }

    @GetMapping
    public List<Skill> getSkills() {
        return service.getAllSkills();
    }

    @PostMapping
    public Skill addSkill(@RequestBody Skill skill) {
        return service.saveSkill(skill);
    }
}
