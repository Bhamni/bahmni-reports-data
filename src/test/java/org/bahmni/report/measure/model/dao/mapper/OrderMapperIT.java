package org.bahmni.report.measure.model.dao.mapper;


import org.bahmni.report.dimension.dao.mapper.DateDimensionMapper;
import org.bahmni.report.dimension.model.DateDimension;
import org.bahmni.report.measure.model.Order;
import org.bahmni.report.measure.model.OrderType;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static junit.framework.Assert.assertEquals;
import static org.joda.time.LocalDate.now;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
@Transactional
@TransactionConfiguration(defaultRollback = true)
public class OrderMapperIT {

    @Autowired
    public DateDimensionMapper dateDimensionMapper;

    @Autowired
    public OrderMapper orderMapper;

    public OrderMapperIT() {
    }

    @Test
    public void shouldGetAllOrders() {
        dateDimensionMapper.insert(new DateDimension(now().toDate()));
        dateDimensionMapper.insert(new DateDimension(now().plusDays(10).toDate()));
        DateDimension today = dateDimensionMapper.getAll().get(0);
        DateDimension tenDaysLater = dateDimensionMapper.getAll().get(1);

        Order order = new Order(OrderType.DrugOrder, "crocin - 10 strips", "Foo", today.getId(), tenDaysLater.getId());
        orderMapper.insert(order);
        List<Order> orders = orderMapper.getAll();

        assertEquals(1, orders.size());
        assertEquals(OrderType.DrugOrder, orders.get(0).getType());
        assertEquals("crocin - 10 strips", orders.get(0).getInstructions());
        assertEquals("Foo", orders.get(0).getOrderer());
        assertEquals(today.getId(), orders.get(0).getStartDateId());
        assertEquals(tenDaysLater.getId(), orders.get(0).getAutoExpireDateId());
    }

}
