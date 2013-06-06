package org.bahmni.report.dimension.dao.mapper;


import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.bahmni.report.dimension.model.Provider;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProviderMapper {

    @Insert("INSERT INTO bahmnireportsdata.provider(name) values (#{name})")
    public void insert(Provider provider);

    @Select({"Select * from bahmnireportsdata.provider"})
    public List<Provider> getAll();

}
