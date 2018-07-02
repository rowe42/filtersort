/*
* Copyright (c): it@M - Dienstleister fuer Informations- und Telekommunikationstechnik
* der Landeshauptstadt Muenchen, 2018
*/
package de.muenchen.testproject.admin.thebackend.client.domain;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/*
 * This file will be overwritten on every change of the model!
 * This file was automatically generated by Barrakuda.
 */
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class AbstractEntity_DTO {

	private String dtype;
	
	private String text1;
	
}
