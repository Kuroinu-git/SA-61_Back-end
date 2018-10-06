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
    private  String doctorName;

    @OneToMany
    private Set<Appointment> appointments;

    public Doctor(){}
    public  Doctor(String doctorName){
        this.doctorName = doctorName;

    }

    public String getdoctorName() {
        return doctorName;
    }

    public void setdocterName(String doctorName) {
        this.doctorName = doctorName;
    }
}
