package org.bahmni.report.measure.model.dao.mapper;


import org.bahmni.report.measure.model.Observation;
import org.bahmni.report.measure.model.Order;
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
public class OrderMapperIT {

    @Autowired
    public OrderMapper orderMapper;

    public OrderMapperIT() {
    }

    @Test
    public void shouldGetAllOrders() {
        Order order = new Order("syringes", "glaxo");
        orderMapper.insert(order);

        List<Order> orders = orderMapper.getAll();

        assertEquals(1, orders.size());
        assertEquals("syringes", orders.get(0).getType());
        assertEquals("glaxo", orders.get(0).getName());
    }

}
