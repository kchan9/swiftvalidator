
package net.uglobal.swiftvalidator.swift.field;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


/**
 * Field format : (rate)
 * 
 * TODO: ADD TESTS
 * 
 * Generated on Sun Dec 09 10:24:34 EST 2012
 * 
 */
public class Field36ATest
    extends FieldTest
{


    @BeforeClass
    public void beforeClass() {
        // 12d
        setup(FieldComponentsFormat.FORMAT075.getFormat());
    }

    @Test
    public void testParse1() {
        String rate = "20";
        String validateData = rate;
        Field36A f = new Field36A(validateData, xmlField);
        org.testng.Assert.assertEquals(f.getRate(), rate);
    }

}
