package org.bahmni.report.measure.model.dao.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.bahmni.report.measure.model.Diagnosis;
import org.bahmni.report.measure.model.Patient;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DiagnosisMapper {

    @Insert("INSERT INTO diagnosis(patientId, diseaseId, ageGroupId, locationId, diagnosisStatus, diagnosisType) values (#{patientId}, #{diseaseId}, #{ageGroupId}, #{locationId}, #{diagnosisStatus}, #{diagnosisType})")
    void insert(Diagnosis diagnosis);

    @Select({"Select * from diagnosis"})
    public List<Diagnosis> getAll();

}
