package com.vishnu.portfolio.portfolio_backend.service;

import org.springframework.stereotype.Service;

import com.vishnu.portfolio.portfolio_backend.model.Profile;
import com.vishnu.portfolio.portfolio_backend.repository.ProfileRepository;



@Service
public class ProfileService {

    private final ProfileRepository repository;

    public ProfileService(ProfileRepository repository) {
        this.repository = repository;
    }

    public Profile getProfile() {
        return repository.findAll().stream().findFirst().orElse(null);
    }

    public Profile saveProfile(Profile profile) {
        return repository.save(profile);
    }
}