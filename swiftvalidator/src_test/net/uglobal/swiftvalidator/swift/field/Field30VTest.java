
package net.uglobal.swiftvalidator.swift.field;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


/**
 * Field format : (date)
 * 
 * TODO: ADD TESTS
 * 
 * Generated on Sat Dec 08 14:19:33 EST 2012
 * 
 */
public class Field30VTest
    extends FieldTest
{


    @BeforeClass
    public void beforeClass() {
        // 8!n
        setup(FieldComponentsFormat.FORMAT101.getFormat());
    }

    @Test
    public void testParse1() {
        String date = "20120806";
        String validateData = date;
        Field30V f = new Field30V(validateData, xmlField);
        org.testng.Assert.assertEquals(f.getDate(), date);
    }

}
