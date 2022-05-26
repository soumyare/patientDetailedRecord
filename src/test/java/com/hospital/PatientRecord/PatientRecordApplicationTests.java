package com.hospital.PatientRecord;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import com.hospital.PatientRecord.model.Patient;
import com.hospital.PatientRecord.repository.PatientRepository;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import java.util.List;

//@SpringBootTest
//@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
//class PatientRecordApplicationTests {

	/*	@Autowired
		PatientRepository patientRepository;

		@Test
		@Order(1)
		public void testCreate () {
			Patient p = new Patient();

			patientRepository.save(p);
			assertNotNull(patientRepository.findById(1L).get());
		}


	@Test
		@Order(2)
		public void testReadAll () {
			List list = patientRepository.findAll();
			assertThat(list).size().isGreaterThan(0);
		}

		@Test
		@Order(3)
		public void testRead () {
			Patient patient = patientRepository.findById(1L).get();
			assertEquals("iPhone XR", patient.getName());
		}

		@Test
		@Order(4)
		public void testUpdate () {
			Patient p = patientRepository.findById(1L).get();
			p.setPhone(800765765L);
			patientRepository.save(p);
			assertNotEquals(7004575500L, patientRepository.findById(1L).get().getPhone());
		}

		@Test
		@Order(5)
		public void testDelete () {
			patientRepository.deleteById(1L);
			assertThat(patientRepository.existsById(1L)).isFalse();
		}
	}*/
