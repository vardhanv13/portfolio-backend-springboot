package com.vishnu.portfolio.portfolio_backend.controller;

import com.vishnu.portfolio.portfolio_backend.model.Contact;
import com.vishnu.portfolio.portfolio_backend.service.ContactService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/contact")
@CrossOrigin(origins = "*")
public class ContactController {

    private final ContactService service;

    public ContactController(ContactService service) {
        this.service = service;
    }

    @PostMapping
    public Contact sendMessage(@RequestBody Contact contact) {
        return service.saveMessage(contact);
    }
    @GetMapping
    public Contact getContact() {
        return service.getContact();
    }
}
