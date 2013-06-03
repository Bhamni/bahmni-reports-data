package org.bahmni.report.measure.model.dao.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.bahmni.report.measure.model.Appointment;
import org.bahmni.report.measure.model.Patient;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PatientMapper {

    @Insert("INSERT INTO patient(firstName, lastName, ageId, genderId, locationId) values (#{firstName}, #{lastName}, #{ageId}, #{genderId}, #{locationId})")
    void insert(Patient patient);

    @Select({"Select * from patient"})
    public List<Patient> getAll();

}
