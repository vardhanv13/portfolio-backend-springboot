package com.vishnu.portfolio.portfolio_backend.service;

import com.vishnu.portfolio.portfolio_backend.model.Contact;
import com.vishnu.portfolio.portfolio_backend.repository.ContactRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContactService {

    private final ContactRepository repository;

    public ContactService(ContactRepository repository) {
        this.repository = repository;
    }

    public Contact saveMessage(Contact contact) {
        return repository.save(contact);
    }

    // ✅ ADD THIS
    public List<Contact> getAllMessages() {
        return repository.findAll();
    }
}
