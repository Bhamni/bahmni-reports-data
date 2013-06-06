package org.bahmni.report.measure.model.dao.mapper;

import org.bahmni.report.measure.model.Payment;
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

public class PaymentMapperIT {
    @Autowired
    public PaymentMapper paymentMapper;

    public PaymentMapperIT() {
    }

    @Test
    public void shouldGetAllAppointments() {
        Payment payment1 = new Payment(true, 2030.5f, 10.0f);
        Payment payment2 = new Payment(false, 2030.50f, 10.0f);

        paymentMapper.insert(payment1);
        paymentMapper.insert(payment2);

        List<Payment> payments = paymentMapper.getAll();

        assertEquals(2, payments.size());
        assertEquals(true, payments.get(0).isPaid());
        assertEquals(2030.5f, payments.get(0).getAmount());
        assertEquals(10.0f, payments.get(0).getDiscount());
    }

}
