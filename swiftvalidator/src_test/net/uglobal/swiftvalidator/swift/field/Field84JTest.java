
package net.uglobal.swiftvalidator.swift.field;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


/**
 * Field format : (partyIdentification)
 * 
 * TODO: ADD TESTS
 * 
 * Generated on Sat Dec 08 14:19:33 EST 2012
 * 
 */
public class Field84JTest
    extends FieldTest
{


    @BeforeClass
    public void beforeClass() {
        // 5*40x
        setup(FieldComponentsFormat.FORMAT099.getFormat());
    }

    @Test
    public void testParse1() {
        String partyIdentification = "line1" + NEW_LINE + "line2";
        String validateData = partyIdentification;
        Field84J f = new Field84J(validateData, xmlField);
        org.testng.Assert.assertEquals(f.getPartyIdentification(), partyIdentification);
    }

}
