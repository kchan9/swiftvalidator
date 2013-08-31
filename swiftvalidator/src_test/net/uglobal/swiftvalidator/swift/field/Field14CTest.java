
package net.uglobal.swiftvalidator.swift.field;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


/**
 * Field format : (year)
 * 
 * TODO: ADD TESTS
 * 
 * Generated on Sat Dec 08 14:19:33 EST 2012
 * 
 */
public class Field14CTest
    extends FieldTest
{


    @BeforeClass
    public void beforeClass() {
        // 4!c
        setup(FieldComponentsFormat.FORMAT096.getFormat());
    }

    @Test
    public void testParse1() {
        String year = "2012";
        String validateData = year;
        Field14C f = new Field14C(validateData, xmlField);
        org.testng.Assert.assertEquals(f.getYear(), year);
    }

}
