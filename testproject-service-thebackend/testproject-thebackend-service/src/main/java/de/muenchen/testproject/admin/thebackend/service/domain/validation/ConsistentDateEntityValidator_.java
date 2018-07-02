/*
* Copyright (c): it@M - Dienstleister fuer Informations- und Telekommunikationstechnik
* der Landeshauptstadt Muenchen, 2018
*/
package de.muenchen.testproject.admin.thebackend.service.domain.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import de.muenchen.testproject.admin.thebackend.service.gen.domain.DateEntity_;
import de.muenchen.testproject.admin.thebackend.service.gen.domain.validation.ConsistentDateEntity_;

/*
 * This file will NOT be overwritten by Barrakuda.
 * This file was automatically generated by Barrakuda.
 */
public class ConsistentDateEntityValidator_ implements ConstraintValidator<ConsistentDateEntity_, DateEntity_> {

	private static final Logger LOG = LoggerFactory.getLogger(ConsistentDateEntityValidator_.class);

	/**
	 * {@inheritDoc}
	 */
    @Override
    public void initialize(ConsistentDateEntity_ constraintAnnotation) {
    	
    	// implement your initialization logic for the Validator here (if any)
    	
    }

	/**
	 * {@inheritDoc}
	 *
	 * To define an own constraint violation message, disable the default message 
	 * at the beginning of the method "isValid" with {@link ConstraintValidatorContext#disableDefaultConstraintViolation}.
	 * Afterwards check for constraint violation and use {@link ConstraintValidatorContext#buildConstraintViolationWithTemplate}
	 * to define your own message when necessary.
	 */
    @Override
    public boolean isValid(DateEntity_ value, ConstraintValidatorContext context) {
    	boolean valid = true;
    	
        // implement your custom class level validation logic here
        
        return valid;
    }

}
