
package net.uglobal.swiftvalidator.swift.field;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


/**
 * Field format : (scope)
 * 
 * TODO: ADD TESTS
 * 
 * Generated on Sat Dec 08 14:19:33 EST 2012
 * 
 */
public class Field94ATest
    extends FieldTest
{


    @BeforeClass
    public void beforeClass() {
        // 4!c
        setup(FieldComponentsFormat.FORMAT096.getFormat());
    }

    @Test
    public void testParse1() {
        String scope = "aaaa";
        String validateData = scope;
        Field94A f = new Field94A(validateData, xmlField);
        org.testng.Assert.assertEquals(f.getScope(), scope);
    }

}
