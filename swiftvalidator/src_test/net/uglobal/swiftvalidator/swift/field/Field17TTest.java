
package net.uglobal.swiftvalidator.swift.field;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


/**
 * Field format : (indicator)
 * 
 * TODO: ADD TESTS
 * 
 * Generated on Sat Dec 08 14:19:33 EST 2012
 * 
 */
public class Field17TTest
    extends FieldTest
{


    @BeforeClass
    public void beforeClass() {
        // 1!a
        setup(FieldComponentsFormat.FORMAT098.getFormat());
    }

    @Test
    public void testParse1() {
        String indicator = "Y";
        String validateData = indicator;
        Field17T f = new Field17T(validateData, xmlField);
        org.testng.Assert.assertEquals(f.getIndicator(), indicator);
    }

}
