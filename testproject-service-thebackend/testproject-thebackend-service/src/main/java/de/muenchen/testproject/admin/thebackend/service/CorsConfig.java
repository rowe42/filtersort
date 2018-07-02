/*
* Copyright (c): it@M - Dienstleister fuer Informations- und Telekommunikationstechnik
* der Landeshauptstadt Muenchen, 2018
*/
package de.muenchen.testproject.admin.thebackend.service;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.web.filter.CorsFilter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


/*
 * This file will NOT be overwritten by Barrakuda.
 * This file was automatically generated by Barrakuda.
 */
@Configuration
@Profile({"local", "no-security"})
public class CorsConfig {

	/**
 	 * Provides the bean of type {@link LhmCorsFilter} to do the CORS configuration programmatically.
 	 * The CORS filter is needed for development purposes of the js gui.
 	 *
 	 * @return The {@link CorsFilter} for development purposes.
 	 */
 	@Bean
 	public LhmCorsFilter filter() {

 		return new LhmCorsFilter();

 	}

	/**
	 * A filter class that adds the CORS headers to each response.
	 *
	 * Workaround for following Barrakuda issue: https://gitp001.srv.ha3.dir.muenchen.de/mdsd/barrakuda/issues/449
	 */
	@Order(Ordered.HIGHEST_PRECEDENCE)
	public class LhmCorsFilter implements Filter {

		/**
		 * The method adds CORS headers to all {@link HttpServletResponse}.
		 *
		 * Workaround for following Barrakuda issue: https://gitp001.srv.ha3.dir.muenchen.de/mdsd/barrakuda/issues/449
		 *
		 *
		 * @param request The servlet request we are processing
		 * @param response The servlet response we are creating
		 *
		 * @exception IOException if an input/output error occurs
		 * @exception ServletException if a servlet exception occurs
		 */
		@Override
		public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

			if (response instanceof HttpServletResponse) {
				HttpServletResponse httpResponse = (HttpServletResponse) response;
				httpResponse.setHeader("Access-Control-Allow-Origin", "http://localhost:8081");
				httpResponse.setHeader("Access-Control-Allow-Credentials", "true");
				httpResponse.setHeader("Access-Control-Allow-Methods", "GET, HEAD, POST, PUT, DELETE, TRACE, OPTIONS, PATCH");
				httpResponse.setHeader("Access-Control-Max-Age", "3600");
				httpResponse.setHeader("Access-Control-Allow-Headers", "Origin, X-Requested-With, Content-Type, Accept, Authorization, If-Match, If-None-Match");

				//
				// The headers which should be available in the
				// frontend gui due to response handling.
				//
				httpResponse.setHeader("Access-Control-Expose-Headers", "Location, Etag");
			}

			if (request instanceof HttpServletRequest) {
				chain.doFilter(request, response);
			}

		}

		@Override
		public void init(FilterConfig filterConfig) throws ServletException {
			// No code necessary
		}

		@Override
		public void destroy() {
			// No code necessary
		}

	}

}
