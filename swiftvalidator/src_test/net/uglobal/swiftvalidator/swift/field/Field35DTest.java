
package net.uglobal.swiftvalidator.swift.field;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


/**
 * Field format : (date)
 * 
 * TODO: ADD TESTS
 * 
 * Generated on Thu Nov 01 13:45:22 EDT 2012
 * 
 */
public class Field35DTest
    extends FieldTest
{


    @BeforeClass
    public void beforeClass() {
        // 6!n
        setup(FieldComponentsFormat.FORMAT060.getFormat());
    }

    @Test
    public void testParse1() {
        String date = "TODO";
        String validateData = "TODO";
        Field35D f = new Field35D(validateData, xmlField);
        org.testng.Assert.assertEquals(f.getDate(), date);
    }

}
