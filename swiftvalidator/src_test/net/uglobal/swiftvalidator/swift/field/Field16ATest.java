
package net.uglobal.swiftvalidator.swift.field;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


/**
 * Field format : (number)
 * 
 * TODO: ADD TESTS
 * 
 * Generated on Sat Dec 08 14:19:33 EST 2012
 * 
 */
public class Field16ATest
    extends FieldTest
{


    @BeforeClass
    public void beforeClass() {
        // 5n
        setup(FieldComponentsFormat.FORMAT103.getFormat());
    }

    @Test
    public void testParse1() {
        String number = "12345";
        String validateData = number;
        Field16A f = new Field16A(validateData, xmlField);
        org.testng.Assert.assertEquals(f.getNumber(), number);
    }

}
