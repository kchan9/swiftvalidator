
package net.uglobal.swiftvalidator.swift.field;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


/**
 * Field format : (narrative)
 * 
 * TODO: ADD TESTS
 * 
 * Generated on Sun Dec 02 01:34:52 EST 2012
 * 
 */
public class Field70Test
    extends FieldTest
{


    @BeforeClass
    public void beforeClass() {
        // 4*35x
        setup(FieldComponentsFormat.FORMAT074.getFormat());
    }

    @Test
    public void testParse1() {
        String narrative = "TODO";
        String validateData = "TODO";
        Field70 f = new Field70(validateData, xmlField);
        org.testng.Assert.assertEquals(f.getNarrative(), narrative);
    }

}
