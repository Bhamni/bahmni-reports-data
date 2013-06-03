package org.bahmni.report.dimension.dao.mapper;


import org.bahmni.report.dimension.model.Gender;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
@Transactional
@TransactionConfiguration(defaultRollback = true)
public class GenderMapperIT {

    @Autowired
    public GenderMapper genderMapper;

    public GenderMapperIT() {
    }

    @Test
    public void shouldGetAllGender() {
        Gender male = new Gender("male");
        Gender female = new Gender("female");

        genderMapper.insert(male);
        genderMapper.insert(female);

        List<Gender> gender = genderMapper.getAll();

        assertEquals(2, gender.size());
    }

}
