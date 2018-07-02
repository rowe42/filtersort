/*
* Copyright (c): it@M - Dienstleister fuer Informations- und Telekommunikationstechnik
* der Landeshauptstadt Muenchen, 2018
*/
package de.muenchen.testproject.admin.thebackend.service.rest;

import java.math.BigDecimal;
import org.junit.Assert;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;
import de.muenchen.testproject.admin.thebackend.service.gen.domain.Fall_;

import de.muenchen.testproject.admin.thebackend.service.MicroServiceApplication;
import de.muenchen.testproject.admin.thebackend.service.gen.domain.Fall_;

/*
 * This file will NOT be overwritten by Barrakuda.
 * This file was automatically generated by Barrakuda.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT, properties = {"spring.datasource.url=jdbc:h2:mem:testproject;DB_CLOSE_ON_EXIT=FALSE"})
@ContextConfiguration(classes={MicroServiceApplication.class})
@ActiveProfiles("test, no-security")
public class Fall_Repository_Test {

	@Autowired
	Fall_Repository repository;
	
	@Autowired
	Fall_Repository fall_Repository;
	
	@Test
	@Transactional(propagation=Propagation.REQUIRED, readOnly=false, noRollbackFor=Exception.class)
	public void testSave(){
	    
	    // initialize
	    Fall_ original = new Fall_();
	    original.setText("test");
	    
	    Fall_ references_1 = new Fall_();
	    references_1.setText("test");
	    original.getReferences().add(references_1);
	    
	    // persist
	    references_1 = fall_Repository.save(references_1);
	    original = repository.save(original);
	    
	    // check
	    Fall_ persisted = repository.findOne(original.getOid());
	    Assert.assertNotNull(persisted);
	    Assert.assertEquals(original, persisted);
	}
	
}