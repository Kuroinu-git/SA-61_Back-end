package com.example.demo.controller;


import com.example.demo.entity.Petinfo;
import com.example.demo.repository.PetinfoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Collection;
import java.util.stream.Collectors;

@RestController
class PetinfoController {
    @Autowired  PetinfoRepository petinforepository;
    public PetinfoController(PetinfoRepository petinforepository) {
        this.petinforepository = petinforepository;
    }
    @GetMapping("/petinfo")
    @CrossOrigin(origins = "http://localhost:4200")

    public Collection<Petinfo> PetInfo(){
        return petinforepository.findAll().stream().collect(Collectors.toList());

    }
}