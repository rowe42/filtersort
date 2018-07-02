/*
* Copyright (c): it@M - Dienstleister fuer Informations- und Telekommunikationstechnik
* der Landeshauptstadt Muenchen, 2018
*/
package de.muenchen.testproject.admin.thebackend.client.rest;

import org.springframework.hateoas.Link;
import org.springframework.hateoas.Resource;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

/*
 * This file will be overwritten on every change of the model!
 * This file was automatically generated by Barrakuda.
 */
public interface RestClient<T> {

    /**
     * Get all resources matched with string due to fuzzy search.
     * @param filter the string for the query
     * @return a List of all resources.
     */
    List<Resource<T>> findFullTextFuzzy(String filter);

    /**
     * Get all resources matched with string due to Boolean Junction supporting phrases search.
     * @param filter the string for the query
     * @return a List of all resources.
     */
    List<Resource<T>> findFullTextJunction(String filter);

    /**
     * Get all resources (with matching tenancy).
     *
     * @return a List of all resources.
     */
    List<Resource<T>> findAll();

    /**
     * Get all the resources (with matching tenancy) on a specific endpoint.
     * <p>
     *     For example: <code>http://localhost:80/entitys/1/attribute</code>
     * </p>
     * @param relation
     * @return a List of all resources.
     */
    List<Resource<T>> findAll(Link relation);

    /**
     * Try to find one resource (with matching tenancy) by its ID / self relation.
     *
     * @param link The ID / self relation of the resource.
     * @return an optional of the resources.
     */
    Optional<Resource<T>> findOne(Link link);

    /**
     * Set all the relations, specified by links, on a specific relation endpoint.
     * <p>
     * Example for an Endpoint: <code>http://localhost:80/entitys/1/attribute</code>
     * </p>
     * <p>
     * This method will always (re-) set the associations. The add or delete
     * functionality is not provided at RestClient level.
     * </p>
     *
     * @param endpoint The endpoint of the relation.
     * @param links The links that are set to be related.
     */
    void setRelations(Link endpoint, Collection<Link> links);

	/**
	 * Set the relation, specified by @relation, on a specific relation endpoint.
	 * <p>
	 * Example for an Endpoint: <code>http://localhost:80/entitys/1/attribute</code>
	 * </p>
	 * <p>
	 * This method will always (re-) set the association. The add or delete
	 * functionality is not provided at RestClient level.
	 * </p>
	 *
	 * @param endpoint The endpoint of the relation.
	 * @param relation The link that is set to be related.
	 */
	void setRelation(Link endpoint, Link relation);

    /**
     * Updates all the relations, specified by links, on a specific relation endpoint.
     * <p>
     * Example for an Endpoint: <code>http://localhost:80/entitys/1/attribute</code>
     * </p>
     *
     * @param endpoint The endpoint of the relation.
     * @param links The links that should be added.
     */
	public void updateRelations(Link endpoint, Collection<Link> links);

	/**
	 * Updates the relation, specified by @relation, on a specific relation endpoint.
	 * <p>
	 * Example for an Endpoint: <code>http://localhost:80/entitys/1/attribute</code>
	 * </p>
	 *
	 * @param endpoint The endpoint of the relation.
	 * @param relation The link that should be added.
	 */
	public void updateRelation(Link endpoint, Link relation);

    /**
     * Create a new resource, the returned resource will have the Links and its ID.
     * @param payload The resource to create, it must not contain any links.
     * @return the created resource (with ID).
     */
    Resource<T> create(T payload);

    /**
     * Update the fields of a resource.
     *
     * @param resource The updated resource that will be saved.
     * @return the updated version from the REST Server.
     */
    Resource<T> update(Resource<T> resource);

    /**
     * Try to delete an ID.
     * @param id The link to the id.
     */
    void delete(Link id);

    /**
     * Try to delete an resource.
     * @param resource The resource to delete.
     */
    void delete(Resource<T> resource);

}