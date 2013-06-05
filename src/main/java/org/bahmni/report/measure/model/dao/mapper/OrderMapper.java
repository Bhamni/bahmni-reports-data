package org.bahmni.report.measure.model.dao.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.bahmni.report.measure.model.Observation;
import org.bahmni.report.measure.model.Order;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderMapper {

    @Insert("INSERT INTO orderMeasure(type, instructions, orderer, startDateId, autoExpireDateId) " +
            "values (#{type}, #{instructions}, #{orderer}, #{startDateId}, #{autoExpireDateId})")
    void insert(Order order);

    @Select({"Select * from orderMeasure"})
    public List<Order> getAll();

}
