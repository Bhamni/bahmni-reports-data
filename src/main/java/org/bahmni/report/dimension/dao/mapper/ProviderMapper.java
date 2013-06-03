package org.bahmni.report.dimension.dao.mapper;


import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.bahmni.report.dimension.model.Provider;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProviderMapper {

    @Insert("INSERT INTO provider(providerType) values (#{providerType})")
    public void insert(Provider provider);

    @Select({"Select * from provider"})
    public List<Provider> getAll();

}
