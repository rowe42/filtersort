/*
* Copyright (c): it@M - Dienstleister fuer Informations- und Telekommunikationstechnik
* der Landeshauptstadt Muenchen, 2018
*/
package de.muenchen.testproject.admin.thebackend.service.gen.controller.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.core.event.AbstractRepositoryEventListener;
import org.springframework.stereotype.Component;

import de.muenchen.testproject.admin.thebackend.service.gen.domain.SecondLevelEntity_;
import de.muenchen.testproject.admin.thebackend.service.gen.services.event.SecondLevelEntity_EventService;

/*
 * This file will be overwritten on every change of the model!
 * This file was automatically generated by Barrakuda.
 */
/**
 * This event-listener allows a SecondLevelEntity_EventService to implement logic before and after Events.
 */
@Component
public class SecondLevelEntity_EventListener extends AbstractRepositoryEventListener<SecondLevelEntity_> {

	@Autowired
	private SecondLevelEntity_EventService service;

	@Override
	protected void onAfterCreate(SecondLevelEntity_ entity) {
		service.onAfterCreate(entity);
	}

	@Override
	protected void onBeforeCreate(SecondLevelEntity_ entity) {
		service.onBeforeCreate(entity);
	}

	@Override
	protected void onBeforeSave(SecondLevelEntity_ entity) {
		service.onBeforeSave(entity);
	}

	@Override
	protected void onAfterSave(SecondLevelEntity_ entity) {
		service.onAfterSave(entity);
	}

	@Override
	protected void onBeforeLinkSave(SecondLevelEntity_ parent, Object linked) {
		service.onBeforeLinkSave(parent, linked);
	}

	@Override
	protected void onAfterLinkSave(SecondLevelEntity_ parent, Object linked) {
		service.onAfterLinkSave(parent, linked);
	}

	@Override
	protected void onBeforeLinkDelete(SecondLevelEntity_ parent, Object linked) {
		service.onBeforeLinkDelete(parent, linked);
	}

	@Override
	protected void onBeforeDelete(SecondLevelEntity_ entity) {
		service.onBeforeDelete(entity);
	}

	@Override
	protected void onAfterDelete(SecondLevelEntity_ entity) {
		service.onAfterDelete(entity);
	}

	@Override
	protected void onAfterLinkDelete(SecondLevelEntity_ parent, Object linked) {
		service.onAfterLinkDelete(parent, linked);
	}

}
