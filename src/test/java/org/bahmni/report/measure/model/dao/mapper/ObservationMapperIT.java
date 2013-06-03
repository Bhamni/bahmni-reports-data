package org.bahmni.report.measure.model.dao.mapper;


import org.bahmni.report.measure.model.Observation;
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
public class ObservationMapperIT {

    @Autowired
    public ObservationMapper observationMapper;

    public ObservationMapperIT() {
    }

    @Test
    public void shouldGetAllDiagnosis() {
        Observation observation = new Observation("temperature", "39", "celsius", "high fever");
        observationMapper.insert(observation);

        List<Observation> observations = observationMapper.getAll();

        assertEquals(1, observations.size());
        assertEquals("temperature", observations.get(0).getName());
        assertEquals("39", observations.get(0).getValue());
        assertEquals("celsius", observations.get(0).getUnit());
        assertEquals("high fever", observations.get(0).getComment());
    }

}
