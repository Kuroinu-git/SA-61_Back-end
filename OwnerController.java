package com.example.demo.controller;

import com.example.demo.entity.Owner;
import com.example.demo.repository.OwnerRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Collection;
import java.util.stream.Collectors;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
class OwnerController {
    @Autowired private OwnerRepository ownerrepository;
    public OwnerController(OwnerRepository ownerrepository) {
        this.ownerrepository = ownerrepository;
    }
    @GetMapping("/owner")
    public Collection<Owner> Owner(){
        return ownerrepository.findAll().stream().collect(Collectors.toList());

    }
}