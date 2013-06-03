package org.bahmni.report.dimension.dao.mapper;


import org.bahmni.report.dimension.model.AgeGroup;
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
public class AgeGroupMapperIT {

    @Autowired
    public AgeGroupMapper ageGroupMapper;

    public AgeGroupMapperIT() {
    }

    @Test
    public void shouldGetAllAgeGroup() {
        AgeGroup firstAgeGroup = new AgeGroup(15, 30);
        AgeGroup secondAgeGroup = new AgeGroup(30, 60);

        ageGroupMapper.insert(firstAgeGroup);
        ageGroupMapper.insert(secondAgeGroup);

        List<AgeGroup> ageGroups = ageGroupMapper.getAll();

        assertEquals(2, ageGroups.size());
        assertEquals(new Integer(15), ageGroups.get(0).getMinAge());
        assertEquals(new Integer(30), ageGroups.get(0).getMaxAge());
    }

}
