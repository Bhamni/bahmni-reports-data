package org.bahmni.report.measure.model.dao.mapper;


import org.bahmni.report.dimension.dao.mapper.DiseaseMapper;
import org.bahmni.report.dimension.model.Disease;
import org.bahmni.report.measure.model.Appointment;
import org.bahmni.report.measure.model.AppointmentType;
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
@TransactionConfiguration(defaultRollback = true)
@Transactional
public class AppointmentMapperIT {

    @Autowired
    public DiseaseMapper diseaseMapper;

    @Autowired
    public AppointmentMapper appointmentMapper;

    public AppointmentMapperIT() {
    }

    @Test
    public void shouldGetAllAppointments() {
        diseaseMapper.insert(new Disease("Fever"));
        Disease fever = diseaseMapper.getAll().get(0);

        Appointment appointment = new Appointment(AppointmentType.Surgery, fever.getId());

        appointmentMapper.insert(appointment);

        List<Appointment> appointments = appointmentMapper.getAll();

        assertEquals(1, appointments.size());
        assertEquals(AppointmentType.Surgery, appointments.get(0).getAppointmentType());
        assertEquals(fever.getId(), appointments.get(0).getDiseaseId());
    }

}
