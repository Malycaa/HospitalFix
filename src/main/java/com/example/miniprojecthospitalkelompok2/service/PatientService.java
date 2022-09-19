package com.example.miniprojecthospitalkelompok2.service;

import java.util.List;

import com.example.miniprojecthospitalkelompok2.payload.request.InquiryName;
import com.example.miniprojecthospitalkelompok2.payload.request.PatientRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.miniprojecthospitalkelompok2.entity.Patients;
import com.example.miniprojecthospitalkelompok2.payload.request.PatientInquiry;
import com.example.miniprojecthospitalkelompok2.repository.PatientRepository;
public interface PatientService {

    ResponseEntity<?> inquiryPatient(PatientInquiry request);

    ResponseEntity<?> inquiryPatientByAdmin(InquiryName param);

    ResponseEntity<?> addPatient(PatientRequest patientRequest);

    ResponseEntity<?> editPatient(PatientRequest patientRequest);

    ResponseEntity<Object> deletePatientById(Long patientId);

    ResponseEntity<?> getPatientById (Long patientId);
}
