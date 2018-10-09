// package com.example.demo;

// import com.example.demo.repository.AppointmentRepository;
// import com.example.demo.repository.DoctorRespository;
// import com.example.demo.repository.OwnerRepository;
// import com.example.demo.repository.PetinfoRepository;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.boot.ApplicationArguments;
// import org.springframework.boot.ApplicationRunner;
// // import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
// // import org.springframework.context.annotation.Bean;
// // import org.springframework.boot.CommandLineRunner;
// import org.springframework.stereotype.Component;


// @Component
// public class DatabaseLoader implements ApplicationRunner {
//     private final OwnerRepository ownerRepository;
//     private final PetinfoRepository petinfoRespository;
//     private final AppointmentRepository appointmentRepository;
//     private final DoctorRespository doctorRepository;

// @Autowired
// public DatabaseLoader(AppointmentRepository appointmentRepository,DoctorRespository doctorRepository,
// OwnerRepository ownerRepository,PetinfoRepository petinfoRespository) {
//     this.appointmentRepository = appointmentRepository;
//     this.doctorRepository = doctorRepository;
//     this.ownerRepository = ownerRepository;
//     this.petinfoRespository = petinfoRespository;
// }
//     @Override
//     public void run(ApplicationArguments args) throws Exception {

// 	}
// }

