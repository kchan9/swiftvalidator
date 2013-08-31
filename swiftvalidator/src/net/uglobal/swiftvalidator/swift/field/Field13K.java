
package net.uglobal.swiftvalidator.swift.field;



/**
 * Field format : (qualifier)(numberId)(quantity)
 * 
 * AUTO GENERATED - DO NOT HAND MODIFY
 * Generated on Sun Dec 09 17:22:28 EST 2012
 * 
 */
public class Field13K
    extends net.uglobal.swiftvalidator.swift.field.Field
{


    public Field13K(String validateData, net.uglobal.swiftvalidator.xml.beans.Field xmlField) {
        super(validateData, xmlField);
    }

    @Override
    protected void parse() {
        addComponents(net.uglobal.swiftvalidator.swift.field.FieldComponentParseUtil.parse(validateData, getContentFormat()));
    }

    public String getQualifier() {
        return getComponent1();
    }

    public String getNumberId() {
        return getComponent2();
    }

    public String getQuantity() {
        return getComponent3();
    }

    public String toString() {
        return (new StringBuilder()).append("[" ).append( "qualifier=" + getComponent1()).append( ", numberId=" + getComponent2()).append( ", quantity=" + getComponent3() ).append( "]").toString();
    }

}
