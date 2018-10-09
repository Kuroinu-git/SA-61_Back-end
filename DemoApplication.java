package com.example.demo;

import com.example.demo.repository.*;

import java.util.Date;

import com.example.demo.entity.*;
// import com.example.demo.controller.*;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}


	@Bean
	ApplicationRunner init(AppointmentRepository appointmentRepository,
	DoctorRespository doctorRespository,
	OwnerRepository ownerRepository,
	PetinfoRepository petinfoRepository
	){
		return args -> {
			Doctor doctor1 = new Doctor();
			doctor1.setDoctorName("Dr.BlackJack");
			doctorRespository.save(doctor1);

			Doctor doctor2 = new Doctor();
			doctor2.setDoctorName("Dr.Nimp");
			doctorRespository.save(doctor2);


			Owner owner1 = new Owner();
			owner1.setOwnerName("kazuma");
			owner1.setTel("088-282-4567");
			ownerRepository.save(owner1);

			Owner owner2 = new Owner();
			owner1.setOwnerName("shiki");
			owner1.setTel("088-123-4567");
			ownerRepository.save(owner2);

			Petinfo petinfo1 = new Petinfo();
			petinfo1.setPetName("Entoma");
			petinfo1.setPetSex("Male");
			petinfo1.setPetType("Dog");
			petinfo1.setSymptom("Hight");
			petinfoRepository.save(petinfo1);

			Petinfo petinfo2 = new Petinfo();
			petinfo2.setPetName("Luna");
			petinfo2.setPetSex("Female");
			petinfo2.setPetType("Cat");
			petinfo2.setSymptom("Hight");
			petinfoRepository.save(petinfo2);

			Appointment appointment1 = new Appointment();
			appointment1.setDoctor(doctor1);
			appointment1.setOwner(owner1);
			appointment1.setPetinfo(petinfo1);
			appointment1.setAppDate(new Date());
			// appointment1.setAppTime(new Date());
			appointmentRepository.save(appointment1);

			Appointment appointment2 = new Appointment();
			appointment2.setDoctor(doctor2);
			appointment2.setOwner(owner2);
			appointment2.setPetinfo(petinfo2);
			appointment2.setAppDate(new Date());
			// appointment2.setAppTime(new Date());
			appointmentRepository.save(appointment2);

			
		};
	}

}
