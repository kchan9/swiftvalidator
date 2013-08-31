
package net.uglobal.swiftvalidator.swift.field;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


/**
 * Field format : (chequeReferenceNumber)
 * 
 * TODO: ADD TESTS
 * 
 * Generated on Sun Dec 02 09:14:00 EST 2012
 * 
 */
public class Field21ETest
    extends FieldTest
{


    @BeforeClass
    public void beforeClass() {
        // 35x
        setup(FieldComponentsFormat.FORMAT092.getFormat());
    }

    @Test
    public void testParse1() {
        String chequeReferenceNumber = "TODO";
        String validateData = "TODO";
        Field21E f = new Field21E(validateData, xmlField);
        org.testng.Assert.assertEquals(f.getChequeReferenceNumber(), chequeReferenceNumber);
    }

}
