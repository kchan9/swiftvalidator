
package net.uglobal.swiftvalidator.swift.field;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


/**
 * Field format : (transactionReferenceNumber)
 * 
 * TODO: ADD TESTS
 * 
 * Generated on Sun Dec 02 09:14:00 EST 2012
 * 
 */
public class Field44ATest
    extends FieldTest
{


    @BeforeClass
    public void beforeClass() {
        // 65x
        setup(FieldComponentsFormat.FORMAT094.getFormat());
    }

    @Test
    public void testParse1() {
        String transactionReferenceNumber = "TODO";
        String validateData = "TODO";
        Field44A f = new Field44A(validateData, xmlField);
        org.testng.Assert.assertEquals(f.getTransactionReferenceNumber(), transactionReferenceNumber);
    }

}
