/*
* Copyright (c): it@M - Dienstleister fuer Informations- und Telekommunikationstechnik
* der Landeshauptstadt Muenchen, 2018
*/
package de.muenchen.testproject.admin.thebackend.client.businessactions;

import de.muenchen.testproject.admin.thebackend.client.domain.TheTest_BusinessActionParameters;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.hateoas.MediaTypes;
import org.springframework.hateoas.client.Traverson;
import org.springframework.hateoas.core.JsonPathLinkDiscoverer;
import org.springframework.hateoas.hal.HalLinkDiscoverer;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.util.Arrays;
import lombok.Getter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/*
 * This file will be overwritten on every change of the model!
 * This file was automatically generated by Barrakuda.
 */
/**
 * Provides a simple abstract implementation for executing BusinessActions on the Microservice.
 */
public abstract class BusinessActionsRestClientAbstract implements BusinessActionsRestClient {

	private static final Logger LOG = LoggerFactory.getLogger(BusinessActionsRestClientAbstract.class);

	/**
	 * A String equivalent of {@link MediaType#APPLICATION_JSON_UTF8}.
	 */
	private static final String APPLICATON_JSON_VALUE_UTF_8 = "application/json;charset=UTF-8";

	/**
	 * The path template for the {@link JsonPathLinkDiscoverer}.
	 */
	private static final String PATH_TEMPLATE = "$._links..['%s']..href";

	/**
	 * The relation on the base endpoint for the BusinessActions.
	 */
	public static final String BUSINESS_ACTIONS = "businessActions";

	/**
	 * The restTemplate to do the REST Operations.
	 */
	@Getter
	private final RestTemplate restTemplate;

	/**
	 * Tool used to traverse through the relations.
	 */
	@Getter
	private final Traverson traverson;

	/**
	 * Create a new BusinessActionsRestClientAbstract by RestTemplate of the server.
	 * @param restTemplate The restTemplate for the HTTP Requests.
	 * @param basePath The base path for the HTTP Requests.
	 */
	public BusinessActionsRestClientAbstract(RestTemplate restTemplate, final URI basePath) {
		this.restTemplate = restTemplate;
		traverson = new Traverson(basePath, MediaTypes.HAL_JSON);
		traverson.setRestOperations(restTemplate);
		this.traverson.setLinkDiscoverers(
				Arrays.asList(
						new HalLinkDiscoverer(),
						new JsonPathLinkDiscoverer(PATH_TEMPLATE, MediaType.valueOf(APPLICATON_JSON_VALUE_UTF_8))
				)
		);
	}

	/**
	* This BusinessAction's purpose is: test
	* It returns multiple String.
	*/
	@SuppressWarnings("unchecked")
	@Override
	public java.util.List<String> theTest(java.util.List<String> nameList,
			String name) {
		final TheTest_BusinessActionParameters params = new TheTest_BusinessActionParameters();
		params.setNameList(nameList);
		params.setName(name);
		URI link = URI.create(
				getTraverson()
						.follow(BUSINESS_ACTIONS, "theTest")
						.asLink()
						.getHref()
		);
		return restTemplate.exchange(link, HttpMethod.POST, new HttpEntity<>(params), new ParameterizedTypeReference<java.util.List<String>>() {}).getBody();
	}
	

}
