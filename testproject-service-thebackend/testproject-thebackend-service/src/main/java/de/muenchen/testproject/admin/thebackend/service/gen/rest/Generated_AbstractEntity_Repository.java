/*
* Copyright (c): it@M - Dienstleister fuer Informations- und Telekommunikationstechnik
* der Landeshauptstadt Muenchen, 2018
*/
package de.muenchen.testproject.admin.thebackend.service.gen.rest;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.repository.NoRepositoryBean;
import java.util.List;
import java.util.UUID;
import org.springframework.security.access.prepost.PreAuthorize;

import de.muenchen.testproject.admin.thebackend.service.gen.domain.AbstractEntity_;

/*
 * This file will be overwritten on every change of the model!
 * This file was automatically generated by Barrakuda.
 */
@NoRepositoryBean
public interface Generated_AbstractEntity_Repository extends CrudRepository<AbstractEntity_, UUID> { //NOSONAR
	/**
	 * Name for the specific cache.
	 */
	String CACHE = "ABSTRACTENTITY_CACHE";
	
	/**
	 * Get all the AbstractEntity_ entities.
	 *
	 * @return an Iterable of the AbstractEntity_ entities with the same Tenancy.
	 */
	@Override
	Iterable<AbstractEntity_> findAll();
	
	/**
	 * Get one specific AbstractEntity_ by its unique oid.
	 *
	 * @param oid The identifier of the AbstractEntity_.
	 * @return The AbstractEntity_ with the requested oid.
	 */
	@Override
	@Cacheable(value = CACHE, key = "#p0", condition = "@repositoriesCacheProperties.abstractEntityRepoActive")
	AbstractEntity_ findOne(UUID oid);
	
	/**
	 * Create or update a AbstractEntity_.
	 * <p>
	 * If the oid already exists, the AbstractEntity_ will be overridden, hence update.
	 * If the oid does no already exist, a new AbstractEntity_ will be created, hence create.
	 * </p>
	 *
	 * @param abstractEntity The AbstractEntity_ that will be saved.
	 * @return the saved AbstractEntity_.
	 */
	@Override
	@CachePut(value = CACHE, key = "#p0.oid", condition = "@repositoriesCacheProperties.abstractEntityRepoActive")
	@PreAuthorize("hasPermission(T(de.muenchen.testproject.admin.thebackend.service.gen.security.ResourcesEnum).thebackend_WRITE_AbstractEntity.name(),'Entitlements')" +
			"or hasPermission(T(de.muenchen.testproject.admin.thebackend.service.gen.security.ResourcesEnum).thebackend_WRITE_FirstLevelEntity.name(),'Entitlements')" +
			"or hasPermission(T(de.muenchen.testproject.admin.thebackend.service.gen.security.ResourcesEnum).thebackend_WRITE_SecondLevelEntity.name(),'Entitlements')")
	<S extends AbstractEntity_> S save(S abstractEntity);
	
	/**
	 * Delete the AbstractEntity_ by a specified oid.
	 *
	 * @param oid the unique oid of the AbstractEntity_ that will be deleted.
	 */
	@Override
	@CacheEvict(value = CACHE, key = "#p0", condition = "@repositoriesCacheProperties.abstractEntityRepoActive")
	@PreAuthorize("hasPermission(T(de.muenchen.testproject.admin.thebackend.service.gen.security.ResourcesEnum).thebackend_DELETE_AbstractEntity.name(),'Entitlements')" +
			"or hasPermission(T(de.muenchen.testproject.admin.thebackend.service.gen.security.ResourcesEnum).thebackend_DELETE_FirstLevelEntity.name(),'Entitlements')" +
			"or hasPermission(T(de.muenchen.testproject.admin.thebackend.service.gen.security.ResourcesEnum).thebackend_DELETE_SecondLevelEntity.name(),'Entitlements')")
	void delete(UUID oid);
	
	/**
	 * Delete a AbstractEntity_ by entity.
	 *
	 * @param entity The AbstractEntity_ that will be deleted.
	 */
	@Override
	@CacheEvict(value = CACHE, key = "#p0.oid", condition = "@repositoriesCacheProperties.abstractEntityRepoActive")
	@PreAuthorize("hasPermission(T(de.muenchen.testproject.admin.thebackend.service.gen.security.ResourcesEnum).thebackend_DELETE_AbstractEntity.name(),'Entitlements')" +
			"or hasPermission(T(de.muenchen.testproject.admin.thebackend.service.gen.security.ResourcesEnum).thebackend_DELETE_FirstLevelEntity.name(),'Entitlements')" +
			"or hasPermission(T(de.muenchen.testproject.admin.thebackend.service.gen.security.ResourcesEnum).thebackend_DELETE_SecondLevelEntity.name(),'Entitlements')")
	void delete(AbstractEntity_ entity);
	
	/**
	 * Delete multiple AbstractEntity_ entities by their oid.
	 *
	 * @param entities The Iterable of AbstractEntity_ entities that will be deleted.
	 */
	@Override
	@CacheEvict(value = CACHE, allEntries = true, condition = "@repositoriesCacheProperties.abstractEntityRepoActive")
	@PreAuthorize("hasPermission(T(de.muenchen.testproject.admin.thebackend.service.gen.security.ResourcesEnum).thebackend_DELETE_AbstractEntity.name(),'Entitlements')" +
			"or hasPermission(T(de.muenchen.testproject.admin.thebackend.service.gen.security.ResourcesEnum).thebackend_DELETE_FirstLevelEntity.name(),'Entitlements')" +
			"or hasPermission(T(de.muenchen.testproject.admin.thebackend.service.gen.security.ResourcesEnum).thebackend_DELETE_SecondLevelEntity.name(),'Entitlements')")
	void delete(Iterable<? extends AbstractEntity_> entities);
	
	/**
	 * Delete all AbstractEntity_ entities.
	 */
	@Override
	@CacheEvict(value = CACHE, allEntries = true, condition = "@repositoriesCacheProperties.abstractEntityRepoActive")
	@PreAuthorize("hasPermission(T(de.muenchen.testproject.admin.thebackend.service.gen.security.ResourcesEnum).thebackend_DELETE_AbstractEntity.name(),'Entitlements')" +
			"or hasPermission(T(de.muenchen.testproject.admin.thebackend.service.gen.security.ResourcesEnum).thebackend_DELETE_FirstLevelEntity.name(),'Entitlements')" +
			"or hasPermission(T(de.muenchen.testproject.admin.thebackend.service.gen.security.ResourcesEnum).thebackend_DELETE_SecondLevelEntity.name(),'Entitlements')")
	void deleteAll();
	
	List<AbstractEntity_> findByText1(@Param(value= "text1") String text1);
	
	
}
