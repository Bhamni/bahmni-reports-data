package org.bahmni.report.dimension.dao.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.bahmni.report.dimension.model.AppointmentType;
import org.bahmni.report.dimension.model.EncounterType;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EncounterTypeMapper {

    @Insert("INSERT INTO encounterType(type) values (#{type})")
    void insert(EncounterType encounterType);

    @Select({"Select * from encounterType"})
    public List<EncounterType> getAll();

}
