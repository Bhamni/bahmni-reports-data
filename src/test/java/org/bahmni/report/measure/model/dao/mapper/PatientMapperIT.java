package org.bahmni.report.measure.model.dao.mapper;


import org.bahmni.report.dimension.dao.mapper.*;
import org.bahmni.report.dimension.model.Age;
import org.bahmni.report.dimension.model.Gender;
import org.bahmni.report.dimension.model.Level;
import org.bahmni.report.dimension.model.Location;
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
    public GenderMapper genderMapper;
    @Autowired
    public AgeMapper ageMapper;
    @Autowired
    public LocationMapper locationMapper;

    @Autowired
    public PatientMapper patientMapper;

    public PatientMapperIT() {
    }

    @Test
    public void shouldGetAllPatients() {

        genderMapper.insert(new Gender("Female"));
        Gender gender = genderMapper.getAll().get(0);
        ageMapper.insert(new Age(60));
        Age age = ageMapper.getAll().get(0);
        locationMapper.insert(new Location("Karnataka", Level.State));
        Location location = locationMapper.getAll().get(0);

        Patient patient = new Patient("Ram", "Singh", age.getId(), gender.getId(), location.getId());
        patientMapper.insert(patient);
        List<Patient> patients = patientMapper.getAll();

        assertEquals(1, patients.size());
        assertEquals("Ram", patients.get(0).getFirstName());
        assertEquals("Singh", patients.get(0).getLastName());
        assertEquals(age.getId(), patients.get(0).getAgeId());
        assertEquals(gender.getId(), patients.get(0).getGenderId());
        assertEquals(location.getId(), patients.get(0).getLocationId());

    }

}
