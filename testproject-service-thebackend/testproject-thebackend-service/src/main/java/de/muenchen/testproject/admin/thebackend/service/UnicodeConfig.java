/*
* Copyright (c): it@M - Dienstleister fuer Informations- und Telekommunikationstechnik
* der Landeshauptstadt Muenchen, 2018
*/
package de.muenchen.testproject.admin.thebackend.service;

import org.apache.commons.lang3.ArrayUtils;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import de.muenchen.testproject.commons.unicode.NfcRequestFilter;


/*
 * This file will NOT be overwritten by Barrakuda.
 * This file was automatically generated by Barrakuda.
 */
/**
 * <p><em>Beispiel</em> für Konfiguration des NFC Request-Filters</p>
 * <ul>
 *     <li>Es werden alle Requests gefiltert, die an URIs unter <em>/*</em> geschickt werden.</li>
 *     <li>Filter ist in Bean <em>nfcRequestFilter</em> enthalten.</li>
 *     <li>Es werden nur Requests mit den Content-Types <em>text/plain</em>; <em>application/json</em> und <em>text/html</em> gefiltert.</li>
 * </ul>
 */
@Configuration
public class UnicodeConfig {

	private static final String NFC_FILTER_NAME = "nfcRequestFilter";

	private static final String NFC_WHITE_LIST = "text/plain; application/json; text/html";

	private static final String[] NFC_URLS = ArrayUtils.toArray("/*");

	@Bean
	public FilterRegistrationBean nfcRequestFilterRegistration() {

	    final FilterRegistrationBean registration = new FilterRegistrationBean();
	    registration.setFilter(nfcRequestFilter());
	    registration.setName(NFC_FILTER_NAME);
	    registration.setOrder(1);
	    registration.setAsyncSupported(false);

	    //
	    // Setzen der URLs, auf die Filter anzuwenden ist.
	    //
	    registration.addUrlPatterns(NFC_URLS);

	    //
	    // Setzen der White-List von ContentTypes für
	    //
	    registration.addInitParameter(NfcRequestFilter.CONTENTTYPES_PROPERTY, NFC_WHITE_LIST);

	    return registration;

	}

	@Bean(name = NFC_FILTER_NAME)
	public NfcRequestFilter nfcRequestFilter() {
	    return new NfcRequestFilter();
	}

}
