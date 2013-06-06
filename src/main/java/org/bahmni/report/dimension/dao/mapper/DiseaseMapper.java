package org.bahmni.report.dimension.dao.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.bahmni.report.dimension.model.Disease;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DiseaseMapper {

    @Insert("INSERT INTO bahmnireportsdata.disease(name) values (#{name})")
    void insert(Disease disease);

    @Select({"Select * from bahmnireportsdata.disease"})
    public List<Disease> getAll();

}
