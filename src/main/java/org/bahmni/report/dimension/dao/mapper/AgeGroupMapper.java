package org.bahmni.report.dimension.dao.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.bahmni.report.dimension.model.AgeGroup;
import org.bahmni.report.dimension.model.Location;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AgeGroupMapper {

    @Insert("INSERT INTO ageGroup(minAge, maxAge) values (#{minAge}, #{maxAge})")
    void insert(AgeGroup ageGroup);

    @Select({"Select * from ageGroup"})
    public List<AgeGroup> getAll();
}
