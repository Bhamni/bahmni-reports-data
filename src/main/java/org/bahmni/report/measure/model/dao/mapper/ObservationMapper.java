package org.bahmni.report.measure.model.dao.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.bahmni.report.measure.model.Observation;
import org.bahmni.report.measure.model.Patient;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ObservationMapper {

    @Insert("INSERT INTO observation(name, value, unit, comment, locationId, observationDateId)" +
            " values (#{name}, #{value}, #{unit}, #{comment}, #{locationId}, #{observationDateId})")
    void insert(Observation observation);

    @Select({"Select * from observation"})
    public List<Observation> getAll();

}
