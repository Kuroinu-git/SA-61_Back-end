package com.example.demo.repository;
import com.example.demo.entity.Doctor;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
// import org.springframework.web.bind.annotation.CrossOrigin;


// @CrossOrigin(origins = "http://localhost:4200")
@RepositoryRestResource
public
interface DoctorRespository extends JpaRepository<Doctor, Long> {
Doctor findBydoctorName(String doctorName);
}