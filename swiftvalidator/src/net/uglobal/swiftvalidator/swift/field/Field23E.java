
package net.uglobal.swiftvalidator.swift.field;



/**
 * Field format : (instructionCode)(additionalInformation)
 * 
 * AUTO GENERATED - DO NOT HAND MODIFY
 * Generated on Sun Dec 09 17:22:28 EST 2012
 * 
 */
public class Field23E
    extends net.uglobal.swiftvalidator.swift.field.Field
{


    public Field23E(String validateData, net.uglobal.swiftvalidator.xml.beans.Field xmlField) {
        super(validateData, xmlField);
    }

    @Override
    protected void parse() {
        addComponents(net.uglobal.swiftvalidator.swift.field.FieldComponentParseUtil.parse(validateData, getContentFormat()));
    }

    public String getInstructionCode() {
        return getComponent1();
    }

    public String getAdditionalInformation() {
        return getComponent2();
    }

    public String toString() {
        return (new StringBuilder()).append("[" ).append( "instructionCode=" + getComponent1()).append( ", additionalInformation=" + getComponent2() ).append( "]").toString();
    }

}
