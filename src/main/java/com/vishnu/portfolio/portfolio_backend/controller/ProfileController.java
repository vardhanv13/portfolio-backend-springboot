package com.vishnu.portfolio.portfolio_backend.controller;

import com.vishnu.portfolio.portfolio_backend.model.Profile;
import com.vishnu.portfolio.portfolio_backend.service.ProfileService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/profile")
@CrossOrigin(origins = "*")
public class ProfileController {

    private final ProfileService service;

    public ProfileController(ProfileService service) {
        this.service = service;
    }

    @GetMapping
    public Profile getProfile() {
        return service.getProfile();
    }

    @PostMapping
    public Profile saveProfile(@RequestBody Profile profile) {
        return service.saveProfile(profile);
    }
    @DeleteMapping("/{id}")
    public String deleteProfile(@PathVariable Long id) {
        service.deleteProfile(id);
        return "Profile deleted successfully";
    }
}
