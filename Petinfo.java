package com.example.demo.entity;

import javax.persistence.Column;

// import java.util.HashSet;
// import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
// import javax.persistence.JoinColumn;
// import javax.persistence.JoinTable;
// import javax.persistence.ManyToMany;
// import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;
import lombok.ToString;

@Data
@Entity
@Getter @Setter
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@Table(name = "tb_petinfo")
    public class Petinfo {
    @Id
    @SequenceGenerator(name="petinfo_seq",sequenceName="petinfo_seq")       
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="petinfo_seq") 
    @Column(name="Petinfo_ID")
    private @NonNull Long petID;
    private @NonNull String petName;
    private @NonNull String petType;
    private @NonNull String petSex;
    private @NonNull String symptom;
    // private Integer age;

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
    // @OneToMany
    // private Set<Appointment> appointments;


    // public Petinfo(){}
    // public Petinfo(String petName, String petType, String petSex, String symptom) {
    //     this.petName = petName;
    //     this.petSex = petSex;
    //     this.petType = petType;
    //     this.symptom = symptom;

    // }

    // public String getpetName() {
    //     return petName;
    // }

    // public void setpetName(String petName) {
    //     this.petName = petName;
    // }

    // public String getpetSex() {
    //     return petSex;
    // }

    // public void setpetSex(String petSex) {
    //     this.petSex = petSex;
    // }

    // public String getpetType() {
    //     return petType;
    // }

    // public void setpetType(String petType) {
    //     this.petType = petType;
    // }

    // public String getsymptom() {
    //     return symptom;
    // }

    // public void setsymptom(String symptom) {
    //     this.symptom = symptom;
    // }
}
 