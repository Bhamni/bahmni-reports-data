package org.bahmni.report.measure.model.dao.mapper;

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
    public EncounterMapper encounterMapper;

    public EncounterMapperIT() {
    }

    @Test
    public void shouldGetAllEncounters() {
        Encounter encounter1 = new Encounter("encTypeID1", "diseaseID1");
        Encounter encounter2 = new Encounter("encTypeID2", "diseaseID2");

        encounterMapper.insert(encounter1);
        encounterMapper.insert(encounter2);

        List<Encounter> encounters = encounterMapper.getAll();

        assertEquals(2, encounters.size());
        assertEquals("encTypeID1", encounters.get(0).getEncounterTypeId());
        assertEquals("diseaseID1", encounters.get(0).getDiseaseId()
        );
    }

}
