package org.bahmni.report.measure.model.dao.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.bahmni.report.measure.model.Diagnosis;
import org.bahmni.report.measure.model.Patient;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DiagnosisMapper {

    @Insert("INSERT INTO bahmnireportsdata.diagnosis(patientId, diseaseId, patientGenderId, ageId, ageGroupId, locationId, diagnosisStatus, diagnosisType) " +
            "values (#{patientId}, #{diseaseId}, #{patientGenderId}, #{ageId}, #{ageGroupId}, #{locationId}, #{diagnosisStatus}, #{diagnosisType})")
    void insert(Diagnosis diagnosis);

    @Select({"Select * from bahmnireportsdata.diagnosis"})
    public List<Diagnosis> getAll();

}
