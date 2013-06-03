package org.bahmni.report.measure.model.dao.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.bahmni.report.measure.model.Observation;
import org.bahmni.report.measure.model.Order;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderMapper {

    @Insert("INSERT INTO orderMeasure(name, type) values (#{name}, #{type})")
    void insert(Order order);

    @Select({"Select * from orderMeasure"})
    public List<Order> getAll();

}
