/*
* Copyright (c): it@M - Dienstleister fuer Informations- und Telekommunikationstechnik
* der Landeshauptstadt Muenchen, 2018
*/
package de.muenchen.testproject.admin.thebackend.service.services.event;

import org.springframework.stereotype.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import de.muenchen.testproject.admin.thebackend.service.gen.domain.SecondLevelEntity_;
import de.muenchen.testproject.admin.thebackend.service.gen.services.event.SecondLevelEntity_EventService;

/*
 * This file will NOT be overwritten by Barrakuda.
 * This file was automatically generated by Barrakuda.
 */
/**
 * Provides methods to implement logic before and after Events.
 * If used as generated by Barrakuda this service will be autowired and called by SecondLevelEntity_EventListener.
 */
@Service
public class SecondLevelEntity_EventServiceImpl implements SecondLevelEntity_EventService {
	
	private static final Logger LOG = LoggerFactory.getLogger(SecondLevelEntity_EventServiceImpl.class);
	
	// If you need access to the database you can autowire a Repository.
	// Repositories are generated into the package: .gen.rest
	//
	// @Autowired
	// private <EntityName>Repository repo;
	
	@Override
	public void onAfterCreate(SecondLevelEntity_ entity) {
		// Add your logic here.
	}
	@Override
	public void onBeforeCreate(SecondLevelEntity_ entity) {
		// Add your logic here.
	}
	@Override
	public void onBeforeSave(SecondLevelEntity_ entity) {
		// Add your logic here.
	}
	@Override
	public void onAfterSave(SecondLevelEntity_ entity) {
		// Add your logic here.
	}
	@Override
	public void onBeforeLinkSave(SecondLevelEntity_ parent, Object linked) {
		// Add your logic here.
	}
	@Override
	public void onAfterLinkSave(SecondLevelEntity_ parent, Object linked) {
		// Add your logic here.
	}
	@Override
	public void onBeforeLinkDelete(SecondLevelEntity_ parent, Object linked) {
		// Add your logic here.
	}
	@Override
	public void onBeforeDelete(SecondLevelEntity_ entity) {
		// Add your logic here.
	}
	@Override
	public void onAfterDelete(SecondLevelEntity_ entity) {
		// Add your logic here.
	}
	@Override
	public void onAfterLinkDelete(SecondLevelEntity_ parent, Object linked) {
		// Add your logic here.
	}
}
