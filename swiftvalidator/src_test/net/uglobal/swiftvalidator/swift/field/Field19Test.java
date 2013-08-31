
package net.uglobal.swiftvalidator.swift.field;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


/**
 * Field format : (amount)
 * 
 * TODO: ADD TESTS
 * 
 * Generated on Thu Nov 01 13:45:22 EDT 2012
 * 
 */
public class Field19Test
    extends FieldTest
{


    @BeforeClass
    public void beforeClass() {
        // 17d
        setup(FieldComponentsFormat.FORMAT066.getFormat());
    }

    @Test
    public void testParse1() {
        String amount = "TODO";
        String validateData = "TODO";
        Field19 f = new Field19(validateData, xmlField);
        org.testng.Assert.assertEquals(f.getAmount(), amount);
    }

}
