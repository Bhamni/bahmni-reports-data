package org.bahmni.report.dimension.dao.mapper;


import org.bahmni.report.dimension.model.Age;
import org.bahmni.report.dimension.model.AppointmentType;
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
public class AppointmentTypeMapperIT {
    @Autowired
    public AppointmentTypeMapper appointmentTypeMapper;

    public AppointmentTypeMapperIT() {
    }

    @Test
    public void shouldGetAllAppointmentTypes() {
        AppointmentType surgery = new AppointmentType("Surgery");
        AppointmentType test = new AppointmentType("Test");

        appointmentTypeMapper.insert(surgery);
        appointmentTypeMapper.insert(test);

        List<AppointmentType> appointmentTypes = appointmentTypeMapper.getAll();

        assertEquals(2, appointmentTypes.size());
        assertEquals("Surgery", appointmentTypes.get(0).getType());
    }

}
