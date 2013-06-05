package org.bahmni.report.measure.model.dao.mapper;


import org.bahmni.report.dimension.dao.mapper.DiseaseMapper;
import org.bahmni.report.dimension.model.Disease;
import org.bahmni.report.measure.model.*;
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
    public DiagnosisMapper diagnosisMapper;

    public DiagnosisMapperIT() {
    }

    @Test
    public void shouldGetAllDiagnosis() {
        Diagnosis diagnosis1 = new Diagnosis("patientId1", "diseaseId1", "genderId1", "ageId1", "ageGrpId1", "locId1", DiagnosisStatus.Found, DiagnosisType.Primary);
        Diagnosis diagnosis2 = new Diagnosis("patientId2", "diseaseId2", "genderId2", "ageId2", "ageGrpId2", "locId2", DiagnosisStatus.Treated, DiagnosisType.Differential);

        diagnosisMapper.insert(diagnosis1);
        diagnosisMapper.insert(diagnosis2);

        List<Diagnosis> diagnosises = diagnosisMapper.getAll();

        assertEquals(2, diagnosises.size());
        assertEquals("patientId1", diagnosises.get(0).getPatientId());
        assertEquals("diseaseId1", diagnosises.get(0).getDiseaseId());
        assertEquals("genderId1", diagnosises.get(0).getPatientGenderId());
        assertEquals("ageId1", diagnosises.get(0).getAgeId());
        assertEquals("ageGrpId1", diagnosises.get(0).getAgeGroupId());
        assertEquals("locId1", diagnosises.get(0).getLocationId());
        assertEquals(DiagnosisStatus.Found, diagnosises.get(0).getDiagnosisStatus());
        assertEquals(DiagnosisType.Primary, diagnosises.get(0).getDiagnosisType());
    }

}
