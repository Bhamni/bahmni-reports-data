package org.bahmni.report.dimension.dao.mapper;

import org.bahmni.report.dimension.model.DateDimension;
import org.bahmni.report.dimension.model.Disease;
import org.joda.time.DateTime;
import org.joda.time.DateTimeUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static org.joda.time.DateTime.now;
import static org.junit.Assert.assertEquals;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
@Transactional
@TransactionConfiguration(defaultRollback = true)
public class DateDimensionMapperIT {

    @Autowired
    public DateDimensionMapper dateDimensionMapper;

    public DateDimensionMapperIT() {
    }

    @Test
    public void shouldGetAllDateDimensions() {
        DateDimension today = new DateDimension(now().toDate());
        DateDimension tomorrow = new DateDimension(now().plusDays(1).toDate());

        dateDimensionMapper.insert(today);
        dateDimensionMapper.insert(tomorrow);

        List<DateDimension> dateDimensions = dateDimensionMapper.getAll();

        assertEquals(2, dateDimensions.size());
        assertEquals(now().toString("YYYY-MM-dd"), dateDimensions.get(0).getDate().toString());

    }

}
