
package net.uglobal.swiftvalidator.swift.field;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


/**
 * Field format : (type)
 * 
 * TODO: ADD TESTS
 * 
 * Generated on Sat Dec 08 14:19:33 EST 2012
 * 
 */
public class Field22ATest
    extends FieldTest
{


    @BeforeClass
    public void beforeClass() {
        // 4!c
        setup(FieldComponentsFormat.FORMAT096.getFormat());
    }

    @Test
    public void testParse1() {
        String type = "aaaa";
        String validateData = type;
        Field22A f = new Field22A(validateData, xmlField);
        org.testng.Assert.assertEquals(f.getType(), type);
    }

}
