
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
public class Field35ETest
    extends FieldTest
{


    @BeforeClass
    public void beforeClass() {
        // 6*50x
        setup(FieldComponentsFormat.FORMAT072.getFormat());
    }

    @Test
    public void testParse1() {
        String narrative = "TODO";
        String validateData = "TODO";
        Field35E f = new Field35E(validateData, xmlField);
        org.testng.Assert.assertEquals(f.getNarrative(), narrative);
    }

}
