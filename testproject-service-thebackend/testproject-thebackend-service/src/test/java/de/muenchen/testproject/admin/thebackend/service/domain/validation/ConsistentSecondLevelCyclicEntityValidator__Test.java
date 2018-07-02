/*
* Copyright (c): it@M - Dienstleister fuer Informations- und Telekommunikationstechnik
* der Landeshauptstadt Muenchen, 2018
*/
package de.muenchen.testproject.admin.thebackend.service.domain.validation;

import de.muenchen.testproject.admin.thebackend.service.MicroServiceApplication;
import de.muenchen.testproject.admin.thebackend.service.gen.domain.SecondLevelCyclicEntity_;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import javax.validation.ConstraintValidatorContext;

import java.math.BigDecimal;
import java.util.Arrays;
import de.muenchen.testproject.admin.thebackend.service.gen.domain.FirstLevelCyclicEntity_;

import static org.junit.Assert.assertTrue;


/*
 * This file will NOT be overwritten by Barrakuda.
 * This file was automatically generated by Barrakuda.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT, properties = {"spring.datasource.url=jdbc:h2:mem:testproject;DB_CLOSE_ON_EXIT=FALSE"})
@ContextConfiguration(classes={MicroServiceApplication.class})
@ActiveProfiles("test, no-security")
public class ConsistentSecondLevelCyclicEntityValidator__Test {

	private static final Logger LOG = LoggerFactory.getLogger(ConsistentSecondLevelCyclicEntityValidator__Test.class);

	private ConsistentSecondLevelCyclicEntityValidator_ validator;

	private SecondLevelCyclicEntity_  secondLevelCyclicEntity;

    private ConstraintValidatorContext constraintValidatorContext;

    @Before
    public void setUp() throws Exception {
    	validator = new  ConsistentSecondLevelCyclicEntityValidator_();
    	secondLevelCyclicEntity = new SecondLevelCyclicEntity_();
        constraintValidatorContext = new ConstraintValidatorContext() {

            @Override
            public void disableDefaultConstraintViolation() {
                LOG.info("disableDefaultConstraintViolation by unit test");
            }

            @Override
            public String getDefaultConstraintMessageTemplate() {
                return null;
            }

            @Override
            public ConstraintViolationBuilder buildConstraintViolationWithTemplate(String messageTemplate) {
            	
                LOG.info("disableDefaultConstraintViolation by unit test");
                
                return new ConstraintViolationBuilder() {
                	
                    @Override
                    public NodeBuilderDefinedContext addNode(String name) {
                        return null;
                    }

                    @Override
                    public NodeBuilderCustomizableContext addPropertyNode(String name) {
                    	
                        LOG.info("addPropertyNode by unit test");
                        
                        return new NodeBuilderCustomizableContext() {
                        	
                            @Override
                            public NodeContextBuilder inIterable() {
                                return null;
                            }

                            @Override
                            public NodeBuilderCustomizableContext addNode(String name) {
                                return null;
                            }

                            @Override
                            public NodeBuilderCustomizableContext addPropertyNode(String name) {
                                return null;
                            }

                            @Override
                            public LeafNodeBuilderCustomizableContext addBeanNode() {
                                return null;
                            }

                            @Override
                            public ConstraintValidatorContext addConstraintViolation() {
                            	
                                LOG.info("addPropertyNode by unit test");
                                
                                return null;
                            }
                        };
                    }

                    @Override
                    public LeafNodeBuilderCustomizableContext addBeanNode() {
                        return null;
                    }

                    @Override
                    public NodeBuilderDefinedContext addParameterNode(int index) {
                        return null;
                    }

                    @Override
                    public ConstraintValidatorContext addConstraintViolation() {
                        return null;
                    }
                };
            }

            @Override
            public <T> T unwrap(Class<T> type) {
                return null;
            }
        };
	}

    @Test
    public void isValid() {
    	
    	// "secondLevelCyclicEntity" with example values.
    	SecondLevelCyclicEntity_ secondLevelCyclicEntity = new SecondLevelCyclicEntity_();
    	secondLevelCyclicEntity.setText2("text2");
    	
    	FirstLevelCyclicEntity_ reftofirst_1 = new FirstLevelCyclicEntity_();
    	reftofirst_1.setText1("text1");
    	secondLevelCyclicEntity.getRefToFirst().add(reftofirst_1);
    	
    	assertTrue(validator.isValid(secondLevelCyclicEntity, constraintValidatorContext));
    	
    }

}
