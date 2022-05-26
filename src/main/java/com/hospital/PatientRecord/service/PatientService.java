package com.hospital.PatientRecord.service;

import com.hospital.PatientRecord.model.Patient;
import org.springframework.data.domain.Sort;

import java.util.List;

public interface PatientService {
    List<Patient> getAllPatients();
    Patient getPatientById(long id);
    Patient insert(Patient patient);
    void updatePatient(long id, Patient patient);
    void deletePatient(long patientId);
}
