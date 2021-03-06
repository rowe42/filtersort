/*
* Copyright (c): it@M - Dienstleister fuer Informations- und Telekommunikationstechnik
* der Landeshauptstadt Muenchen, 2018
*/
package de.muenchen.testproject.admin.thebackend.service.services.event;

import org.springframework.stereotype.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import de.muenchen.testproject.admin.thebackend.service.gen.domain.SecondLevelCyclicEntity_;
import de.muenchen.testproject.admin.thebackend.service.gen.services.event.SecondLevelCyclicEntity_EventService;

/*
 * This file will NOT be overwritten by Barrakuda.
 * This file was automatically generated by Barrakuda.
 */
/**
 * Provides methods to implement logic before and after Events.
 * If used as generated by Barrakuda this service will be autowired and called by SecondLevelCyclicEntity_EventListener.
 */
@Service
public class SecondLevelCyclicEntity_EventServiceImpl implements SecondLevelCyclicEntity_EventService {
	
	private static final Logger LOG = LoggerFactory.getLogger(SecondLevelCyclicEntity_EventServiceImpl.class);
	
	// If you need access to the database you can autowire a Repository.
	// Repositories are generated into the package: .gen.rest
	//
	// @Autowired
	// private <EntityName>Repository repo;
	
	@Override
	public void onAfterCreate(SecondLevelCyclicEntity_ entity) {
		// Add your logic here.
	}
	@Override
	public void onBeforeCreate(SecondLevelCyclicEntity_ entity) {
		// Add your logic here.
	}
	@Override
	public void onBeforeSave(SecondLevelCyclicEntity_ entity) {
		// Add your logic here.
	}
	@Override
	public void onAfterSave(SecondLevelCyclicEntity_ entity) {
		// Add your logic here.
	}
	@Override
	public void onBeforeLinkSave(SecondLevelCyclicEntity_ parent, Object linked) {
		// Add your logic here.
	}
	@Override
	public void onAfterLinkSave(SecondLevelCyclicEntity_ parent, Object linked) {
		// Add your logic here.
	}
	@Override
	public void onBeforeLinkDelete(SecondLevelCyclicEntity_ parent, Object linked) {
		// Add your logic here.
	}
	@Override
	public void onBeforeDelete(SecondLevelCyclicEntity_ entity) {
		// Add your logic here.
	}
	@Override
	public void onAfterDelete(SecondLevelCyclicEntity_ entity) {
		// Add your logic here.
	}
	@Override
	public void onAfterLinkDelete(SecondLevelCyclicEntity_ parent, Object linked) {
		// Add your logic here.
	}
}
