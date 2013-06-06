package org.bahmni.report.measure.model.dao.mapper;


import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.bahmni.report.measure.model.Diagnosis;
import org.bahmni.report.measure.model.Encounter;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface EncounterMapper {
    @Insert("INSERT INTO bahmnireportsdata.encounter(encounterTypeId, diseaseId) values (#{encounterTypeId}, #{diseaseId})")
    void insert(Encounter encounter);

    @Select({"Select * from bahmnireportsdata.encounter"})
    public List<Encounter> getAll();
}
