package com.example.miniprojecthospitalkelompok2.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import java.time.Instant;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "treatment_table")
public class Treatments {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long treatmentId;

    private String sickness;

    private String sicknessDesc;

    private String sicknessHandling;

    private Instant createTime;

    // @OneToMany(targetEntity = Medication.class, cascade = CascadeType.ALL)
    // @JoinColumn(name = "treatmentsId", referencedColumnName = "treatmentId")
    // private List<Medication> medications;

    @ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "medicationList",
    joinColumns = @JoinColumn(name = "treatmentId"),
    inverseJoinColumns = @JoinColumn(name = "medicationId"))
	private List<Medication> medications;
}
