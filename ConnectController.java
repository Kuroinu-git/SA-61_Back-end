// package com.example.demo.controller;

// import com.example.demo.entity.Connect;
// import com.example.demo.repository.ConnectRepository;

// import org.springframework.web.bind.annotation.CrossOrigin;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.RestController;
// import java.util.Collection;
// import java.util.stream.Collectors;

// @RestController
// class ConnectController {
//     private ConnectRepository repository;

//     public ConnectController(ConnectRepository repository) {
//         this.repository = repository;
//     }
//     @GetMapping("/Connects")
//     @CrossOrigin(origins = "http://localhost:4200")

//     public Collection<Connect> Connect(){
//         return repository.findAll().stream().collect(Collectors.toList());

//     }
// }