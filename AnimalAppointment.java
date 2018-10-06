package com.example.demo.entity;

// import java.util.HashSet;
// import java.util.Set;

// import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
// import javax.persistence.JoinTable;
// import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table( name = "tb_animalappointment")
public class AnimalAppointment {
    @Id
    @GeneratedValue
    private Long appointmentID;
    private String time;
    private String date;

    // @OneToMany
    // private Set <Connect> Connects;
    
    // @ManyToMany
    // (cascade = { 
    //     CascadeType.PERSIST, 
    //     CascadeType.MERGE,
    // })
    // @JoinTable(name = "animalappointment_animal",
    //     joinColumns = @JoinColumn(name = "appoinmentID"),
    //     inverseJoinColumns = @JoinColumn(name = "animalID"))
    //     private Set<AnimalAppointment> AnimalAppointments = new HashSet<>();
    @ManyToOne 
    @JoinColumn(name = "animalID")
    private Animal animal;
    @ManyToOne 
     @JoinColumn(name = "doctorID")
    private Doctor doctor;
    @ManyToOne  
    @JoinColumn(name = "ownerID")
    private Owner owner;

   
 

    public AnimalAppointment(){}
    public AnimalAppointment(String time,String string,Doctor doctor,Owner owner,Animal animal){
        this.time = time;
        this.date = string;
        this.doctor = doctor;
        this.owner = owner;
        this.animal = animal;

    }
    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

}
