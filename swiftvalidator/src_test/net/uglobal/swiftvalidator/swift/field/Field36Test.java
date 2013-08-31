
package net.uglobal.swiftvalidator.swift.field;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


/**
 * Field format : (rate)
 * 
 * TODO: ADD TESTS
 * 
 * Generated on Thu Nov 01 13:45:22 EDT 2012
 * 
 */
public class Field36Test
    extends FieldTest
{


    @BeforeClass
    public void beforeClass() {
        // 12d
        setup(FieldComponentsFormat.FORMAT075.getFormat());
    }

    @Test
    public void testParse1() {
        String rate = "TODO";
        String validateData = "TODO";
        Field36 f = new Field36(validateData, xmlField);
        org.testng.Assert.assertEquals(f.getRate(), rate);
    }

}
