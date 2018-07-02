/*
* Copyright (c): it@M - Dienstleister fuer Informations- und Telekommunikationstechnik
* der Landeshauptstadt Muenchen, 2018
*/
package de.muenchen.testproject.admin.thebackend.service.rest.relationprovider;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.hateoas.RelProvider;
import org.springframework.stereotype.Component;
import org.springframework.util.ClassUtils;

import de.muenchen.testproject.admin.thebackend.service.gen.domain.AbstractEntity_;


/*
 * This file will NOT be overwritten by Barrakuda.
 * This file was automatically generated by Barrakuda.
 */
/**
 * The relation provider for the parent entity {@link AbstractEntity_}
 * of the associated inheritance hierarchy.
 */
@Component
@Order(Ordered.HIGHEST_PRECEDENCE)
public class AbstractEntityRelProvider implements RelProvider {

	private static final Logger LOG = LoggerFactory.getLogger(AbstractEntityRelProvider.class);

	public boolean supports(Class<?> delimiter) {
	        return ClassUtils.isAssignable(AbstractEntity_.class, delimiter);
	}

    public String getItemResourceRelFor(Class<?> type) {
        return "abstractEntity";
    }

    public String getCollectionResourceRelFor(Class<?> type) {
        return "abstractEntitys";
    }

}