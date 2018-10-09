package com.example.demo.entity;


import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;

// import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
// import javax.persistence.OneToMany;
import javax.persistence.Table;


@Data
@Entity
@Getter @Setter
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@Table( name = "tb_owner")
public class Owner {
    @Id
    @SequenceGenerator(name="owner_seq",sequenceName="owner_seq")
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "owner_seq")
    @Column(name="Owner_ID")
    private  @NonNull   Long ownerID;
    private  @NonNull   String ownerName;
    private  @NonNull   String tel;

    // @OneToMany
    // private Set<Appointment> appointments;
   

    // public Owner(){}
    // public Owner(String ownerName, String Tel) {
    //     this.ownerName = ownerName;
    //     this.Tel = Tel;
    // }
    // public String getownerName() {
    //     return ownerName;
    // }

    // public void setownerName(String ownerName) {
    //     this.ownerName = ownerName;
    // }

    // public String getTel() {
    //     return Tel;
    // }

    // public void setTel(String Tel) {
    //     this.Tel = Tel;
    // }

    

 
}
