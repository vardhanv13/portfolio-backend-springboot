package com.vishnu.portfolio.portfolio_backend.controller;

import com.vishnu.portfolio.portfolio_backend.model.Contact;
import com.vishnu.portfolio.portfolio_backend.service.ContactService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/contact")
@CrossOrigin(origins = "*")
public class ContactController {

    private final ContactService service;

    public ContactController(ContactService service) {
        this.service = service;
    }

    // ✅ POST (already working)
    @PostMapping
    public Contact sendMessage(@RequestBody Contact contact) {
        return service.saveMessage(contact);
    }

    // ✅ ADD THIS
    @GetMapping
    public List<Contact> getAllMessages() {
        return service.getAllMessages();
    }
}
