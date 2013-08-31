
package net.uglobal.swiftvalidator.swift.field;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


/**
 * Field format : (account)
 * 
 * TODO: ADD TESTS
 * 
 * Generated on Sun Dec 02 09:14:00 EST 2012
 * 
 */
public class Field25Test
    extends FieldTest
{


    @BeforeClass
    public void beforeClass() {
        // 35x
        setup(FieldComponentsFormat.FORMAT092.getFormat());
    }

    @Test
    public void testParse1() {
        String account = "TODO";
        String validateData = "TODO";
        Field25 f = new Field25(validateData, xmlField);
        org.testng.Assert.assertEquals(f.getAccount(), account);
    }

}
