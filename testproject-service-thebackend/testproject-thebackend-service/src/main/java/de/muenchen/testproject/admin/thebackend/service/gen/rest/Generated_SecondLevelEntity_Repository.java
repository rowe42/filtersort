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

import de.muenchen.testproject.admin.thebackend.service.gen.domain.SecondLevelEntity_;

/*
 * This file will be overwritten on every change of the model!
 * This file was automatically generated by Barrakuda.
 */
@NoRepositoryBean
public interface Generated_SecondLevelEntity_Repository extends CrudRepository<SecondLevelEntity_, UUID> { //NOSONAR
	/**
	 * Name for the specific cache.
	 */
	String CACHE = "SECONDLEVELENTITY_CACHE";
	
	/**
	 * Get all the SecondLevelEntity_ entities.
	 *
	 * @return an Iterable of the SecondLevelEntity_ entities with the same Tenancy.
	 */
	@Override
	Iterable<SecondLevelEntity_> findAll();
	
	/**
	 * Get one specific SecondLevelEntity_ by its unique oid.
	 *
	 * @param oid The identifier of the SecondLevelEntity_.
	 * @return The SecondLevelEntity_ with the requested oid.
	 */
	@Override
	@Cacheable(value = CACHE, key = "#p0", condition = "@repositoriesCacheProperties.secondLevelEntityRepoActive")
	SecondLevelEntity_ findOne(UUID oid);
	
	/**
	 * Create or update a SecondLevelEntity_.
	 * <p>
	 * If the oid already exists, the SecondLevelEntity_ will be overridden, hence update.
	 * If the oid does no already exist, a new SecondLevelEntity_ will be created, hence create.
	 * </p>
	 *
	 * @param secondLevelEntity The SecondLevelEntity_ that will be saved.
	 * @return the saved SecondLevelEntity_.
	 */
	@Override
	@CachePut(value = CACHE, key = "#p0.oid", condition = "@repositoriesCacheProperties.secondLevelEntityRepoActive")
	@PreAuthorize("hasPermission(T(de.muenchen.testproject.admin.thebackend.service.gen.security.ResourcesEnum).thebackend_WRITE_SecondLevelEntity.name(),'Entitlements')")
	<S extends SecondLevelEntity_> S save(S secondLevelEntity);
	
	/**
	 * Delete the SecondLevelEntity_ by a specified oid.
	 *
	 * @param oid the unique oid of the SecondLevelEntity_ that will be deleted.
	 */
	@Override
	@CacheEvict(value = CACHE, key = "#p0", condition = "@repositoriesCacheProperties.secondLevelEntityRepoActive")
	@PreAuthorize("hasPermission(T(de.muenchen.testproject.admin.thebackend.service.gen.security.ResourcesEnum).thebackend_DELETE_SecondLevelEntity.name(),'Entitlements')")
	void delete(UUID oid);
	
	/**
	 * Delete a SecondLevelEntity_ by entity.
	 *
	 * @param entity The SecondLevelEntity_ that will be deleted.
	 */
	@Override
	@CacheEvict(value = CACHE, key = "#p0.oid", condition = "@repositoriesCacheProperties.secondLevelEntityRepoActive")
	@PreAuthorize("hasPermission(T(de.muenchen.testproject.admin.thebackend.service.gen.security.ResourcesEnum).thebackend_DELETE_SecondLevelEntity.name(),'Entitlements')")
	void delete(SecondLevelEntity_ entity);
	
	/**
	 * Delete multiple SecondLevelEntity_ entities by their oid.
	 *
	 * @param entities The Iterable of SecondLevelEntity_ entities that will be deleted.
	 */
	@Override
	@CacheEvict(value = CACHE, allEntries = true, condition = "@repositoriesCacheProperties.secondLevelEntityRepoActive")
	@PreAuthorize("hasPermission(T(de.muenchen.testproject.admin.thebackend.service.gen.security.ResourcesEnum).thebackend_DELETE_SecondLevelEntity.name(),'Entitlements')")
	void delete(Iterable<? extends SecondLevelEntity_> entities);
	
	/**
	 * Delete all SecondLevelEntity_ entities.
	 */
	@Override
	@CacheEvict(value = CACHE, allEntries = true, condition = "@repositoriesCacheProperties.secondLevelEntityRepoActive")
	@PreAuthorize("hasPermission(T(de.muenchen.testproject.admin.thebackend.service.gen.security.ResourcesEnum).thebackend_DELETE_SecondLevelEntity.name(),'Entitlements')")
	void deleteAll();
	
	List<SecondLevelEntity_> findByText1(@Param(value= "text1") String text1);
	List<SecondLevelEntity_> findByText2(@Param(value= "text2") String text2);
	List<SecondLevelEntity_> findByText3(@Param(value= "text3") String text3);
	
	
}
