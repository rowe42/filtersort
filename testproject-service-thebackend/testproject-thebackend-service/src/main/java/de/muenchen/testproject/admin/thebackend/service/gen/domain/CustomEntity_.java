/*
* Copyright (c): it@M - Dienstleister fuer Informations- und Telekommunikationstechnik
* der Landeshauptstadt Muenchen, 2018
*/
package de.muenchen.testproject.admin.thebackend.service.gen.domain;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Table;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Embedded;
import javax.persistence.OneToOne;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import org.hibernate.search.annotations.Indexed;
import org.hibernate.search.annotations.FieldBridge;
import org.hibernate.search.annotations.Field;
import de.muenchen.testproject.commons.domain.BaseEntity;
import de.muenchen.testproject.commons.domain.ObjectToStringBridge;
import de.muenchen.testproject.admin.thebackend.service.gen.domain.validation.ConsistentCustomEntity_;
import de.muenchen.testproject.admin.thebackend.service.services.persistence.CustomEntity_PersistenceListener;


/*
 * This file will be overwritten on every change of the model!
 * This file was automatically generated by Barrakuda.
 */
/**
 * This class represents a CustomEntity_.
 * <p>
 * Only oid and reference will be stored in the database.
 * The entity's content will be loaded according to the reference variable.
 * </p>
 */
@Entity
@EntityListeners(value = CustomEntity_PersistenceListener.class)
@Indexed
@Table(name = "customentity")
@ConsistentCustomEntity_
// Definition of getter, setter, ...
@NoArgsConstructor
@Getter
@Setter
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class CustomEntity_ extends BaseEntity  {
	
	// ========= //
	// Variables //
	// ========= //
	
	@Column(name="text", nullable=false, length=30)
	@Field
	@FieldBridge(impl = ObjectToStringBridge.class)
	@NotNull
	@Size(min=2, max=30)
	private String text;
	
	
	@Column(name="name", nullable=false, length=30)
	@Field
	@FieldBridge(impl = ObjectToStringBridge.class)
	@NotNull
	@Size(min=2, max=30)
	private String name;
	
	
	@Valid
	@Embedded
	@AttributeOverrides({
		@AttributeOverride(name="theFirstLevelText", column=@Column(name="fistlevel_thefirstleveltext", nullable=false, length=30))
	})	
	@NotNull
	private FirstLevelVo_ fistLevel;
	
	
	@Column(name="testgender", nullable=false)
	@Enumerated(EnumType.STRING)
	@NotNull
	private Gender_ testGender;
	
	
}
