/*
* Copyright (c): it@M - Dienstleister fuer Informations- und Telekommunikationstechnik
* der Landeshauptstadt Muenchen, 2018
*/
package de.muenchen.testproject.admin.thebackend.service.gen.services.event;


import de.muenchen.testproject.admin.thebackend.service.gen.domain.TheBigEntity_;

/*
 * This file will be overwritten on every change of the model!
 * This file was automatically generated by Barrakuda.
 */
/**
 * Provides methods to implement logic before and after Events.
 */
public interface TheBigEntity_EventService {
	
	void onAfterCreate(TheBigEntity_ entity);
	
	void onBeforeCreate(TheBigEntity_ entity);
	
	void onBeforeSave(TheBigEntity_ entity);
	
	void onAfterSave(TheBigEntity_ entity);
	
	void onBeforeLinkSave(TheBigEntity_ parent, Object linked);
	
	void onAfterLinkSave(TheBigEntity_ parent, Object linked);
	
	void onBeforeLinkDelete(TheBigEntity_ parent, Object linked);
	
	void onBeforeDelete(TheBigEntity_ entity);
	
	void onAfterDelete(TheBigEntity_ entity);
	
	void onAfterLinkDelete(TheBigEntity_ parent, Object linked);
	
}
