/*
* Copyright (c): it@M - Dienstleister fuer Informations- und Telekommunikationstechnik
* der Landeshauptstadt Muenchen, 2018
*/
package de.muenchen.testproject.commons.domain;

import org.junit.Test;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import static org.junit.Assert.assertEquals;


/*
 * This file will NOT be overwritten by Barrakuda.
 * This file was automatically generated by Barrakuda.
 */
public class ObjectToStringBridgeTest {

    private enum TestEnum {
        THE_TEST_ENUM
    }

    private final ObjectToStringBridge objectToStringBridge = new ObjectToStringBridge();

    /**
     * The method is testing all barrakuda datatypes.
     */
    @Test
    public void objectToString() {

        final LocalDate localDate = LocalDate.of(2018,10,18);
        assertEquals("2018-10-18", objectToStringBridge.objectToString(localDate));

        final LocalTime locaTime = LocalTime.of(23,45,46);
        assertEquals("23:45:46", objectToStringBridge.objectToString(locaTime));

        final LocalDateTime locaDateTime = LocalDateTime.of(2018,10,28,23,46,50);
        assertEquals("2018-10-28T23:46:50", objectToStringBridge.objectToString(locaDateTime));

        assertEquals("THE_TEST_ENUM", objectToStringBridge.objectToString(TestEnum.THE_TEST_ENUM));

        assertEquals("999999999", objectToStringBridge.objectToString(new Long(999999999)));

        assertEquals("9.999999999999989341858963598497211933135986328125", objectToStringBridge.objectToString(new BigDecimal(9.99999999999999)));

        assertEquals("-11111", objectToStringBridge.objectToString(new Integer(-11111)));

        assertEquals("test", objectToStringBridge.objectToString("test"));

        assertEquals("true", objectToStringBridge.objectToString(new Boolean("true")));

    }

}
