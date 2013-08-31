
package net.uglobal.swiftvalidator.swift.field;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


/**
 * Field format : (type)
 * 
 * TODO: ADD TESTS
 * 
 * Generated on Sun Dec 09 10:24:34 EST 2012
 * 
 */
public class Field23BTest
    extends FieldTest
{


    @BeforeClass
    public void beforeClass() {
        // 4!c
        setup(FieldComponentsFormat.FORMAT096.getFormat());
    }

    @Test
    public void testParse1() {
        String type = "AAAA";
        String validateData = type;
        Field23B f = new Field23B(validateData, xmlField);
        org.testng.Assert.assertEquals(f.getType(), type);
    }

}
