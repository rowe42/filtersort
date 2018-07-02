/*
* Copyright (c): it@M - Dienstleister fuer Informations- und Telekommunikationstechnik
* der Landeshauptstadt Muenchen, 2018
*/
package de.muenchen.testproject.admin.thebackend.service.gen.services.resource;

import org.springframework.hateoas.Resource;

import de.muenchen.testproject.admin.thebackend.service.gen.domain.FirstLevelCyclicEntity_;

/*
 * This file will be overwritten on every change of the model!
 * This file was automatically generated by Barrakuda.
 */
/**
 * Provides methods to alter resources before being sent to a client.
 */
public interface FirstLevelCyclicEntity_ResourceService {
	/**
	 * Process a resource. You can add links and alter the entity itself.
	 */
	Resource<FirstLevelCyclicEntity_> process(Resource<FirstLevelCyclicEntity_> resource);
}