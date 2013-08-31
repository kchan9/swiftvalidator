
package net.uglobal.swiftvalidator.swift.field;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


/**
 * Field format : (orderingInstitution)
 * 
 * TODO: ADD TESTS
 * 
 * Generated on Sun Dec 02 09:14:00 EST 2012
 * 
 */
public class Field21RTest
    extends FieldTest
{


    @BeforeClass
    public void beforeClass() {
        // 16x
        setup(FieldComponentsFormat.FORMAT059.getFormat());
    }

    @Test
    public void testParse1() {
        String orderingInstitution = "TODO";
        String validateData = "TODO";
        Field21R f = new Field21R(validateData, xmlField);
        org.testng.Assert.assertEquals(f.getOrderingInstitution(), orderingInstitution);
    }

}
