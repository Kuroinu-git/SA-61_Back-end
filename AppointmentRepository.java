package com.example.demo.repository;

import com.example.demo.entity.Appointment;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
// import org.springframework.data.rest.webmvc.RepositoryRestController;
// import org.springframework.web.bind.annotation.CrossOrigin;

// @CrossOrigin(origins = "http://localhost:4200")
// @RepositoryRestController
@RepositoryRestResource
public interface AppointmentRepository extends JpaRepository<Appointment, Long> {


}