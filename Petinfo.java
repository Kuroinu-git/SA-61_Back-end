package com.example.demo.entity;

// import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
// import javax.persistence.JoinColumn;
// import javax.persistence.JoinTable;
// import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "tb_petInfo")
    public class Petinfo {
    @Id
    @GeneratedValue
    private long petID;
    private String petName;
    private String petType;
    private String petSex;
    // private Integer age;
    private String symptom;

    // @OneToMany
    // private Set <Connect> connects;

    // @ManyToMany(cascade = {
    // CascadeType.PERSIST,
    // CascadeType.MERGE
    // })
    // @JoinTable(name = "animal_animalappoinment",
    // joinColumns = @JoinColumn(name = "animalappoinment_id"),
    // inverseJoinColumns = @JoinColumn(name = "animal_id"))
    // @ManyToMany(mappedBy = "animalappointments")
    // private Set<Animal> animals = new HashSet<>();
    // public Animal() {
    // }
    @OneToMany
    private Set<Appointment> appointments;



    public Petinfo(String petName, String petType, String petSex, String symptom) {
        this.petName = petName;
        this.petSex = petSex;
        this.petType = petType;
        this.symptom = symptom;

    }

    public String getpetName() {
        return petName;
    }

    public void setpetName(String petName) {
        this.petName = petName;
    }

    public String getpetSex() {
        return petSex;
    }

    public void setpetSex(String petSex) {
        this.petSex = petSex;
    }

    public String getpetType() {
        return petType;
    }

    public void setpetType(String petType) {
        this.petType = petType;
    }

    public String getsymptom() {
        return symptom;
    }

    public void setsymptom(String symptom) {
        this.symptom = symptom;
    }
}
 