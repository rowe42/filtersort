/*
* Copyright (c): it@M - Dienstleister fuer Informations- und Telekommunikationstechnik
* der Landeshauptstadt Muenchen, 2018
*/
package de.muenchen.testproject.admin.thebackend.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.hateoas.config.EnableEntityLinks;
import org.springframework.hateoas.config.EnableHypermediaSupport;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;


/*
 * This file will NOT be overwritten by Barrakuda.
 * This file was automatically generated by Barrakuda.
 */
/**
 * Application class for starting the micro-service.
 */
@Configuration
@ComponentScan(basePackages = {
		"org.springframework.data.jpa.convert.threeten",
		"de.muenchen.testproject.commons.authorization",
		"de.muenchen.testproject.admin.thebackend.service",
		"de.muenchen.testproject.commons.auditing",
		"de.muenchen.testproject.commons.domain",
		"de.muenchen.testproject.commons.security",
		"de.muenchen.testproject.commons.validator"
		})
@EntityScan(basePackages = {
		"org.springframework.data.jpa.convert.threeten",
		"de.muenchen.testproject.admin.thebackend.service",
		"de.muenchen.testproject.commons.auditing",
		"de.muenchen.testproject.commons.domain",
		"de.muenchen.testproject.commons.security",
		"de.muenchen.testproject.commons.validator"
		})
@EnableJpaRepositories(basePackages = {
		"de.muenchen.testproject.admin.thebackend.service",
		"de.muenchen.testproject.commons.auditing",
		"de.muenchen.testproject.commons.domain",
		"de.muenchen.testproject.commons.security",
		"de.muenchen.testproject.commons.validator"
		})
@EnableAutoConfiguration
@EnableEntityLinks
@EnableHypermediaSupport(type = EnableHypermediaSupport.HypermediaType.HAL)
@EnableResourceServer
@EnableJpaAuditing
public class MicroServiceApplication {


	public static void main(String[] args) throws Exception {
        SpringApplication.run(MicroServiceApplication.class, args);
    }


}
