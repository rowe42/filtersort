/*
* Copyright (c): it@M - Dienstleister fuer Informations- und Telekommunikationstechnik
* der Landeshauptstadt Muenchen, 2018
*/
package de.muenchen.testproject.commons.domain;


import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;


/*
 * This file will NOT be overwritten by Barrakuda.
 * This file was automatically generated by Barrakuda.
 */
/**
 * The util class for querying purposes.
 */
public class QueryUtil {

    /**
     * The method returns the strings of all indexed fields of a {@link Class} given in the parameter.
     * If the class contains an embedded field, this field will also be recursively searched for indexed fields.
     *
     * @param clazz The class for which the indexed fields should be returned.
     * @return A list of indexed fields.
     */
    public static List<String> getIndexedFields(Class<?> clazz) {
        String root = null;
        return getIndexedFields(root, clazz);
    }

    /**
     * The method returns the strings of all indexed fields of a {@link Class} given in the parameter.
     * If the class contains an embedded field, this field will also be recursively searched for indexed fields.
     *
     * @param root The path to the indexed field. Relevant for the recursive search in embedded fields.
     * @param clazz The class for which the indexed fields should be returned.
     * @return A list of indexed fields.
     */
    public static List<String> getIndexedFields(String root, Class<?> clazz) {

        List<String> indexedFields = new ArrayList<>();
        Class<?> tmpClass = clazz;
        String prefix = root != null ? root + "." : "";
        Field[] declaredFields = tmpClass.getDeclaredFields();

        for (Field field : declaredFields) {
            if (field.isAnnotationPresent(org.hibernate.search.annotations.Field.class)) {
                indexedFields.add(prefix + field.getName());
            } else if (field.isAnnotationPresent(org.hibernate.search.annotations.IndexedEmbedded.class)) {
                // get class of value object
                Class<?> indexedEmbeddedClass = field.getType();
                String indexedEmbeddedClassRoot = field.getName();
                indexedFields.addAll(getIndexedFields(prefix + indexedEmbeddedClassRoot, indexedEmbeddedClass));
            }
        }

        return indexedFields;
    }

}