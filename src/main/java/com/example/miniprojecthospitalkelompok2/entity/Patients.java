package com.example.miniprojecthospitalkelompok2.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.time.Instant;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "patients_table")
public class Patients implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long patientId;

    private String patientName;

    private String birthPlace;

    private String birthDate;

    private String address;

    private String gender;

    private String complaints;

    private Instant registrationDate;

    @OneToMany(targetEntity = Treatments.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "patientsId", referencedColumnName = "patientId")
    private List<Treatments> treatments;

    @ManyToOne
    @JoinColumn(name = "userId")
    private Users users;
}
