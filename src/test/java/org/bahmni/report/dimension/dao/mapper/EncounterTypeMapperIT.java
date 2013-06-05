package org.bahmni.report.dimension.dao.mapper;


import org.bahmni.report.dimension.model.AppointmentType;
import org.bahmni.report.dimension.model.EncounterType;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;
import sun.security.krb5.internal.crypto.EType;

import java.util.List;

import static junit.framework.Assert.assertEquals;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
@Transactional
@TransactionConfiguration(defaultRollback = true)
public class EncounterTypeMapperIT {

    @Autowired
    public EncounterTypeMapper encounterTypeMapper;

    public EncounterTypeMapperIT() {
    }

    @Test
    public void shouldGetAllEncounterTypes() {
        EncounterType surgery = new EncounterType("Surgery");
        EncounterType test = new EncounterType("Test");

        encounterTypeMapper.insert(surgery);
        encounterTypeMapper.insert(test);

        List<EncounterType> encounterTypes = encounterTypeMapper.getAll();

        assertEquals(2, encounterTypes.size());
        assertEquals("Surgery", encounterTypes.get(0).getType());
    }

}
