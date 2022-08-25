package com.example.miniprojecthospitalkelompok2.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.miniprojecthospitalkelompok2.entity.Patients;
import com.example.miniprojecthospitalkelompok2.payload.request.PatientInquiry;

@Repository
public interface PatientRepository extends JpaRepository<Patients, Long> {
    @Query(value = "SELECT * FROM patients_table p"
            + " JOIN user_table ut ON p.userId  = ut.user_id"
            + " WHERE p.patientName LIKE :#{#param.patientName}%"
            + " AND ut.role = 'USER_TYPE_DOCTOR'"
            + " AND ut.userId = :#{#param.userId}", nativeQuery = true)
    List<Patients> inquiryPatient(@Param("param") PatientInquiry param);

    @Query(value = "SELECT * FROM patients_table p"
            + " WHERE p.patientName LIKE :param%", nativeQuery = true)
    List<Patients> inquiryPatientByAdmin(@Param("param") String param);
}
