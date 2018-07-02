/*
* Copyright (c): it@M - Dienstleister fuer Informations- und Telekommunikationstechnik
* der Landeshauptstadt Muenchen, 2018
*/
package de.muenchen.testproject.admin.thebackend.service.gen.controller.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.core.event.AbstractRepositoryEventListener;
import org.springframework.stereotype.Component;

import de.muenchen.testproject.admin.thebackend.service.gen.domain.FirstLevelEntity_;
import de.muenchen.testproject.admin.thebackend.service.gen.services.event.FirstLevelEntity_EventService;

/*
 * This file will be overwritten on every change of the model!
 * This file was automatically generated by Barrakuda.
 */
/**
 * This event-listener allows a FirstLevelEntity_EventService to implement logic before and after Events.
 */
@Component
public class FirstLevelEntity_EventListener extends AbstractRepositoryEventListener<FirstLevelEntity_> {

	@Autowired
	private FirstLevelEntity_EventService service;

	@Override
	protected void onAfterCreate(FirstLevelEntity_ entity) {
		service.onAfterCreate(entity);
	}

	@Override
	protected void onBeforeCreate(FirstLevelEntity_ entity) {
		service.onBeforeCreate(entity);
	}

	@Override
	protected void onBeforeSave(FirstLevelEntity_ entity) {
		service.onBeforeSave(entity);
	}

	@Override
	protected void onAfterSave(FirstLevelEntity_ entity) {
		service.onAfterSave(entity);
	}

	@Override
	protected void onBeforeLinkSave(FirstLevelEntity_ parent, Object linked) {
		service.onBeforeLinkSave(parent, linked);
	}

	@Override
	protected void onAfterLinkSave(FirstLevelEntity_ parent, Object linked) {
		service.onAfterLinkSave(parent, linked);
	}

	@Override
	protected void onBeforeLinkDelete(FirstLevelEntity_ parent, Object linked) {
		service.onBeforeLinkDelete(parent, linked);
	}

	@Override
	protected void onBeforeDelete(FirstLevelEntity_ entity) {
		service.onBeforeDelete(entity);
	}

	@Override
	protected void onAfterDelete(FirstLevelEntity_ entity) {
		service.onAfterDelete(entity);
	}

	@Override
	protected void onAfterLinkDelete(FirstLevelEntity_ parent, Object linked) {
		service.onAfterLinkDelete(parent, linked);
	}

}