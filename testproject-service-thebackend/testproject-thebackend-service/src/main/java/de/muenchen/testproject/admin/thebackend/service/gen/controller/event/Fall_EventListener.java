/*
* Copyright (c): it@M - Dienstleister fuer Informations- und Telekommunikationstechnik
* der Landeshauptstadt Muenchen, 2018
*/
package de.muenchen.testproject.admin.thebackend.service.gen.controller.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.core.event.AbstractRepositoryEventListener;
import org.springframework.stereotype.Component;

import de.muenchen.testproject.admin.thebackend.service.gen.domain.Fall_;
import de.muenchen.testproject.admin.thebackend.service.gen.services.event.Fall_EventService;

/*
 * This file will be overwritten on every change of the model!
 * This file was automatically generated by Barrakuda.
 */
/**
 * This event-listener allows a Fall_EventService to implement logic before and after Events.
 */
@Component
public class Fall_EventListener extends AbstractRepositoryEventListener<Fall_> {

	@Autowired
	private Fall_EventService service;

	@Override
	protected void onAfterCreate(Fall_ entity) {
		service.onAfterCreate(entity);
	}

	@Override
	protected void onBeforeCreate(Fall_ entity) {
		service.onBeforeCreate(entity);
	}

	@Override
	protected void onBeforeSave(Fall_ entity) {
		service.onBeforeSave(entity);
	}

	@Override
	protected void onAfterSave(Fall_ entity) {
		service.onAfterSave(entity);
	}

	@Override
	protected void onBeforeLinkSave(Fall_ parent, Object linked) {
		service.onBeforeLinkSave(parent, linked);
	}

	@Override
	protected void onAfterLinkSave(Fall_ parent, Object linked) {
		service.onAfterLinkSave(parent, linked);
	}

	@Override
	protected void onBeforeLinkDelete(Fall_ parent, Object linked) {
		service.onBeforeLinkDelete(parent, linked);
	}

	@Override
	protected void onBeforeDelete(Fall_ entity) {
		service.onBeforeDelete(entity);
	}

	@Override
	protected void onAfterDelete(Fall_ entity) {
		service.onAfterDelete(entity);
	}

	@Override
	protected void onAfterLinkDelete(Fall_ parent, Object linked) {
		service.onAfterLinkDelete(parent, linked);
	}

}
