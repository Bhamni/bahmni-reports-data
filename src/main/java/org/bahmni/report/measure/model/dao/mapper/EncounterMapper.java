package org.bahmni.report.measure.model.dao.mapper;


import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.bahmni.report.measure.model.Diagnosis;
import org.bahmni.report.measure.model.Encounter;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface EncounterMapper {
    @Insert("INSERT INTO encounter(encounterTypeId, diseaseId) values (#{encounterTypeId}, #{diseaseId})")
    void insert(Encounter encounter);

    @Select({"Select * from encounter"})
    public List<Encounter> getAll();
}
