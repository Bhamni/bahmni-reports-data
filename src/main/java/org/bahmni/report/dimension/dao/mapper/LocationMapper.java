package org.bahmni.report.dimension.dao.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.bahmni.report.dimension.model.Location;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LocationMapper {

    @Insert("INSERT INTO locations(name, level) values (#{name}, #{level})")
    void insert(Location location);

    @Select({"Select * from locations"})
    public List<Location> getAll();

}
