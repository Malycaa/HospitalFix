package com.example.miniprojecthospitalkelompok2.controller;
import org.springframework.http.HttpStatus;
import java.util.List;
import javax.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.miniprojecthospitalkelompok2.entity.Patients;
import com.example.miniprojecthospitalkelompok2.entity.Users;
import com.example.miniprojecthospitalkelompok2.payload.request.IgnoreRequest;
import com.example.miniprojecthospitalkelompok2.payload.request.InquiryName;
import com.example.miniprojecthospitalkelompok2.payload.request.PatientInquiry;
import com.example.miniprojecthospitalkelompok2.payload.response.CommonResponse;
import com.example.miniprojecthospitalkelompok2.repository.PatientRepository;
import com.example.miniprojecthospitalkelompok2.repository.UserRepository;
import com.example.miniprojecthospitalkelompok2.service.PatientService;
import com.example.miniprojecthospitalkelompok2.utils.Consts;

//@CrossOrigin(origins = "https://hospitalcenter-id.herokuapp.com")
@RestController
@RequestMapping("/api/patient")
public class PatientController {
    PatientService patientService;


    //1
    @PostMapping("/addPatient")
    public ResponseEntity<?> addPatient(@Valid @RequestBody IgnoreRequest.AddPatient request) {
        return patientService.addPatient(request);
    }

    @PutMapping("/editPatient")
    public ResponseEntity<?> editPatient(@Valid @RequestBody IgnoreRequest.EditPatient request) {
    return patientService.editPatient(request);
    }

    @PostMapping("/inquiryPatient")
    public ResponseEntity<?> inquiryPatient(@RequestBody PatientInquiry request) {
     return patientService.inquiryPatient(request);
    }

    @PostMapping("/inquiryPatientByAdmin")
    public ResponseEntity<?> inquiryPatientByAdmin(@RequestBody InquiryName param) {
        return patientService.inquiryPatientByAdmin(param);
    }

    @DeleteMapping("/deletePatientById/{patientId}")
    public ResponseEntity<Object> deletePatientById(@PathVariable Long patientId) {
        return patientService.deletePatientById(patientId);
    }
    @GetMapping("/getPatientById/{patientId}")
    public ResponseEntity<?> getPatientById(@PathVariable Long patientId) {
        return patientService.getPatientById(patientId);
    }
}
