package org.bahmni.report.dimension.dao.mapper;


import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.bahmni.report.dimension.model.DateDimension;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DateDimensionMapper {

    @Insert("INSERT INTO bahmnireportsdata.dateDimension(date, year, month, week, day) values " +
            "(#{date}, #{year}, #{month}, #{week}, #{day})")
    void insert(DateDimension date);

    @Select({"Select * from bahmnireportsdata.dateDimension"})
    public List<DateDimension> getAll();
}
