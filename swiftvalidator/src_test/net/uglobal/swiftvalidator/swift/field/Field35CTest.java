
package net.uglobal.swiftvalidator.swift.field;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


/**
 * Field format : (number)
 * 
 * TODO: ADD TESTS
 * 
 * Generated on Thu Nov 01 13:45:22 EDT 2012
 * 
 */
public class Field35CTest
    extends FieldTest
{


    @BeforeClass
    public void beforeClass() {
        // 3!c
        setup(FieldComponentsFormat.FORMAT071.getFormat());
    }

    @Test
    public void testParse1() {
        String number = "TODO";
        String validateData = "TODO";
        Field35C f = new Field35C(validateData, xmlField);
        org.testng.Assert.assertEquals(f.getNumber(), number);
    }

}
