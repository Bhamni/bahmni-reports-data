package org.bahmni.report.measure.model.dao.mapper;


import org.bahmni.report.measure.model.Order;
import org.bahmni.report.measure.model.Referral;
import org.bahmni.report.measure.model.ReferralType;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static junit.framework.Assert.assertEquals;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
@Transactional
@TransactionConfiguration(defaultRollback = true)
public class ReferralMapperIT {

    @Autowired
    public ReferralMapper referralMapper;

    public ReferralMapperIT() {
    }

    @Test
    public void shouldGetAllReferrals() {
        Referral referral = new Referral(ReferralType.In, "providerId");
        referralMapper.insert(referral);

        List<Referral> referrals = referralMapper.getAll();

        assertEquals(1, referrals.size());
        assertEquals(ReferralType.In, referrals.get(0).getReferralType());
        assertEquals("providerId", referrals.get(0).getProviderId());
    }

}
