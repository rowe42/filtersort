/*
* Copyright (c): it@M - Dienstleister fuer Informations- und Telekommunikationstechnik
* der Landeshauptstadt Muenchen, 2018
*/
package de.muenchen.testproject.admin.thebackend.service.domain.validation;

import de.muenchen.testproject.admin.thebackend.service.MicroServiceApplication;
import de.muenchen.testproject.admin.thebackend.service.gen.domain.CustomEntity_;
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
import de.muenchen.testproject.admin.thebackend.service.gen.domain.Gender_;
import java.util.Arrays;
import de.muenchen.testproject.admin.thebackend.service.gen.domain.FirstLevelVo_;

import static org.junit.Assert.assertTrue;


/*
 * This file will NOT be overwritten by Barrakuda.
 * This file was automatically generated by Barrakuda.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT, properties = {"spring.datasource.url=jdbc:h2:mem:testproject;DB_CLOSE_ON_EXIT=FALSE"})
@ContextConfiguration(classes={MicroServiceApplication.class})
@ActiveProfiles("test, no-security")
public class ConsistentCustomEntityValidator__Test {

	private static final Logger LOG = LoggerFactory.getLogger(ConsistentCustomEntityValidator__Test.class);

	private ConsistentCustomEntityValidator_ validator;

	private CustomEntity_  customEntity;

    private ConstraintValidatorContext constraintValidatorContext;

    @Before
    public void setUp() throws Exception {
    	validator = new  ConsistentCustomEntityValidator_();
    	customEntity = new CustomEntity_();
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
    	
    	// "customEntity" with example values.
    	CustomEntity_ customEntity = new CustomEntity_();
    	customEntity.setText("test");
    	customEntity.setName("test");
    	
    	FirstLevelVo_ fistlevel_1 = new FirstLevelVo_();
    	fistlevel_1.setTheFirstLevelText("42");
    	customEntity.setFistLevel(fistlevel_1);
    	customEntity.setTestGender(Gender_.male);
    	
    	assertTrue(validator.isValid(customEntity, constraintValidatorContext));
    	
    }

}