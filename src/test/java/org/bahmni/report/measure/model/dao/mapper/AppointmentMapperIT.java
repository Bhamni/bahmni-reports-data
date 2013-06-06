package org.bahmni.report.measure.model.dao.mapper;


import org.bahmni.report.dimension.dao.mapper.*;
import org.bahmni.report.dimension.model.*;
import org.bahmni.report.measure.model.Appointment;
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
@TransactionConfiguration(defaultRollback = true)
@Transactional
public class AppointmentMapperIT {

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
    public AppointmentMapper appointmentMapper;


    @Test
    public void shouldGetAllAppointments() {

        diseaseMapper.insert(new Disease("Fever"));
        Disease disease = diseaseMapper.getAll().get(0);
        appointmentTypeMapper.insert(new AppointmentType("Follow-Up"));
        AppointmentType appointmentType = appointmentTypeMapper.getAll().get(0);
        dateDimensionMapper.insert(new DateDimension(LocalDate.now().toDate()));
        DateDimension today = dateDimensionMapper.getAll().get(0);
        genderMapper.insert(new Gender("Female"));
        Gender gender = genderMapper.getAll().get(0);
        providerMapper.insert(new Provider("Harikesh"));
        Provider provider = providerMapper.getAll().get(0);
        ageMapper.insert(new Age(60));
        Age age = ageMapper.getAll().get(0);
        ageGroupMapper.insert(new AgeGroup(50, 70));
        AgeGroup ageGroup = ageGroupMapper.getAll().get(0);

        Appointment appointment = new Appointment(appointmentType.getId(), disease.getId(), today.getId(), gender.getId(), provider.getId(), age.getId(), ageGroup.getId());

        appointmentMapper.insert(appointment);

        List<Appointment> appointments = appointmentMapper.getAll();

        assertEquals(1, appointments.size());
        assertEquals(appointmentType.getId(), appointments.get(0).getAppointmentTypeId());
        assertEquals(disease.getId(), appointments.get(0).getDiseaseId());
        assertEquals(today.getId(), appointments.get(0).getAppointmentDateId());
        assertEquals(gender.getId(), appointments.get(0).getPatientGenderId());
        assertEquals(provider.getId(), appointments.get(0).getProviderId());
        assertEquals(age.getId(), appointments.get(0).getAgeId());
        assertEquals(ageGroup.getId(), appointments.get(0).getAgeGroupId());
    }

}
