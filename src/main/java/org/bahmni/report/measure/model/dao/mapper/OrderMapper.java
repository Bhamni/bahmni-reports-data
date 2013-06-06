package org.bahmni.report.measure.model.dao.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.bahmni.report.measure.model.Observation;
import org.bahmni.report.measure.model.Order;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderMapper {

    @Insert("INSERT INTO bahmnireportsdata.orderMeasure(type, instructions, orderer, startDateId, autoExpireDateId) " +
            "values (#{type}, #{instructions}, #{orderer}, #{startDateId}, #{autoExpireDateId})")
    void insert(Order order);

    @Select({"Select * from bahmnireportsdata.orderMeasure"})
    public List<Order> getAll();

}
