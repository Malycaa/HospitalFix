package com.example.miniprojecthospitalkelompok2.payload.request;

import java.time.Instant;
import java.util.List;


import lombok.Data;

@Data
public class TreatmentRequest {
    private Long treatmentId;

    private Long patientId;

    private String sickness;

    private String sicknessDesc;

    private String sicknessHandling;

    private Instant createTime;

    private List<MedicationTreatmentReq> medications;
}
