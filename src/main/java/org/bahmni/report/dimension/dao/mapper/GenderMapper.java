package org.bahmni.report.dimension.dao.mapper;


import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.bahmni.report.dimension.model.Gender;
import org.bahmni.report.dimension.model.Location;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GenderMapper {

    @Insert("INSERT INTO gender(label) values (#{label})")
    void insert(Gender gender);

    @Select({"Select * from gender"})
    public List<Gender> getAll();
}
