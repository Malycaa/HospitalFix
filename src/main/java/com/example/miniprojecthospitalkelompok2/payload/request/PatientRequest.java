package com.example.miniprojecthospitalkelompok2.payload.request;

import java.time.Instant;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class PatientRequest {
    private Long patientId;

    private Long userId;

    private String patientName;

    private String birthPlace;

    private String birthDate;

    private String address;

    private String gender;

    private String complaints;

    private Instant registrationDate;
}
