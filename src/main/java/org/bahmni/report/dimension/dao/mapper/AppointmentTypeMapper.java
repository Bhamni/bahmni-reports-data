package org.bahmni.report.dimension.dao.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.bahmni.report.dimension.model.Age;
import org.bahmni.report.dimension.model.AppointmentType;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AppointmentTypeMapper {
    @Insert("INSERT INTO appointmentType(type) values (#{type})")
    void insert(AppointmentType appointmentType);

    @Select({"Select * from appointmentType"})
    public List<AppointmentType> getAll();
}
