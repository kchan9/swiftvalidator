
package net.uglobal.swiftvalidator.swift.field;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


/**
 * Field format : (reference)
 * 
 * TODO: ADD TESTS
 * 
 * Generated on Sun Dec 09 10:24:34 EST 2012
 * 
 */
public class Field21ATest
    extends FieldTest
{


    @BeforeClass
    public void beforeClass() {
        // 16x
        setup(FieldComponentsFormat.FORMAT059.getFormat());
    }

    @Test
    public void testParse1() {
        String reference = "123456789";
        String validateData = reference;
        Field21A f = new Field21A(validateData, xmlField);
        org.testng.Assert.assertEquals(f.getReference(), reference);
    }

}
