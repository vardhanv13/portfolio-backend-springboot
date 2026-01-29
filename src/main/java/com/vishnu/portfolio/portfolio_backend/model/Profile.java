package com.vishnu.portfolio.portfolio_backend.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Profile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String email;
    private Long mobile;

    private String name;
    private String role;

    @Column(length = 1000)
    private String bio;

    private String resumeLink;
    private String linkedin;
    private String github;
}