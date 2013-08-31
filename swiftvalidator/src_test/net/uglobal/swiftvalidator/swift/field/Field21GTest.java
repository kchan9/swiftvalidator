
package net.uglobal.swiftvalidator.swift.field;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


/**
 * Field format : (reference)
 * 
 * TODO: ADD TESTS
 * 
 * Generated on Sat Dec 08 14:19:33 EST 2012
 * 
 */
public class Field21GTest
    extends FieldTest
{


    @BeforeClass
    public void beforeClass() {
        // 16x
        setup(FieldComponentsFormat.FORMAT059.getFormat());
    }

    @Test
    public void testParse1() {
        String reference = "1234567890123456";
        String validateData = reference;
        Field21G f = new Field21G(validateData, xmlField);
        org.testng.Assert.assertEquals(f.getReference(), reference);
    }

}
