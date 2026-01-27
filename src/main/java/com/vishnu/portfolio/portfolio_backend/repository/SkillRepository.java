package com.vishnu.portfolio.portfolio_backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.vishnu.portfolio.portfolio_backend.model.Skill;

public interface SkillRepository extends JpaRepository<Skill, Long> {
}
