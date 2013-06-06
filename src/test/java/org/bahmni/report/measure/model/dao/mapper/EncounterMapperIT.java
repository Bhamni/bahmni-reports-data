package org.bahmni.report.measure.model.dao.mapper;

import org.bahmni.report.dimension.dao.mapper.DiseaseMapper;
import org.bahmni.report.dimension.dao.mapper.EncounterTypeMapper;
import org.bahmni.report.dimension.model.AppointmentType;
import org.bahmni.report.dimension.model.Disease;
import org.bahmni.report.dimension.model.EncounterType;
import org.bahmni.report.measure.model.Encounter;
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

public class EncounterMapperIT {

    @Autowired
    public EncounterTypeMapper encounterTypeMapper;
    @Autowired
    public DiseaseMapper diseaseMapper;

    @Autowired
    public EncounterMapper encounterMapper;

    public EncounterMapperIT() {
    }

    @Test
    public void shouldGetAllEncounters() {
        encounterTypeMapper.insert(new EncounterType("Follow-Up"));
        EncounterType encounterType = encounterTypeMapper.getAll().get(0);
        diseaseMapper.insert(new Disease("Dengue"));
        Disease disease = diseaseMapper.getAll().get(0);

        Encounter encounter = new Encounter(encounterType.getId(), disease.getId());
        encounterMapper.insert(encounter);
        List<Encounter> encounters = encounterMapper.getAll();

        assertEquals(1, encounters.size());
        assertEquals(encounterType.getId(), encounters.get(0).getEncounterTypeId());
        assertEquals(disease.getId(), encounters.get(0).getDiseaseId());
    }

}
