package com.example.demo.controller;

import com.example.demo.entity.Appointment;
import com.example.demo.entity.Doctor;
import com.example.demo.entity.Owner;
import com.example.demo.entity.Petinfo;
import com.example.demo.repository.AppointmentRepository;
import com.example.demo.repository.DoctorRespository;
import com.example.demo.repository.OwnerRepository;
import com.example.demo.repository.PetinfoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import java.util.Collection;
import java.util.Date;
import java.util.stream.Collectors;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class AppointmentController {
 
    @Autowired private PetinfoRepository petinfoRespository;
        @Autowired private DoctorRespository doctorRepository;
        @Autowired private OwnerRepository ownerRepository;
        @Autowired private AppointmentRepository appointmentRepository;

  
    // public AppointmentController(AppointmentRepository appointmentRepository,DoctorRespository doctorRepository,
    // OwnerRepository ownerRepository,PetinfoRepository petinfoRespository) {
    //     this.appointmentRepository = appointmentRepository;
    //     this.doctorRepository = doctorRepository;
    //     this.ownerRepository = ownerRepository;
    //     this.petinfoRespository = petinfoRespository;
    // }
    public AppointmentController(AppointmentRepository appointmentRepository){
        this.appointmentRepository = appointmentRepository;
    }
    @GetMapping(path = "/appointments", produces = MediaType.APPLICATION_JSON_VALUE )
    public Collection<Appointment> Appointment(){
        return appointmentRepository.findAll().stream().collect(Collectors.toList());
    }
   @PostMapping("/appointments/{ownerName}/{tel}/{petType}/{petName}/{petSex}/{symptom}/{doctorName}")
public Appointment newAppointment(@RequestBody Appointment newAppointment,
                        @PathVariable String ownerName,
                        @PathVariable String tel,
                        @PathVariable String type,
                        @PathVariable String petName,
                        @PathVariable String petType,
                        @PathVariable String petSex,
                        @PathVariable String symptom,
                        @PathVariable String doctorName){
Owner appOwner = ownerRepository.findByownerName(ownerName);
Doctor appDoctor = doctorRepository.findBydoctorName(doctorName);
Petinfo appPet = petinfoRespository.findBypetName(petName);

newAppointment.setOwner(appOwner);
newAppointment.setDoctor(appDoctor);
newAppointment.setPetinfo(appPet);

newAppointment.setAppDate(new Date());
// newAppointment.setAppTime(new Date());
return appointmentRepository.save(newAppointment);
 }                 
   
} 
