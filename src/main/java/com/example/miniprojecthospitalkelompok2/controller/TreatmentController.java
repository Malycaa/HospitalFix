package com.example.miniprojecthospitalkelompok2.controller;
import javax.validation.Valid;

import com.example.miniprojecthospitalkelompok2.service.TreatmentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.miniprojecthospitalkelompok2.payload.request.IgnoreRequest;


@RestController
@RequestMapping("/api/treatment")
@RequiredArgsConstructor
public class TreatmentController {

    //2

    private final TreatmentService treatmentService;
    @PostMapping("/addTreatment")
    public ResponseEntity<?> addTreatment(@Valid @RequestBody IgnoreRequest.AddTreatment request) {
        return treatmentService.addTreatment(request);
    }
}
