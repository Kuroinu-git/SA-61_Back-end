// package com.example.demo.entity;


// import javax.persistence.Entity;
// import javax.persistence.GeneratedValue;
// import javax.persistence.Id;
// import javax.persistence.ManyToOne;
// import javax.persistence.Table;

// import lombok.Data;

// @Entity
// @Data
// @Table( name = "connect" )
// public class Connect {
//     @Id
//     @GeneratedValue
//     private Long id;

//     @ManyToOne
//     private Animal animal;

//     @ManyToOne
//     private AnimalAppointment animalappointment;

//     public Connect(){}
//     public Connect(Animal animal,AnimalAppointment animalappointment){
//     this.animal = animal;
//     this.animalappointment = animalappointment;

//     }
// 	public void save(Connect connect) {
// 	}
// }