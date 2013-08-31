
package net.uglobal.swiftvalidator.swift.field;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


/**
 * Field format : (chequeNumber)
 * 
 * TODO: ADD TESTS
 * 
 * Generated on Sun Dec 02 09:14:00 EST 2012
 * 
 */
public class Field21DTest
    extends FieldTest
{


    @BeforeClass
    public void beforeClass() {
        // 35x
        setup(FieldComponentsFormat.FORMAT092.getFormat());
    }

    @Test
    public void testParse1() {
        String chequeNumber = "TODO";
        String validateData = "TODO";
        Field21D f = new Field21D(validateData, xmlField);
        org.testng.Assert.assertEquals(f.getChequeNumber(), chequeNumber);
    }

}
