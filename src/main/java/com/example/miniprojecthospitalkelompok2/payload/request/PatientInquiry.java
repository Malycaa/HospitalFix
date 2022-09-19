package com.example.miniprojecthospitalkelompok2.payload.request;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class PatientInquiry {
    private String patientName;
    private Long userId;
}
