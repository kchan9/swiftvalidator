
package net.uglobal.swiftvalidator.swift.field;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


/**
 * Field format : (date)
 * 
 * TODO: ADD TESTS
 * 
 * Generated on Sun Dec 09 10:24:34 EST 2012
 * 
 */
public class Field30PTest
    extends FieldTest
{


    @BeforeClass
    public void beforeClass() {
        // 8!n
        setup(FieldComponentsFormat.FORMAT101.getFormat());
    }

    @Test
    public void testParse1() {
        String date = "20120206";
        String validateData = date;
        Field30P f = new Field30P(validateData, xmlField);
        org.testng.Assert.assertEquals(f.getDate(), date);
    }

}
