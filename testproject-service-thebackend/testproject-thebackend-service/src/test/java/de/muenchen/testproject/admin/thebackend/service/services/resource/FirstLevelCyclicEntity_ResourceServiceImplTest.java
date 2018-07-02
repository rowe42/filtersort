/*
* Copyright (c): it@M - Dienstleister fuer Informations- und Telekommunikationstechnik
* der Landeshauptstadt Muenchen, 2018
*/
package de.muenchen.testproject.admin.thebackend.service.services.resource;

import de.muenchen.testproject.admin.thebackend.service.MicroServiceApplication;
import de.muenchen.testproject.admin.thebackend.service.gen.domain.FirstLevelCyclicEntity_;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.hateoas.Resource;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


/*
 * This file will NOT be overwritten by Barrakuda.
 * This file was automatically generated by Barrakuda.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@ContextConfiguration(classes={MicroServiceApplication.class})
@ActiveProfiles("test, no-security")
public class FirstLevelCyclicEntity_ResourceServiceImplTest {
	
    @Autowired
    private FirstLevelCyclicEntity_ResourceServiceImpl firstLevelCyclicEntityResourceServiceImpl;
	
	@Test
	public void processTest() {
	    
	    FirstLevelCyclicEntity_ firstLevelCyclicEntity = new FirstLevelCyclicEntity_();
	    Resource<FirstLevelCyclicEntity_> firstLevelCyclicEntityResource = new Resource<>(firstLevelCyclicEntity);
	    int firstLevelCyclicEntityResourceHash = firstLevelCyclicEntityResource.hashCode();
	    firstLevelCyclicEntityResource = firstLevelCyclicEntityResourceServiceImpl.process(firstLevelCyclicEntityResource);
	    Assert.assertEquals(firstLevelCyclicEntityResourceHash, firstLevelCyclicEntityResource.hashCode());
	    
	    
	}
	
}