/*
* Copyright (c): it@M - Dienstleister fuer Informations- und Telekommunikationstechnik
* der Landeshauptstadt Muenchen, 2018
*/
package de.muenchen.testproject.apigateway;

import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.oauth2.client.OAuth2ClientContext;
import org.springframework.security.oauth2.client.OAuth2RestOperations;
import org.springframework.security.oauth2.client.OAuth2RestTemplate;
import org.springframework.security.oauth2.client.resource.OAuth2ProtectedResourceDetails;

/**
 *
 * @author roland
 */
@Configuration
@EnableOAuth2Sso
@Profile("!no-security")
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        //TODO einen Weg finden, wie man das ohne csrf-disable hinbekommt!!!
        http
                .logout().logoutSuccessUrl("/loggedout.html").and()
                .authorizeRequests()
                .antMatchers("/loggedout.html").permitAll()
                .antMatchers("/api/testproject-thebackend-service/info").permitAll()
                .anyRequest().authenticated().and()
                .csrf().disable();
    }

}
