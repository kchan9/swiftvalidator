
package net.uglobal.swiftvalidator.swift.field;



/**
 * Field format : (method)(additionalInformation)
 * 
 * AUTO GENERATED - DO NOT HAND MODIFY
 * Generated on Sun Dec 09 17:22:28 EST 2012
 * 
 */
public class Field24D
    extends net.uglobal.swiftvalidator.swift.field.Field
{


    public Field24D(String validateData, net.uglobal.swiftvalidator.xml.beans.Field xmlField) {
        super(validateData, xmlField);
    }

    @Override
    protected void parse() {
        addComponents(net.uglobal.swiftvalidator.swift.field.FieldComponentParseUtil.parse(validateData, getContentFormat()));
    }

    public String getMethod() {
        return getComponent1();
    }

    public String getAdditionalInformation() {
        return getComponent2();
    }

    public String toString() {
        return (new StringBuilder()).append("[" ).append( "method=" + getComponent1()).append( ", additionalInformation=" + getComponent2() ).append( "]").toString();
    }

}
