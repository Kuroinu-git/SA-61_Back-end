package com.example.demo.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
// import javax.persistence.Temporal;
// import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;
import lombok.ToString;

@Entity
@Data
@Getter @Setter
@NoArgsConstructor
@EqualsAndHashCode
@ToString
@Table (name = "tb_appoinment")
public class Appointment {
    @Id
    @SequenceGenerator(name="appoinment_seq",sequenceName="appoinment_seq")
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="appoinment_seq")
    @Column(name = "App_ID")
    private @NonNull Long appID;
    // @Temporal(TemporalType.DATE)
    private @NonNull Date appDate;

    @ManyToOne (fetch = FetchType.LAZY,targetEntity = Petinfo.class, optional = false)
    @JoinColumn(name = "petID", insertable = true) 
    @JsonIgnore
    private Petinfo petinfo;

    @ManyToOne (fetch = FetchType.LAZY,targetEntity = Doctor.class, optional = false)
    @JoinColumn(name = "doctorID", insertable = true)
    @JsonIgnore
    private Doctor doctor;

    @ManyToOne (fetch = FetchType.LAZY,targetEntity = Owner.class, optional = false)
    @JoinColumn(name = "ownerID", insertable = true)
    @JsonIgnore
    private Owner owner;

    // public Appointment(){}
    // public Appointment(Date appTime, Date appDate, Doctor doctor, Owner owner, Petinfo petinfo){
    //     this.appTime = appTime;
    //     this.appDate = appDate;
    //     this.doctor = doctor;
    //     this.owner = owner;
    //     this.petinfo = petinfo;

    // }
    // public Date getappTime() {
    //     return appTime;
    // }

    // public void setappTime(Date appTime) {
    //     this.appTime = appTime;
    // }
    // public Date getappDate() {
    //     return appDate;
    // }

    // public void setappDate(Date appDate) {
    //     this.appDate = appDate;
    // }

}
