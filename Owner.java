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
    private  String ownerName;
    private  String Tel;

    @OneToMany
    private Set<Appointment> appointments;
   

    public Owner(){}
    public Owner(String ownerName, String Tel) {
        this.ownerName = ownerName;
        this.Tel = Tel;
    }
    public String getownerName() {
        return ownerName;
    }

    public void setownerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getTel() {
        return Tel;
    }

    public void setTel(String Tel) {
        this.Tel = Tel;
    }

    

 
}
