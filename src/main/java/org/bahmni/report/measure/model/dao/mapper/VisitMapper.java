package org.bahmni.report.measure.model.dao.mapper;


import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.bahmni.report.measure.model.Payment;
import org.bahmni.report.measure.model.Visit;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VisitMapper {

    @Insert("INSERT INTO bahmnireportsdata.visit(visitType,admissionStatus) values (#{visitType}, #{admissionStatus})")
    void insert(Visit visit);

    @Select({"Select * from bahmnireportsdata.visit"})
    public List<Visit> getAll();
}
