/*
* Copyright (c): it@M - Dienstleister fuer Informations- und Telekommunikationstechnik
* der Landeshauptstadt Muenchen, 2018
*/
package de.muenchen.testproject.admin.thebackend.service.gen.domain;

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
import javax.persistence.ManyToMany;
import javax.persistence.OrderColumn;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import org.hibernate.search.annotations.Indexed;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import de.muenchen.testproject.commons.domain.AuditedBaseEntity;
import de.muenchen.testproject.commons.auditing.MUCAudited;
import de.muenchen.testproject.admin.thebackend.service.gen.domain.validation.ConsistentFall_;
import de.muenchen.testproject.admin.thebackend.service.services.persistence.Fall_PersistenceListener;


/*
 * This file will be overwritten on every change of the model!
 * This file was automatically generated by Barrakuda.
 */
/**
 * This class represents a Fall_.
 * <p>
 * Only oid and reference will be stored in the database.
 * The entity's content will be loaded according to the reference variable.
 * </p>
 */
@Entity
@EntityListeners(value = Fall_PersistenceListener.class)
@Indexed
@Table(name = "fall")
@ConsistentFall_
@MUCAudited({MUCAudited.ALL})
// Definition of getter, setter, ...
@NoArgsConstructor
@Getter
@Setter
@ToString(callSuper = true)
// Exclusion of self referencing, bidirectional and inverse relation attributes from EqualsAndHashCode to avoid circular referencing
@EqualsAndHashCode(callSuper = true, exclude = {"inverseReferences", "references"})
public class Fall_ extends AuditedBaseEntity  {
	
	// ========= //
	// Variables //
	// ========= //
	
	@Column(name="text", nullable=false, length=30)
	@NotNull
	@Size(min=2, max=30)
	private String text;
	
	// ================ //
	// Entity relations //
	// ================ //
	
	@ManyToMany
	@OrderColumn(name="order_index")
	@JoinTable(name = "fall_references", joinColumns = { @JoinColumn(name = "fk_fall_oid")}, inverseJoinColumns = {@JoinColumn(name="fk_references_oid")})
	@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "oid")
	private java.util.Set<Fall_> references = new java.util.HashSet<>();
	
	// ======================== //
	// Inverse entity relations //
	// =========================//
	
	@ManyToMany(mappedBy = "references")
	@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "oid")
	private java.util.Set<Fall_> inverseReferences = new java.util.HashSet<>();
	
	
}
