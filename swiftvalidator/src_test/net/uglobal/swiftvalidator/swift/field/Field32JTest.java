
package net.uglobal.swiftvalidator.swift.field;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


/**
 * Field format : (amount)
 * 
 * TODO: ADD TESTS
 * 
 * Generated on Sun Dec 02 09:14:00 EST 2012
 * 
 */
public class Field32JTest
    extends FieldTest
{


    @BeforeClass
    public void beforeClass() {
        // 15d
        setup(FieldComponentsFormat.FORMAT095.getFormat());
    }

    @Test
    public void testParse1() {
        String amount = "TODO";
        String validateData = "TODO";
        Field32J f = new Field32J(validateData, xmlField);
        org.testng.Assert.assertEquals(f.getAmount(), amount);
    }

}
