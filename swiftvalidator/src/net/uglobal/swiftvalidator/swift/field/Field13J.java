
package net.uglobal.swiftvalidator.swift.field;



/**
 * Field format : (qualifier)(extendedNumberId)
 * 
 * AUTO GENERATED - DO NOT HAND MODIFY
 * Generated on Sun Dec 09 17:22:28 EST 2012
 * 
 */
public class Field13J
    extends net.uglobal.swiftvalidator.swift.field.Field
{


    public Field13J(String validateData, net.uglobal.swiftvalidator.xml.beans.Field xmlField) {
        super(validateData, xmlField);
    }

    @Override
    protected void parse() {
        addComponents(net.uglobal.swiftvalidator.swift.field.FieldComponentParseUtil.parse(validateData, getContentFormat()));
    }

    public String getQualifier() {
        return getComponent1();
    }

    public String getExtendedNumberId() {
        return getComponent2();
    }

    public String toString() {
        return (new StringBuilder()).append("[" ).append( "qualifier=" + getComponent1()).append( ", extendedNumberId=" + getComponent2() ).append( "]").toString();
    }

}
