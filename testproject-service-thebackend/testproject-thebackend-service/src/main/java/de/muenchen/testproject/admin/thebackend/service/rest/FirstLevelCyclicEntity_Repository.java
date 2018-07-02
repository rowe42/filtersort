/*
* Copyright (c): it@M - Dienstleister fuer Informations- und Telekommunikationstechnik
* der Landeshauptstadt Muenchen, 2018
*/
package de.muenchen.testproject.admin.thebackend.service.rest;

import de.muenchen.testproject.admin.thebackend.service.gen.rest.Generated_FirstLevelCyclicEntity_Repository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.security.access.prepost.PreAuthorize;

import de.muenchen.testproject.admin.thebackend.service.gen.domain.FirstLevelCyclicEntity_;

/*
 * This file will NOT be overwritten by Barrakuda.
 * This file was automatically generated by Barrakuda.
 */
/**
* Provides a Repository for a {@link FirstLevelCyclicEntity_}. This Repository can be exported as a REST Resource.
* <p>
* The Repository handles CRUD Operations. Every Operation is secured and takes care of the tenancy.
* For specific Documentation on how the generated REST point behaves, please consider the Spring Data Rest Reference
* <a href="http://docs.spring.io/spring-data/rest/docs/current/reference/html/">here</a>.
* </p>
*/
@RepositoryRestResource(exported = true,
	path="firstLevelCyclicEntitys", collectionResourceRel="firstLevelCyclicEntitys")
@PreAuthorize("hasPermission(T(de.muenchen.testproject.admin.thebackend.service.gen.security.ResourcesEnum).thebackend_READ_FirstLevelCyclicEntity.name(),'Entitlements')")
public interface FirstLevelCyclicEntity_Repository extends Generated_FirstLevelCyclicEntity_Repository {
}
