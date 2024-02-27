package com.school.apis.controller;

import com.school.apis.model.Contact;
import com.school.apis.proxy.ContactProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ContactController {

    @Autowired
    ContactProxy contactProxy;

    @GetMapping("/getMessages")
    public List<Contact> getMessages(@RequestParam("status") String status) {
        return contactProxy.getMessagesByStatus(status);
    }
}
