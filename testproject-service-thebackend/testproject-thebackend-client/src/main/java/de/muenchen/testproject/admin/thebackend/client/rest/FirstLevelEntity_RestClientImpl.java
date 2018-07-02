/*
* Copyright (c): it@M - Dienstleister fuer Informations- und Telekommunikationstechnik
* der Landeshauptstadt Muenchen, 2018
*/
package de.muenchen.testproject.admin.thebackend.client.rest;

import de.muenchen.testproject.admin.thebackend.client.domain.FirstLevelEntity_DTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.hateoas.Resource;
import org.springframework.hateoas.Resources;
import org.springframework.web.client.RestTemplate;

import java.net.URI;

/*
 * This file will NOT be overwritten by Barrakuda.
 * This file was automatically generated by Barrakuda.
 */
/**
 * A concrete implementation of the rest client with a RestTemplate of the server.
 * It can be used to create additional method to enhance this rest client.
 */
public class FirstLevelEntity_RestClientImpl extends RestClientImpl<FirstLevelEntity_DTO> {

	private static final Logger LOG = LoggerFactory.getLogger(FirstLevelEntity_RestClientImpl.class);

	/**
	 * Instantiates an implementation of the RestClient by RestTemplate of the server.
	 * @param restTemplate The restTemplate for the HTTP Requests.
	 * @param basePath The base URI of the REST Server.
	 */
	public FirstLevelEntity_RestClientImpl(RestTemplate restTemplate, final URI basePath) {
		super(restTemplate,
				basePath,
				"firstlevelentitys",
				new ParameterizedTypeReference<Resources<Resource<FirstLevelEntity_DTO>>>() {},
				new ParameterizedTypeReference<Resource<FirstLevelEntity_DTO>>() {});
	}

	/**
	 * Instantiates an implementation of the RestClient by RestTemplate of the server.
	 * @param restTemplate The restTemplate for the HTTP Requests.
	 * @param basePath The base URI of the REST Server.
	 */
	public FirstLevelEntity_RestClientImpl(RestTemplate restTemplate, final String basePath) {
		this(restTemplate, URI.create(basePath));
	}

}
