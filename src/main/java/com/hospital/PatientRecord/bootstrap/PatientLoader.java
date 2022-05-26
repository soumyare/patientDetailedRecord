package com.hospital.PatientRecord.bootstrap;

import com.hospital.PatientRecord.model.Patient;
import com.hospital.PatientRecord.model.PatientStatus;
import com.hospital.PatientRecord.repository.PatientRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class PatientLoader implements CommandLineRunner {
    public final PatientRepository patientRepository;

    public PatientLoader(PatientRepository patientRepository){
        this.patientRepository=patientRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        loadPatients();
    }

    private void loadPatients() {
        if(patientRepository.count() ==0){
            patientRepository.save(
                    Patient.builder()
                            .name("soumya")
                            .address("Bangalorecity")
                            .email("abcd123@gmail.com")
                            .phone(6758734655L)
                            .password("S13hfg234")
                            .patientStatus(PatientStatus.NOT_COMPLETED)
                            .build()
            );
            patientRepository.save(
                    Patient.builder()
                            .name("sham")
                            .address("Hydrabadcity")
                            .email("abc23@gmail.com")
                            .phone(675864655L)
                            .password("T13hfg234")
                            .patientStatus(PatientStatus.NOT_COMPLETED)
                            .build()
            );
            System.out.println("sample Patients loaded");
        }
    }


}
