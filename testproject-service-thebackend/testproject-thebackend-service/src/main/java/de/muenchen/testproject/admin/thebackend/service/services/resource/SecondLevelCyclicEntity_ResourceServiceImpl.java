/*
* Copyright (c): it@M - Dienstleister fuer Informations- und Telekommunikationstechnik
* der Landeshauptstadt Muenchen, 2018
*/
package de.muenchen.testproject.admin.thebackend.service.services.resource;

import org.springframework.hateoas.Resource;
import org.springframework.stereotype.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import de.muenchen.testproject.admin.thebackend.service.gen.domain.SecondLevelCyclicEntity_;
import de.muenchen.testproject.admin.thebackend.service.gen.services.resource.SecondLevelCyclicEntity_ResourceService;

/*
 * This file will NOT be overwritten by Barrakuda.
 * This file was automatically generated by Barrakuda.
 */
/**
 * Provides methods to alter resources before being sent to a client.
 * If used as generated by Barrakuda this service will be autowired and called by SecondLevelCyclicEntity_ResourceProcessor.
 */
@Service
public class SecondLevelCyclicEntity_ResourceServiceImpl implements SecondLevelCyclicEntity_ResourceService {
	
	private static final Logger LOG = LoggerFactory.getLogger(SecondLevelCyclicEntity_ResourceServiceImpl.class);
	
	// If you need access to the database you can autowire a Repository.
	// Repositories are generated into the package: .gen.rest
	//
	// @Autowired
	// private <EntityName>Repository repo;
	
	/**
	 * Process a resource.
	 * You can add links and alter the entity itself.
	 * When used as generated by Barrakuda this method will be called whenever a resource is sent to a client.
	 */
	public Resource<SecondLevelCyclicEntity_> process(Resource<SecondLevelCyclicEntity_> resource){
		// Implement your logic here.
		return resource;
	}
}
