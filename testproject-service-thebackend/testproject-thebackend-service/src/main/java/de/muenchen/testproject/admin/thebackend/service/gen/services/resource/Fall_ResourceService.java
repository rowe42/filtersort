/*
* Copyright (c): it@M - Dienstleister fuer Informations- und Telekommunikationstechnik
* der Landeshauptstadt Muenchen, 2018
*/
package de.muenchen.testproject.admin.thebackend.service.gen.services.resource;

import org.springframework.hateoas.Resource;

import de.muenchen.testproject.admin.thebackend.service.gen.domain.Fall_;

/*
 * This file will be overwritten on every change of the model!
 * This file was automatically generated by Barrakuda.
 */
/**
 * Provides methods to alter resources before being sent to a client.
 */
public interface Fall_ResourceService {
	/**
	 * Process a resource. You can add links and alter the entity itself.
	 */
	Resource<Fall_> process(Resource<Fall_> resource);
}
