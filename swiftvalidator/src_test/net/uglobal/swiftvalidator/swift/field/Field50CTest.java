
package net.uglobal.swiftvalidator.swift.field;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


/**
 * Field format : (identifierCode)
 * 
 * TODO: ADD TESTS
 * 
 * Generated on Sun Dec 02 09:14:00 EST 2012
 * 
 */
public class Field50CTest
    extends FieldTest
{


    @BeforeClass
    public void beforeClass() {
        // 4!a2!a2!c[3!c]
        setup(FieldComponentsFormat.FORMAT093.getFormat());
    }

    @Test
    public void testParse1() {
        String identifierCode = "TODO";
        String validateData = "TODO";
        Field50C f = new Field50C(validateData, xmlField);
        org.testng.Assert.assertEquals(f.getIdentifierCode(), identifierCode);
    }

}
