package com.vishnu.portfolio.portfolio_backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.vishnu.portfolio.portfolio_backend.model.Profile;

public interface ProfileRepository extends JpaRepository<Profile, Long> {
}
