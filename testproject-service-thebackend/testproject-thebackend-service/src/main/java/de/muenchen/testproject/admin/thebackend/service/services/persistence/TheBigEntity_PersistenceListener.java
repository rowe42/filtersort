/*
* Copyright (c): it@M - Dienstleister fuer Informations- und Telekommunikationstechnik
* der Landeshauptstadt Muenchen, 2018
*/
package de.muenchen.testproject.admin.thebackend.service.services.persistence;

import de.muenchen.testproject.admin.thebackend.service.gen.domain.TheBigEntity_;

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
 * A listener to do some stuff before and after database level operations for entity {@link TheBigEntity_}.
 */
public class TheBigEntity_PersistenceListener {

    private static final Logger LOG = LoggerFactory.getLogger(TheBigEntity_PersistenceListener.class);

    /**
     * Executed before the entity manager persist operation is actually executed or cascaded.
     * This call is synchronous with the persist operation.
     *
     * @param theBigEntity The entity to do some operation.
     */
    @PrePersist
    public void beforePersist(TheBigEntity_ theBigEntity) {
        // Implement your code here
    }

    /**
     * Executed after the entity manager persist operation is actually executed or cascaded.
     * This call is invoked after the database INSERT is executed.
     *
     * @param theBigEntity The entity to do some operation.
     */
    @PostPersist
    public void afterPersist(TheBigEntity_ theBigEntity) {
        // Implement your code
    }

    /**
     * Executed before the database UPDATE operation.
     *
     * @param theBigEntity The entity to do some operation.
     */
    @PreUpdate
    public void beforeUpdate(TheBigEntity_ theBigEntity) {
        // Implement your code here
    }

    /**
     * Executed after the database UPDATE operation.
     *
     * @param theBigEntity The entity to do some operation.
     */
    @PostUpdate
    public void afterUpdate(TheBigEntity_ theBigEntity) {
        // Implement your code here
    }

    /**
     * Executed before the entity manager remove operation is actually executed or cascaded.
     * This call is synchronous with the remove operation.
     *
     * @param theBigEntity The entity to do some operation.
     */
    @PreRemove
    public void beforeRemove(TheBigEntity_ theBigEntity) {
        // Implement your code here
    }

    /**
     * Executed after the entity manager remove operation is actually executed or cascaded.
     * This call is synchronous with the remove operation.
     *
     * @param theBigEntity The entity to do some operation.
     */
    @PostRemove
    public void afterRemove(TheBigEntity_ theBigEntity) {
        // Implement your code here
    }

    /**
     * Executed after an entity has been loaded into the current persistence
     * context or an entity has been refreshed.
     *
     * @param theBigEntity The entity to do some operation.
     */
    @PostLoad
    public void afterLoad(TheBigEntity_ theBigEntity) {
        // Implement your code here
    }

}
