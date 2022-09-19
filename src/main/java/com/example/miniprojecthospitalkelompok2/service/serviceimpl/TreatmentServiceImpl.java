package com.example.miniprojecthospitalkelompok2.service.serviceimpl;

import com.example.miniprojecthospitalkelompok2.entity.Patients;
import com.example.miniprojecthospitalkelompok2.payload.request.TreatmentRequest;
import com.example.miniprojecthospitalkelompok2.payload.response.CommonResponse;
import com.example.miniprojecthospitalkelompok2.repository.PatientRepository;
import com.example.miniprojecthospitalkelompok2.service.TreatmentService;
import com.example.miniprojecthospitalkelompok2.utils.Consts;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TreatmentServiceImpl implements TreatmentService {

    private final PatientRepository patRepository;

    @Override
    public ResponseEntity<Object> addTreatment(TreatmentRequest treatmentRequest) {
        try {
            Patients pat = patRepository.findById(treatmentRequest.getPatientId()).orElse(null);
            pat.getTreatments().add(Consts.toTreatment(treatmentRequest));
            patRepository.save(pat);
            return CommonResponse.success("Treatment Registered");
        } catch (Exception e) {
            return CommonResponse.fail(e.getMessage());
        }
    }
}
