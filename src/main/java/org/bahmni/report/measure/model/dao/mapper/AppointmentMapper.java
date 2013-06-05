package org.bahmni.report.measure.model.dao.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.bahmni.report.measure.model.Appointment;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AppointmentMapper {

    @Insert("INSERT INTO appointment(appointmentTypeId, diseaseId, appointmentDateId, patientGenderId, providerId, ageId, ageGroupId) " +
            "values (#{appointmentTypeId}, #{diseaseId}, #{appointmentDateId}, #{patientGenderId}, #{providerId}, #{ageId}, #{ageGroupId})")
    void insert(Appointment appointment);

    @Select({"Select * from appointment"})
    public List<Appointment> getAll();

}
