
package net.uglobal.swiftvalidator.swift.field;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


/**
 * Field format : (narrative)
 * 
 * TODO: ADD TESTS
 * 
 * Generated on Thu Nov 01 13:45:22 EDT 2012
 * 
 */
public class Field35LTest
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
        Field35L f = new Field35L(validateData, xmlField);
        org.testng.Assert.assertEquals(f.getNarrative(), narrative);
    }

}
