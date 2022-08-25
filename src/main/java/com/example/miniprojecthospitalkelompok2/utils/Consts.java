package com.example.miniprojecthospitalkelompok2.utils;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

import com.example.miniprojecthospitalkelompok2.entity.Medication;
import com.example.miniprojecthospitalkelompok2.entity.Patients;
import com.example.miniprojecthospitalkelompok2.entity.Treatments;
import com.example.miniprojecthospitalkelompok2.entity.Users;
import com.example.miniprojecthospitalkelompok2.payload.request.AdminRequest;
import com.example.miniprojecthospitalkelompok2.payload.request.MedicationRequest;
import com.example.miniprojecthospitalkelompok2.payload.request.PatientRequest;
import com.example.miniprojecthospitalkelompok2.payload.request.TreatmentRequest;

public class Consts {
    public static Users toUser(AdminRequest request) {
        Users model = new Users();
        if (request.getUserId() != null) {
            model.setUserId(request.getUserId());
        }
        if (request.getRole() != null && request.getRole() != "") {
            model.setRole(request.getRole());
        }
        if (request.getPassword() != null && request.getPassword() != "") {
            model.setPassword(request.getPassword());
        }
        model.setFullName(request.getFullName());
        model.setUserName(request.getUserName());
        model.setAddress(request.getAddress());
        model.setGender(request.getGender());
        model.setEmail(request.getEmail());
        model.setAge(request.getAge());

        return model;
    }

    public static Patients patientWithoutList(PatientRequest req, Users user) {
        Patients model = new Patients();
        if (req.getPatientId() != null) {
            model.setPatientId(req.getPatientId());
        }

        model.setPatientName(req.getPatientName());
        model.setBirthPlace(req.getBirthPlace());
        model.setBirthDate(req.getBirthDate());
        model.setAddress(req.getAddress());
        model.setGender(req.getGender());
        model.setComplaints(req.getComplaints());
        model.setRegistrationDate(Instant.now());
        model.setUsers(user);
        return model;
    }

    public static Treatments toTreatment(TreatmentRequest req) {
        List<Medication> list = new ArrayList<Medication>();
        Treatments model = new Treatments();
        if (req.getTreatmentId() != null) {
            model.setTreatmentId(req.getTreatmentId());
        }

        req.getMedications().forEach((i) -> {
            Medication newModel = new Medication();
            newModel.setMedicationId(i.getMedicationId());
            list.add(newModel);
        });

        model.setSickness(req.getSickness());
        model.setSicknessDesc(req.getSicknessDesc());
        model.setSicknessHandling(req.getSicknessHandling());
        model.setCreateTime(Instant.now());
        model.setMedications(list);
        return model;
    }

    public static Medication toMedication(MedicationRequest req) {
        Medication model = new Medication();
        if (req.getMedicationId() != null) {
            model.setMedicationId(req.getMedicationId());
        }

        model.setMedicationName(req.getMedicationName());
        model.setMedicationDose(req.getMedicationDose());
        return model;
    }
}
