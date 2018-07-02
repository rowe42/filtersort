/*
* Copyright (c): it@M - Dienstleister fuer Informations- und Telekommunikationstechnik
* der Landeshauptstadt Muenchen, 2018
*/
package de.muenchen.testproject.admin.thebackend.service.gen.controller.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.core.event.AbstractRepositoryEventListener;
import org.springframework.stereotype.Component;

import de.muenchen.testproject.admin.thebackend.service.gen.domain.TheBigEntity_;
import de.muenchen.testproject.admin.thebackend.service.gen.services.event.TheBigEntity_EventService;

/*
 * This file will be overwritten on every change of the model!
 * This file was automatically generated by Barrakuda.
 */
/**
 * This event-listener allows a TheBigEntity_EventService to implement logic before and after Events.
 */
@Component
public class TheBigEntity_EventListener extends AbstractRepositoryEventListener<TheBigEntity_> {

	@Autowired
	private TheBigEntity_EventService service;

	@Override
	protected void onAfterCreate(TheBigEntity_ entity) {
		service.onAfterCreate(entity);
	}

	@Override
	protected void onBeforeCreate(TheBigEntity_ entity) {
		service.onBeforeCreate(entity);
	}

	@Override
	protected void onBeforeSave(TheBigEntity_ entity) {
		service.onBeforeSave(entity);
	}

	@Override
	protected void onAfterSave(TheBigEntity_ entity) {
		service.onAfterSave(entity);
	}

	@Override
	protected void onBeforeLinkSave(TheBigEntity_ parent, Object linked) {
		service.onBeforeLinkSave(parent, linked);
	}

	@Override
	protected void onAfterLinkSave(TheBigEntity_ parent, Object linked) {
		service.onAfterLinkSave(parent, linked);
	}

	@Override
	protected void onBeforeLinkDelete(TheBigEntity_ parent, Object linked) {
		service.onBeforeLinkDelete(parent, linked);
	}

	@Override
	protected void onBeforeDelete(TheBigEntity_ entity) {
		service.onBeforeDelete(entity);
	}

	@Override
	protected void onAfterDelete(TheBigEntity_ entity) {
		service.onAfterDelete(entity);
	}

	@Override
	protected void onAfterLinkDelete(TheBigEntity_ parent, Object linked) {
		service.onAfterLinkDelete(parent, linked);
	}

}