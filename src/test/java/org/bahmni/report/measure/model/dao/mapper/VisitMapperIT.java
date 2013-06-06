package org.bahmni.report.measure.model.dao.mapper;

import org.bahmni.report.measure.model.*;
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
public class VisitMapperIT {

    @Autowired
    public VisitMapper visitMapper;

     public VisitMapperIT(){
     }

    @Test
    public void shouldGetAllEncounters() {
        Visit visit1 = new Visit(VisitType.First, AdmissionStatus.Admitted);
        Visit visit2 = new Visit(VisitType.Returning, AdmissionStatus.Discharged);

        visitMapper.insert(visit1);
        visitMapper.insert(visit2);
        List<Visit> visits = visitMapper.getAll();

        assertEquals(2, visits.size());
        assertEquals(VisitType.First,visits.get(0).getVisitType());
        assertEquals(AdmissionStatus.Admitted,visits.get(0).getAdmissionStatus()
        );
    }

}
