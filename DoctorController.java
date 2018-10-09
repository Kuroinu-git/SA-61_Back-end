package com.example.demo.controller;

import com.example.demo.entity.Doctor;
import com.example.demo.repository.DoctorRespository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Collection;
import java.util.stream.Collectors;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
class DoctorController {
    @Autowired  private DoctorRespository doctorrepository;
    public DoctorController(DoctorRespository doctorrepository) {
        this.doctorrepository = doctorrepository;
    }
    @GetMapping("/doctor")
    public Collection<Doctor> Doctor(){
        return doctorrepository.findAll().stream().collect(Collectors.toList());

    }
}