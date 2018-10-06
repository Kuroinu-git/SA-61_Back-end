package com.example.demo.entity;


import lombok.Data;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Data
@Entity
@Table( name = "tb_owner")
public class Owner {
    @Id
    @GeneratedValue
    private  Long ownerID;
    private  String name;
    private  String Tel;

    @OneToMany
    private Set<AnimalAppointment> animalappointments;
   

    public Owner(){}
    public Owner(String name, String Tel) {
        this.name = name;
        this.Tel = Tel;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTel() {
        return Tel;
    }

    public void setTel(String Tel) {
        this.Tel = Tel;
    }

    

 
}
