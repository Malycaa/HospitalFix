package com.example.miniprojecthospitalkelompok2.service;

import com.example.miniprojecthospitalkelompok2.payload.request.TreatmentRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;


public interface TreatmentService {

    ResponseEntity<Object> addTreatment(TreatmentRequest treatmentRequest);
}
