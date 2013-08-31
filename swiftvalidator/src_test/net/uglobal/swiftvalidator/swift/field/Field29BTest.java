
package net.uglobal.swiftvalidator.swift.field;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


/**
 * Field format : (narrative)
 * 
 * TODO: ADD TESTS
 * 
 * Generated on Fri Nov 02 08:32:27 EDT 2012
 * 
 */
public class Field29BTest
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
        Field29B f = new Field29B(validateData, xmlField);
        org.testng.Assert.assertEquals(f.getNarrative(), narrative);
    }

}
