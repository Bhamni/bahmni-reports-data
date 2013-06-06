package org.bahmni.report.measure.model.dao.mapper;


import org.bahmni.report.dimension.dao.mapper.DateDimensionMapper;
import org.bahmni.report.dimension.dao.mapper.LocationMapper;
import org.bahmni.report.dimension.model.DateDimension;
import org.bahmni.report.dimension.model.Level;
import org.bahmni.report.dimension.model.Location;
import org.bahmni.report.measure.model.Observation;
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
public class ObservationMapperIT {

    @Autowired
    public DateDimensionMapper dateDimensionMapper;

    @Autowired
    public LocationMapper locationMapper;

    @Autowired
    public ObservationMapper observationMapper;

    public ObservationMapperIT() {
    }

    @Test
    public void shouldGetAllDiagnosis() {

        dateDimensionMapper.insert(new DateDimension(LocalDate.now().toDate()));
        DateDimension today = dateDimensionMapper.getAll().get(0);
        locationMapper.insert(new Location("Karnataka", Level.State));
        Location location = locationMapper.getAll().get(0);

        Observation observation = new Observation("temperature", "39", "celsius", "high fever", location.getId(), today.getId());
        observationMapper.insert(observation);
        List<Observation> observations = observationMapper.getAll();

        assertEquals(1, observations.size());
        assertEquals("temperature", observations.get(0).getName());
        assertEquals("39", observations.get(0).getValue());
        assertEquals("celsius", observations.get(0).getUnit());
        assertEquals("high fever", observations.get(0).getComment());
        assertEquals(location.getId(), observations.get(0).getLocationId());
        assertEquals(today.getId(), observations.get(0).getObservationDateId());
    }

}
