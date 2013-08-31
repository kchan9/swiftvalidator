
package net.uglobal.swiftvalidator.swift.field;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


/**
 * Field format : (location)
 * 
 * TODO: ADD TESTS
 * 
 * Generated on Sun Dec 09 10:24:34 EST 2012
 * 
 */
public class Field29CTest
    extends FieldTest
{


    @BeforeClass
    public void beforeClass() {
        // 35x
        setup(FieldComponentsFormat.FORMAT092.getFormat());
    }

    @Test
    public void testParse1() {
        String location = "Hong Kong";
        String validateData = location;
        Field29C f = new Field29C(validateData, xmlField);
        org.testng.Assert.assertEquals(f.getLocation(), location);
    }

}
