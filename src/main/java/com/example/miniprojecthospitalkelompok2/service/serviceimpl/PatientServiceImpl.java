package com.example.miniprojecthospitalkelompok2.service.serviceimpl;

import com.example.miniprojecthospitalkelompok2.entity.Patients;
import com.example.miniprojecthospitalkelompok2.entity.Users;
import com.example.miniprojecthospitalkelompok2.payload.request.InquiryName;
import com.example.miniprojecthospitalkelompok2.payload.request.PatientInquiry;
import com.example.miniprojecthospitalkelompok2.payload.request.PatientRequest;
import com.example.miniprojecthospitalkelompok2.payload.response.CommonResponse;
import com.example.miniprojecthospitalkelompok2.repository.PatientRepository;
import com.example.miniprojecthospitalkelompok2.repository.UserRepository;
import com.example.miniprojecthospitalkelompok2.service.PatientService;
import com.example.miniprojecthospitalkelompok2.utils.Consts;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PatientServiceImpl implements PatientService {

    private final UserRepository userRepository;
    private final PatientRepository patientRepository;

    @Override
    public ResponseEntity<?> inquiryPatient(PatientInquiry request) {
        try {
            List<Patients> lists = patientRepository.inquiryPatient(request);
            return CommonResponse.common("OK", HttpStatus.OK, lists);
        } catch (Exception e) {
            return CommonResponse.fail(e.getMessage());
        }
    }

    @Override
    public ResponseEntity<?> inquiryPatientByAdmin(InquiryName param) {
        try {
            List<Patients> lists = patientRepository.inquiryPatientByAdmin(param.getValue());
            return CommonResponse.common("OK", HttpStatus.OK, lists);
        } catch (Exception e) {
            return CommonResponse.fail(e.getMessage());
        }
    }

    @Override
    public ResponseEntity<?> addPatient(PatientRequest patientRequest){
        try {
            Users user = userRepository.findById(patientRequest.getUserId()).orElse(null);
            patientRepository.save(Consts.patientWithoutList(patientRequest, user));
            return CommonResponse.success("Patient Registered");
        } catch (Exception e) {
            return CommonResponse.fail(e.getMessage());
        }
    }

    @Override
    public ResponseEntity<?> editPatient(PatientRequest patientRequest) {
        try {
            Users user = userRepository.findById(patientRequest.getUserId()).orElse(null);
            patientRepository.save(Consts.patientWithoutList(patientRequest, user));
            return CommonResponse.success("Admin Registered");
        } catch (Exception e) {
            return CommonResponse.fail(e.getMessage());
        }
    }

    @Override
    public ResponseEntity<Object> deletePatientById(Long patientId) {
        try {
            patientRepository.deleteById(patientId);
            return CommonResponse.success("Patient Deleted");
        } catch (Exception e) {
            return CommonResponse.fail(e.getMessage());
        }
    }

    @Override
    public ResponseEntity<?> getPatientById(Long patientId) {
        try {
            Patients patients = patientRepository.findById(patientId).orElse(null);
            return CommonResponse.common("OK", HttpStatus.OK, patients);
        } catch (Exception e) {
            return CommonResponse.fail(e.getMessage());
        }
    }
}
