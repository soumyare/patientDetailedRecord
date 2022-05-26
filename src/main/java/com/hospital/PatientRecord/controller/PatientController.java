package com.hospital.PatientRecord.controller;

import com.hospital.PatientRecord.model.Patient;
import com.hospital.PatientRecord.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/api/v1/patient")
public class PatientController {
    PatientService patientService;

    public PatientController(PatientService patientService){
        this.patientService=patientService;
    }

    // display list of patients
    @GetMapping
    public ResponseEntity<List<Patient>> getAllPatients() {
        List<Patient> patients=patientService.getAllPatients();
        return new ResponseEntity<>(patients, HttpStatus.OK);
    }

    @GetMapping({"/{patientId}"})
    public ResponseEntity<Patient> getPatient(@PathVariable Long patientId) {
        return new ResponseEntity<>(patientService.getPatientById(patientId), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Patient> savePatient(@RequestBody Patient patient) {
        Patient patient1=patientService.insert(patient);
        HttpHeaders httpHeaders=new HttpHeaders();
        httpHeaders.add("patient",
                "/api/v1/patient/" + patient1.getId());
        return new ResponseEntity<>(patient1, httpHeaders, HttpStatus.CREATED);
    }

    @PutMapping({"/{patientId}"})
    public ResponseEntity<Patient> updatePatient(@PathVariable("patientId") Long patientId, @RequestBody Patient patient) {
        patientService.updatePatient(patientId, patient);
        return new ResponseEntity<>(patientService.getPatientById(patientId),HttpStatus.OK);
    }

    @DeleteMapping({"/{patientId}"})
    public ResponseEntity<Patient> deletePatient(@PathVariable("patientId") Long patientId) {
        patientService.deletePatient(patientId);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }


    @PostMapping({"/{bookAppointment}"})
    public ResponseEntity<Patient> savePatient1(@RequestBody Patient patient) {
        Patient patient1=patientService.insert(patient);
        HttpHeaders httpHeaders=new HttpHeaders();
        httpHeaders.add("patient",
                "/api/v1/patient/" + patient1.getId());
        return new ResponseEntity<>(patient1, httpHeaders, HttpStatus.CREATED);
    }


}
