/*
* Copyright (c): it@M - Dienstleister fuer Informations- und Telekommunikationstechnik
* der Landeshauptstadt Muenchen, 2018
*/
package de.muenchen.testproject.apigateway;

import org.springframework.context.annotation.Configuration;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.ResourceSupport;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author roland
 */
@RestController
@Configuration
public class RootController {

    /**
     * Resource without content.
     */
    class RootLinksResource extends ResourceSupport {

        public RootLinksResource() {
        }
    }
    
    @RequestMapping(method = RequestMethod.GET, value = "/api")
    public @ResponseBody
    ResponseEntity<RootLinksResource> getActions() {
        RootLinksResource links = new RootLinksResource();
        //these lines need to be generated...
        //duplication to application.yml --> can this be somehow be avoided?
        Link userServiceLink = linkTo(RootController.class)
                .slash("api").slash("user_service").withRel("user_service");
        links.add(userServiceLink);
        Link thebackendServiceLink = linkTo(RootController.class)
            .slash("api").slash("testproject-thebackend-service").withRel("testproject-thebackend-service");
        links.add(thebackendServiceLink);
        return new ResponseEntity<>(links, HttpStatus.OK);
    }

}
