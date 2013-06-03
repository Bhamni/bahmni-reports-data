package org.bahmni.report.dimension.dao.mapper;

import org.bahmni.report.dimension.model.Disease;
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
public class DiseaseMapperIT {

    @Autowired
    public DiseaseMapper diseaseMapper;

    public DiseaseMapperIT() {
    }

    @Test
    public void shouldGetAllDisease() {
        Disease disease1 = new Disease("TB");
        Disease disease2 = new Disease("fever");

        diseaseMapper.insert(disease1);
        diseaseMapper.insert(disease2);

        List<Disease> diseases = diseaseMapper.getAll();

        assertEquals(2, diseases.size());
    }

}
