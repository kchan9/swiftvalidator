
package net.uglobal.swiftvalidator.swift.field;



/**
 * Field format : (qualifier)(reference)
 * 
 * AUTO GENERATED - DO NOT HAND MODIFY
 * Generated on Sun Dec 09 17:22:28 EST 2012
 * 
 */
public class Field20D
    extends net.uglobal.swiftvalidator.swift.field.Field
{


    public Field20D(String validateData, net.uglobal.swiftvalidator.xml.beans.Field xmlField) {
        super(validateData, xmlField);
    }

    @Override
    protected void parse() {
        addComponents(net.uglobal.swiftvalidator.swift.field.FieldComponentParseUtil.parse(validateData, getContentFormat()));
    }

    public String getQualifier() {
        return getComponent1();
    }

    public String getReference() {
        return getComponent2();
    }

    public String toString() {
        return (new StringBuilder()).append("[" ).append( "qualifier=" + getComponent1()).append( ", reference=" + getComponent2() ).append( "]").toString();
    }

}
