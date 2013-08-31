
package net.uglobal.swiftvalidator.swift.field;



/**
 * Field format : (reference)
 * 
 * AUTO GENERATED - DO NOT HAND MODIFY
 * Generated on Sun Dec 09 17:22:28 EST 2012
 * 
 */
public class Field21G
    extends net.uglobal.swiftvalidator.swift.field.Field
{


    public Field21G(String validateData, net.uglobal.swiftvalidator.xml.beans.Field xmlField) {
        super(validateData, xmlField);
    }

    @Override
    protected void parse() {
        addComponents(net.uglobal.swiftvalidator.swift.field.FieldComponentParseUtil.parse(validateData, getContentFormat()));
    }

    public String getReference() {
        return getComponent1();
    }

    public String toString() {
        return (new StringBuilder()).append("[" ).append( "reference=" + getComponent1() ).append( "]").toString();
    }

}
