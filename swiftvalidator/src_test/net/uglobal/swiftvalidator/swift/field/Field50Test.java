
package net.uglobal.swiftvalidator.swift.field;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


/**
 * Field format : (nameAndAddress)
 * 
 * TODO: ADD TESTS
 * 
 * Generated on Sun Dec 02 09:14:00 EST 2012
 * 
 */
public class Field50Test
    extends FieldTest
{


    @BeforeClass
    public void beforeClass() {
        // 4*35x
        setup(FieldComponentsFormat.FORMAT074.getFormat());
    }

    @Test
    public void testParse1() {
        String nameAndAddress = "TODO";
        String validateData = "TODO";
        Field50 f = new Field50(validateData, xmlField);
        org.testng.Assert.assertEquals(f.getNameAndAddress(), nameAndAddress);
    }

}
