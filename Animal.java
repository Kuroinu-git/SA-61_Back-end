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
@Table(name = "tb_animal")
public class Animal {
    @Id
    @GeneratedValue
    private long animalID;
    private String animalName;
    private String animalType;
    private String animalSex;
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
    private Set<AnimalAppointment> animalappointments;



    public Animal(String animalName, String animalType, String animalSex, String symptom) {
        this.animalName = animalName;
        this.animalSex = animalSex;
        this.animalType = animalType;
        this.symptom = symptom;

    }

    public String getanimalName() {
        return animalName;
    }

    public void setanimalName(String animalName) {
        this.animalName = animalName;
    }

    public String getanimalSex() {
        return animalSex;
    }

    public void setanimalSex(String animalSex) {
        this.animalSex = animalSex;
    }

    public String getanimalType() {
        return animalType;
    }

    public void setanimalType(String animalType) {
        this.animalType = animalType;
    }

    public String getsymptom() {
        return symptom;
    }

    public void setsymptom(String symptom) {
        this.symptom = symptom;
    }
}
 