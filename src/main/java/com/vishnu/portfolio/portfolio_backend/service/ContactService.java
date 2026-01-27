package com.vishnu.portfolio.portfolio_backend.service;

import com.vishnu.portfolio.portfolio_backend.model.Contact;
import com.vishnu.portfolio.portfolio_backend.repository.ContactRepository;
import org.springframework.stereotype.Service;

@Service
public class ContactService {

    private final ContactRepository repository;

    public ContactService(ContactRepository repository) {
        this.repository = repository;
    }

    public Contact saveMessage(Contact contact) {
        return repository.save(contact);
    }
    public Contact getContact() {
        return repository.findAll().stream().findFirst().orElse(null);
    }
}