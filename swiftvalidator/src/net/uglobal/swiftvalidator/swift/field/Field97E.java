
package net.uglobal.swiftvalidator.swift.field;



/**
 * Field format : (qualifier)(internationalBankAccountNumber)
 * 
 * AUTO GENERATED - DO NOT HAND MODIFY
 * Generated on Sun Dec 09 17:22:28 EST 2012
 * 
 */
public class Field97E
    extends net.uglobal.swiftvalidator.swift.field.Field
{


    public Field97E(String validateData, net.uglobal.swiftvalidator.xml.beans.Field xmlField) {
        super(validateData, xmlField);
    }

    @Override
    protected void parse() {
        addComponents(net.uglobal.swiftvalidator.swift.field.FieldComponentParseUtil.parse(validateData, getContentFormat()));
    }

    public String getQualifier() {
        return getComponent1();
    }

    public String getInternationalBankAccountNumber() {
        return getComponent2();
    }

    public String toString() {
        return (new StringBuilder()).append("[" ).append( "qualifier=" + getComponent1()).append( ", internationalBankAccountNumber=" + getComponent2() ).append( "]").toString();
    }

}
