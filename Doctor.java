package com.example.demo.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;

// import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import io.micrometer.core.lang.NonNull;

// import javax.persistence.OneToMany;
// import javax.persistence.Table;

@Entity
@Data
@Getter @Setter
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@Table(name="tb_doctor")
public class Doctor {
    @Id
    @SequenceGenerator(name="doctor_seq",sequenceName="doctor_seq")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "doctor_seq")
    @Column(name = "Doctor_ID")
    private  @NonNull Long doctorID;
    private  @NonNull String doctorName;

    // @OneToMany
    // private Set<Appointment> appointments;

    // public Doctor(){}
    // public  Doctor(String doctorName){
    //     this.doctorName = doctorName;

    // }

    // public String getdoctorName() {
    //     return doctorName;
    // }

    // public void setdocterName(String doctorName) {
    //     this.doctorName = doctorName;
    // }
}
