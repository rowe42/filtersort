/*
* Copyright (c): it@M - Dienstleister fuer Informations- und Telekommunikationstechnik
* der Landeshauptstadt Muenchen, 2018
*/
package de.muenchen.testproject.admin.thebackend.service.gen.controller.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.core.event.AbstractRepositoryEventListener;
import org.springframework.stereotype.Component;

import de.muenchen.testproject.admin.thebackend.service.gen.domain.CustomEntity_;
import de.muenchen.testproject.admin.thebackend.service.gen.services.event.CustomEntity_EventService;

/*
 * This file will be overwritten on every change of the model!
 * This file was automatically generated by Barrakuda.
 */
/**
 * This event-listener allows a CustomEntity_EventService to implement logic before and after Events.
 */
@Component
public class CustomEntity_EventListener extends AbstractRepositoryEventListener<CustomEntity_> {

	@Autowired
	private CustomEntity_EventService service;

	@Override
	protected void onAfterCreate(CustomEntity_ entity) {
		service.onAfterCreate(entity);
	}

	@Override
	protected void onBeforeCreate(CustomEntity_ entity) {
		service.onBeforeCreate(entity);
	}

	@Override
	protected void onBeforeSave(CustomEntity_ entity) {
		service.onBeforeSave(entity);
	}

	@Override
	protected void onAfterSave(CustomEntity_ entity) {
		service.onAfterSave(entity);
	}

	@Override
	protected void onBeforeLinkSave(CustomEntity_ parent, Object linked) {
		service.onBeforeLinkSave(parent, linked);
	}

	@Override
	protected void onAfterLinkSave(CustomEntity_ parent, Object linked) {
		service.onAfterLinkSave(parent, linked);
	}

	@Override
	protected void onBeforeLinkDelete(CustomEntity_ parent, Object linked) {
		service.onBeforeLinkDelete(parent, linked);
	}

	@Override
	protected void onBeforeDelete(CustomEntity_ entity) {
		service.onBeforeDelete(entity);
	}

	@Override
	protected void onAfterDelete(CustomEntity_ entity) {
		service.onAfterDelete(entity);
	}

	@Override
	protected void onAfterLinkDelete(CustomEntity_ parent, Object linked) {
		service.onAfterLinkDelete(parent, linked);
	}

}
