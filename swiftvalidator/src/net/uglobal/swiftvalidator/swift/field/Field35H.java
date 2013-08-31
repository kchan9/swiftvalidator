
package net.uglobal.swiftvalidator.swift.field;



/**
 * Field format : (sign)(currency)(quantity)
 * 
 * AUTO GENERATED - DO NOT HAND MODIFY
 * Generated on Sun Dec 09 17:22:28 EST 2012
 * 
 */
public class Field35H
    extends net.uglobal.swiftvalidator.swift.field.Field
{


    public Field35H(String validateData, net.uglobal.swiftvalidator.xml.beans.Field xmlField) {
        super(validateData, xmlField);
    }

    @Override
    protected void parse() {
        addComponents(net.uglobal.swiftvalidator.swift.field.FieldComponentParseUtil.parse(validateData, getContentFormat()));
    }

    public String getSign() {
        return getComponent1();
    }

    public String getCurrency() {
        return getComponent2();
    }

    public String getQuantity() {
        return getComponent3();
    }

    public String toString() {
        return (new StringBuilder()).append("[" ).append( "sign=" + getComponent1()).append( ", currency=" + getComponent2()).append( ", quantity=" + getComponent3() ).append( "]").toString();
    }

}
