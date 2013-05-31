package org.bahmni.report.dimension.dao.mapper;


import org.bahmni.report.dimension.model.Age;
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
public class AgeMapperIT {
    @Autowired
    public AgeMapper ageMapper;

    public AgeMapperIT() {
    }

    @Test
    public void shouldGetAllAge() {
        Age thirtyFour = new Age(34);
        Age seventyTwo = new Age(72);

        ageMapper.insert(thirtyFour);
        ageMapper.insert(seventyTwo);

        List<Age> age = ageMapper.getAll();

        assertEquals(2, age.size());
        assertEquals(34, age.get(0).getAge());
    }

}
