/*
* Copyright (c): it@M - Dienstleister fuer Informations- und Telekommunikationstechnik
* der Landeshauptstadt Muenchen, 2018
*/
package de.muenchen.testproject.commons.auditing;

import de.muenchen.testproject.commons.domain.BaseEntity;
import org.hibernate.search.annotations.Field;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.Table;
import java.util.Date;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/*
 * This file will NOT be overwritten by Barrakuda.
 * This file was automatically generated by Barrakuda.
 */
/**
 * Entität die die Daten einer Änderung oder auch eines lesenden Zugriff beinhaltet.
 * Created by fabian.holtkoetter on 02.09.15.
 */
@Entity
@Table(name = "auditinguserentity")
@NoArgsConstructor
@Getter
@Setter
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class AuditingUserEntity extends BaseEntity {

    @Lob
    @Field
    @Column(name = "entity")
    private String entity;

    @Field
    @Column(name = "username")
    private String username;

    @Field
    @Column(name = "zeitstempel")
    private Date date;

    @Field
    @Column(name = "changetype")
    private String changeType;

}
