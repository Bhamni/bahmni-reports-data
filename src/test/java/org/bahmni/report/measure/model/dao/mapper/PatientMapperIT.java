package org.bahmni.report.measure.model.dao.mapper;


import org.bahmni.report.dimension.model.AgeGroup;
import org.bahmni.report.measure.model.Appointment;
import org.bahmni.report.measure.model.Patient;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static junit.framework.Assert.assertEquals;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
@Transactional
@TransactionConfiguration(defaultRollback = true)
public class PatientMapperIT {

    @Autowired
    public PatientMapper patientMapper;

    public PatientMapperIT() {
    }

    @Test
    public void shouldGetAllPatients() {
        Patient patient1 = new Patient("Ram", "Singh", "ageId1", "gId1", "locId1");
        Patient patient2 = new Patient("Meera", "Yadav", "ageId2", "gId2", "locId2");

        patientMapper.insert(patient1);
        patientMapper.insert(patient2);

        List<Patient> patients = patientMapper.getAll();

        assertEquals(2, patients.size());
        assertEquals("Ram", patients.get(0).getFirstName());
        assertEquals("Singh", patients.get(0).getLastName());
        assertEquals("ageId1", patients.get(0).getAgeId());
        assertEquals("gId1", patients.get(0).getGenderId());
        assertEquals("locId1", patients.get(0).getLocationId());

    }

}
