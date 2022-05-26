package com.hospital.PatientRecord.repository;

import com.hospital.PatientRecord.model.Patient;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PatientRepository extends CrudRepository<Patient, Long> {



}
