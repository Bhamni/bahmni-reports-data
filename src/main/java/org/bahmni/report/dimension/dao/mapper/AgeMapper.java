package org.bahmni.report.dimension.dao.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.bahmni.report.dimension.model.Age;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AgeMapper {
    @Insert("INSERT INTO age(age) values (#{age})")
    void insert(Age age);

    @Select({"Select * from age"})
    public List<Age> getAll();
}
