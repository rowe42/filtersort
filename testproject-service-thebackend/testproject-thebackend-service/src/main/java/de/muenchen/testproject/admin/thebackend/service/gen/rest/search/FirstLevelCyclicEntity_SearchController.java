/*
* Copyright (c): it@M - Dienstleister fuer Informations- und Telekommunikationstechnik
* der Landeshauptstadt Muenchen, 2018
*/
package de.muenchen.testproject.admin.thebackend.service.gen.rest.search;


import java.lang.reflect.Field;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

import org.hibernate.search.exception.EmptyQueryException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.webmvc.BasePathAwareController;
import org.springframework.data.rest.webmvc.PersistentEntityResource;
import org.springframework.data.rest.webmvc.PersistentEntityResourceAssembler;
import org.springframework.hateoas.ExposesResourceFor;
import org.springframework.hateoas.Resources;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.beans.factory.annotation.Value;

import de.muenchen.testproject.commons.exceptions.TooManyResultsException;
import de.muenchen.testproject.commons.exceptions.NoSearchableFieldException;
import de.muenchen.testproject.commons.domain.QueryService;
import de.muenchen.testproject.commons.domain.QueryUtil;
import de.muenchen.testproject.admin.thebackend.service.gen.domain.FirstLevelCyclicEntity_;
import de.muenchen.testproject.admin.thebackend.service.rest.FirstLevelCyclicEntity_Repository;

/*
 * This file will be overwritten on every change of the model!
 * This file was automatically generated by Barrakuda.
 */
@BasePathAwareController
@ExposesResourceFor(FirstLevelCyclicEntity_.class)
@RequestMapping("/firstLevelCyclicEntitys/search")
public class FirstLevelCyclicEntity_SearchController {
		
    @Autowired
    private QueryService service;

    @Autowired
    private FirstLevelCyclicEntity_Repository repository;
    

    @Value("${service.configuration.maxSearchResults}")
    private Integer maxSearchResults;

    @RequestMapping(method = RequestMethod.GET, value = "findFullTextFuzzy")
    @ResponseBody
    public ResponseEntity<?> findFullTextFuzzy(PersistentEntityResourceAssembler assembler, @Param("q") String q) {
        if (q == null)
            q = "";

		// Get all fields-names (including superclass fields) annotated with @Field (or embedded via @IndexedEmbedded)
		List<String> annotatedFields = new ArrayList<String>();
	    Class tmpClass = FirstLevelCyclicEntity_.class;
	    while (tmpClass != null) {
		    annotatedFields.addAll(QueryUtil.getIndexedFields(tmpClass));
		    tmpClass = tmpClass.getSuperclass();
	    }

        Stream<FirstLevelCyclicEntity_> firstLevelCyclicEntityStream;
        try {
            firstLevelCyclicEntityStream = service.query(q, FirstLevelCyclicEntity_.class, annotatedFields.toArray(new String[annotatedFields.size()])).stream();
        } catch (EmptyQueryException e) {
            firstLevelCyclicEntityStream = StreamSupport.stream(repository.findAll().spliterator(), false);
        }

        final List<PersistentEntityResource> collect = firstLevelCyclicEntityStream.map(assembler::toResource).collect(Collectors.toList());
        return new ResponseEntity<Object>(new Resources<>(collect), HttpStatus.OK);
	}

    @RequestMapping(method = RequestMethod.GET, value ="findFullTextJunction")
    @ResponseBody
    public ResponseEntity<?> findFullTextJunction(PersistentEntityResourceAssembler assembler, @Param("q") String q)  throws TooManyResultsException, NoSearchableFieldException {
        if (q == null)
            q = "";

        // Get all fields-names (including superclass fields) annotated with @Field (or embedded via @IndexedEmbedded)
        List<String> annotatedFields = new ArrayList<>();
        Class tmpClass = FirstLevelCyclicEntity_.class;
        while (tmpClass != null) {
            annotatedFields.addAll(QueryUtil.getIndexedFields(tmpClass));
            tmpClass = tmpClass.getSuperclass();
        }

        Stream<FirstLevelCyclicEntity_> firstLevelCyclicEntityStream;

        try {
            firstLevelCyclicEntityStream = service.queryJunction(q, FirstLevelCyclicEntity_.class, annotatedFields.toArray(new String[annotatedFields.size()])).stream();
        } catch (EmptyQueryException e) {
            firstLevelCyclicEntityStream = StreamSupport.stream(repository.findAll().spliterator(), false);
        }

        final Set<PersistentEntityResource> collect = firstLevelCyclicEntityStream.map(assembler::toResource).collect(Collectors.toSet());


        if (collect.size() > maxSearchResults) throw new TooManyResultsException(maxSearchResults);

        return new ResponseEntity<>(new Resources<>(collect), HttpStatus.OK);
    }

}


