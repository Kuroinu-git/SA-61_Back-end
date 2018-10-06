package com.example.demo.entity;

import lombok.Data;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Data
@Table(name="tb_doctor")
public class Doctor {
    @Id
    @GeneratedValue
    private  Long doctorID;
    private  String name;

    @OneToMany
    private Set<AnimalAppointment> animalappointments;

    public Doctor(){}
    public  Doctor(String name){
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
