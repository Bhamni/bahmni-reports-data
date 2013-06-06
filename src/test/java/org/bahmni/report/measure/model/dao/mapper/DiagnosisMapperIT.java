package org.bahmni.report.measure.model.dao.mapper;


import org.bahmni.report.dimension.dao.mapper.*;
import org.bahmni.report.dimension.model.*;
import org.bahmni.report.measure.model.Diagnosis;
import org.bahmni.report.measure.model.DiagnosisStatus;
import org.bahmni.report.measure.model.DiagnosisType;
import org.bahmni.report.measure.model.Patient;
import org.joda.time.LocalDate;
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
public class DiagnosisMapperIT {

    @Autowired
    public DiseaseMapper diseaseMapper;
    @Autowired
    public AppointmentTypeMapper appointmentTypeMapper;
    @Autowired
    public DateDimensionMapper dateDimensionMapper;
    @Autowired
    public GenderMapper genderMapper;
    @Autowired
    public ProviderMapper providerMapper;
    @Autowired
    public AgeMapper ageMapper;
    @Autowired
    public AgeGroupMapper ageGroupMapper;
    @Autowired
    public LocationMapper locationMapper;
    @Autowired
    public PatientMapper patientMapper;

    @Autowired
    public DiagnosisMapper diagnosisMapper;

    public DiagnosisMapperIT() {
    }

    @Test
    public void shouldGetAllDiagnosis() {

        diseaseMapper.insert(new Disease("Fever"));
        Disease disease = diseaseMapper.getAll().get(0);
        genderMapper.insert(new Gender("Female"));
        Gender gender = genderMapper.getAll().get(0);
        ageMapper.insert(new Age(60));
        Age age = ageMapper.getAll().get(0);
        ageGroupMapper.insert(new AgeGroup(50, 70));
        AgeGroup ageGroup = ageGroupMapper.getAll().get(0);
        locationMapper.insert(new Location("Karnataka", Level.State));
        Location location = locationMapper.getAll().get(0);

        patientMapper.insert(new Patient("Ram", "Singh", age.getId(), gender.getId(), location.getId()));
        Patient patient = patientMapper.getAll().get(0);

        Diagnosis diagnosis = new Diagnosis(patient.getId(), disease.getId(), gender.getId(), age.getId(), ageGroup.getId(), location.getId(), DiagnosisStatus.Found, DiagnosisType.Primary);
        diagnosisMapper.insert(diagnosis);

        List<Diagnosis> diagnosises = diagnosisMapper.getAll();

        assertEquals(1, diagnosises.size());
        assertEquals(patient.getId(), diagnosises.get(0).getPatientId());
        assertEquals(disease.getId(), diagnosises.get(0).getDiseaseId());
        assertEquals(gender.getId(), diagnosises.get(0).getPatientGenderId());
        assertEquals(age.getId(), diagnosises.get(0).getAgeId());
        assertEquals(ageGroup.getId(), diagnosises.get(0).getAgeGroupId());
        assertEquals(location.getId(), diagnosises.get(0).getLocationId());
        assertEquals(DiagnosisStatus.Found, diagnosises.get(0).getDiagnosisStatus());
        assertEquals(DiagnosisType.Primary, diagnosises.get(0).getDiagnosisType());
    }

}
