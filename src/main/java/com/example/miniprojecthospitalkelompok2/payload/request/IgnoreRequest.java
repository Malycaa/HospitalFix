package com.example.miniprojecthospitalkelompok2.payload.request;

import com.example.miniprojecthospitalkelompok2.entity.Medication;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

public class IgnoreRequest {

    @JsonIgnoreProperties({"userId", "role"})
    public static class AddAdmin extends AdminRequest {}
    
    @JsonIgnoreProperties("role")
    public static class EditAdmin extends AdminRequest {}

    @JsonIgnoreProperties({"patientId", "registrationDate"})
    public static class AddPatient extends PatientRequest {}

    @JsonIgnoreProperties({"registrationDate"})
    public static class EditPatient extends PatientRequest {}

    @JsonIgnoreProperties({"medicationId"})
    public static class AddMedication extends MedicationRequest {}

    public static class EditMedication extends MedicationRequest {}

    @JsonIgnoreProperties({"medicationName", "medicationDose"})
    public static class MedicationTreatment extends Medication {}


    @JsonIgnoreProperties({"treatmentId"})
    public static class AddTreatment extends TreatmentRequest {}
    
    public static class EditTreatment extends TreatmentRequest {}
}
