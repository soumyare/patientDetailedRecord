package com.hospital.PatientRecord.service;

import com.hospital.PatientRecord.model.Patient;
import com.hospital.PatientRecord.repository.PatientRepository;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PatientServiceImpl implements PatientService{
     PatientRepository patientRepository;

    public PatientServiceImpl(PatientRepository patientRepository){
        this.patientRepository=patientRepository;
    }


    @Override
    public List<Patient> getAllPatients() {
        List<Patient> patients=new ArrayList<>();
        patientRepository.findAll().forEach(patients::add);
        return patients;


    }

    @Override
    public Patient getPatientById(long id) {
        return patientRepository.findById(id).get();
    }

    @Override
    public Patient insert(Patient patient) {
        return patientRepository.save(patient);
    }

    @Override
    public void updatePatient(long id, Patient patient) {
        Patient patientFromDb = patientRepository.findById(id).get();
        System.out.println(patientFromDb.toString());
        patientFromDb.setPatientStatus(patient.getPatientStatus());
        patientFromDb.setName(patient.getName());
        patientFromDb.setAddress(patient.getAddress());
        patientFromDb.setEmail(patient.getEmail());
        patientFromDb.setPhone(patient.getPhone());
        patientFromDb.setPassword(patient.getPassword());
        patientRepository.save(patientFromDb);

    }

    @Override
    public void deletePatient(long patientId) {
        patientRepository.deleteById(patientId);

    }


}
