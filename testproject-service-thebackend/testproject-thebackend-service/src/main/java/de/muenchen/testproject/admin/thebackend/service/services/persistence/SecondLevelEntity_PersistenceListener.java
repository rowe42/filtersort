/*
* Copyright (c): it@M - Dienstleister fuer Informations- und Telekommunikationstechnik
* der Landeshauptstadt Muenchen, 2018
*/
package de.muenchen.testproject.admin.thebackend.service.services.persistence;

import de.muenchen.testproject.admin.thebackend.service.gen.domain.SecondLevelEntity_;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.persistence.PostLoad;
import javax.persistence.PostPersist;
import javax.persistence.PostRemove;
import javax.persistence.PostUpdate;
import javax.persistence.PrePersist;
import javax.persistence.PreRemove;
import javax.persistence.PreUpdate;


/*
 * This file will NOT be overwritten by Barrakuda.
 * This file was automatically generated by Barrakuda.
 */
/**
 * A listener to do some stuff before and after database level operations for entity {@link SecondLevelEntity_}.
 */
public class SecondLevelEntity_PersistenceListener {

    private static final Logger LOG = LoggerFactory.getLogger(SecondLevelEntity_PersistenceListener.class);

    /**
     * Executed before the entity manager persist operation is actually executed or cascaded.
     * This call is synchronous with the persist operation.
     *
     * @param secondLevelEntity The entity to do some operation.
     */
    @PrePersist
    public void beforePersist(SecondLevelEntity_ secondLevelEntity) {
        // Implement your code here
    }

    /**
     * Executed after the entity manager persist operation is actually executed or cascaded.
     * This call is invoked after the database INSERT is executed.
     *
     * @param secondLevelEntity The entity to do some operation.
     */
    @PostPersist
    public void afterPersist(SecondLevelEntity_ secondLevelEntity) {
        // Implement your code
    }

    /**
     * Executed before the database UPDATE operation.
     *
     * @param secondLevelEntity The entity to do some operation.
     */
    @PreUpdate
    public void beforeUpdate(SecondLevelEntity_ secondLevelEntity) {
        // Implement your code here
    }

    /**
     * Executed after the database UPDATE operation.
     *
     * @param secondLevelEntity The entity to do some operation.
     */
    @PostUpdate
    public void afterUpdate(SecondLevelEntity_ secondLevelEntity) {
        // Implement your code here
    }

    /**
     * Executed before the entity manager remove operation is actually executed or cascaded.
     * This call is synchronous with the remove operation.
     *
     * @param secondLevelEntity The entity to do some operation.
     */
    @PreRemove
    public void beforeRemove(SecondLevelEntity_ secondLevelEntity) {
        // Implement your code here
    }

    /**
     * Executed after the entity manager remove operation is actually executed or cascaded.
     * This call is synchronous with the remove operation.
     *
     * @param secondLevelEntity The entity to do some operation.
     */
    @PostRemove
    public void afterRemove(SecondLevelEntity_ secondLevelEntity) {
        // Implement your code here
    }

    /**
     * Executed after an entity has been loaded into the current persistence
     * context or an entity has been refreshed.
     *
     * @param secondLevelEntity The entity to do some operation.
     */
    @PostLoad
    public void afterLoad(SecondLevelEntity_ secondLevelEntity) {
        // Implement your code here
    }

}