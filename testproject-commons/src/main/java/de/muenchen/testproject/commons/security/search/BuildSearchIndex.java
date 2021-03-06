/*
* Copyright (c): it@M - Dienstleister fuer Informations- und Telekommunikationstechnik
* der Landeshauptstadt Muenchen, 2018
*/
package de.muenchen.testproject.commons.security.search;


import org.hibernate.search.jpa.FullTextEntityManager;
import org.hibernate.search.jpa.Search;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/*
 * This file will NOT be overwritten by Barrakuda.
 * This file was automatically generated by Barrakuda.
 */
@Component
public class BuildSearchIndex implements ApplicationListener {

	private static final Logger LOG = LoggerFactory.getLogger(BuildSearchIndex.class);

    @PersistenceContext
    private EntityManager entityManager;

    /**
     * Create an initial Lucene index for the data already present in the database.
     * This method is called during Spring's startup.
     */
    @Override
    public void onApplicationEvent(ApplicationEvent event) {
    	
        if(event.getClass().equals(ContextRefreshedEvent.class)){
            try {
                FullTextEntityManager fullTextEntityManager =
                        Search.getFullTextEntityManager(entityManager);
                fullTextEntityManager.createIndexer().startAndWait();
            } catch (InterruptedException | IllegalArgumentException e) {
                LOG.error("An error occurred trying to build the search index: {}", e.toString());
            }
        }
        
    }

}
