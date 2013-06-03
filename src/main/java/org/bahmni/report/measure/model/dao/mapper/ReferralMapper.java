package org.bahmni.report.measure.model.dao.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.bahmni.report.measure.model.Order;
import org.bahmni.report.measure.model.Referral;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReferralMapper {

    @Insert("INSERT INTO referral(referralType, providerId) values (#{referralType}, #{providerId})")
    void insert(Referral referral);

    @Select({"Select * from referral"})
    public List<Referral> getAll();

}
