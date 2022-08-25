package com.example.miniprojecthospitalkelompok2.payload.request;
import lombok.Data;

@Data
public class MedicationRequest {
    private Long medicationId;

    private String medicationName;

    private String medicationDose;
}
