package org.bahmni.report.measure.model.dao.mapper;


import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.bahmni.report.measure.model.Payment;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PaymentMapper {
    @Insert("INSERT INTO payment(paid, amount, discount) values (#{paid}, #{amount}, #{discount})")
    void insert(Payment payments);

    @Select({"Select * from payment"})
    public List<Payment> getAll();
}
