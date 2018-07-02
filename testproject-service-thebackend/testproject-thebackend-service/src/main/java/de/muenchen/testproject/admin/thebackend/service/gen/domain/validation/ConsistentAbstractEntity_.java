/*
* Copyright (c): it@M - Dienstleister fuer Informations- und Telekommunikationstechnik
* der Landeshauptstadt Muenchen, 2018
*/
package de.muenchen.testproject.admin.thebackend.service.gen.domain.validation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

import de.muenchen.testproject.admin.thebackend.service.domain.validation.ConsistentAbstractEntityValidator_;


/*
 * This file will be overwritten on every change of the model!
 * This file was automatically generated by Barrakuda.
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.TYPE, ElementType.ANNOTATION_TYPE })
@Constraint(validatedBy = { ConsistentAbstractEntityValidator_.class })
public @interface ConsistentAbstractEntity_ {

    String message() default "{ConsistentAbstractEntity_.default}";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

}
