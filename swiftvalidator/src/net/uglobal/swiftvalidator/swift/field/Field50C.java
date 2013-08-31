
package net.uglobal.swiftvalidator.swift.field;



/**
 * Field format : (identifierCode)
 * 
 * AUTO GENERATED - DO NOT HAND MODIFY
 * Generated on Sun Dec 09 17:22:28 EST 2012
 * 
 */
public class Field50C
    extends net.uglobal.swiftvalidator.swift.field.Field
{


    public Field50C(String validateData, net.uglobal.swiftvalidator.xml.beans.Field xmlField) {
        super(validateData, xmlField);
    }

    @Override
    protected void parse() {
        addComponents(net.uglobal.swiftvalidator.swift.field.FieldComponentParseUtil.parse(validateData, getContentFormat()));
    }

    public String getIdentifierCode() {
        return getComponent1();
    }

    public String toString() {
        return (new StringBuilder()).append("[" ).append( "identifierCode=" + getComponent1() ).append( "]").toString();
    }

}
