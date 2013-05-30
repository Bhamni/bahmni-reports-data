package org.bahmni.report.fact.dao.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.bahmni.report.fact.model.Location;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LocationMapper {

    @Insert("INSERT INTO locations(name) values (#{name})")
    void insert(Location location);

    @Select({"Select * from locations"})
    public List<Location> getAll();

}
