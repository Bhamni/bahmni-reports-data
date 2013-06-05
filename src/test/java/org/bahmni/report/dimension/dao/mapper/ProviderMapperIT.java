package org.bahmni.report.dimension.dao.mapper;

import org.bahmni.report.dimension.model.Level;
import org.bahmni.report.dimension.model.Location;
import org.bahmni.report.dimension.model.Provider;
import org.bahmni.report.dimension.model.ProviderType;
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
public class ProviderMapperIT {

    @Autowired
    public ProviderMapper providerMapper;

    public ProviderMapperIT() {
    }

    @Test
    public void shouldGetAllProviders() {
        Provider doctor = new Provider("Ram");
        Provider nurse = new Provider("Shyam");

        providerMapper.insert(doctor);
        providerMapper.insert(nurse);

        List<Provider> providers = providerMapper.getAll();

        assertEquals(2, providers.size());
        assertEquals("Ram", providers.get(0).getName());
        assertEquals("Shyam", providers.get(1).getName());
    }

}
