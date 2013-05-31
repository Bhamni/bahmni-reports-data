package org.bahmni.report.dimension.dao.mapper;

import org.bahmni.report.dimension.model.Level;
import org.bahmni.report.dimension.model.Location;
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
public class LocationMapperIT {

    @Autowired
    public LocationMapper locationMapper;

    public LocationMapperIT() {
    }

    @Test
    public void shouldGetAllLocations() {
        Location ganiyari = new Location("Ganiyari", Level.Village);
        Location bilaspur = new Location("Bilaspur", Level.Tehsil);

        locationMapper.insert(ganiyari);
        locationMapper.insert(bilaspur);

        List<Location> locations = locationMapper.getAll();

        assertEquals(2, locations.size());
        assertEquals("Ganiyari", locations.get(0).getName());
        assertEquals(Level.Village, locations.get(0).getLevel());
        assertEquals("Bilaspur", locations.get(1).getName());
        assertEquals(Level.Tehsil, locations.get(1).getLevel());
    }

}
