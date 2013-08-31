
package net.uglobal.swiftvalidator.swift.field;



/**
 * Field format : (qualifier)(quantity1)(quantity2)
 * 
 * AUTO GENERATED - DO NOT HAND MODIFY
 * Generated on Sun Dec 09 17:22:28 EST 2012
 * 
 */
public class Field92D
    extends net.uglobal.swiftvalidator.swift.field.Field
{


    public Field92D(String validateData, net.uglobal.swiftvalidator.xml.beans.Field xmlField) {
        super(validateData, xmlField);
    }

    @Override
    protected void parse() {
        addComponents(net.uglobal.swiftvalidator.swift.field.FieldComponentParseUtil.parse(validateData, getContentFormat()));
    }

    public String getQualifier() {
        return getComponent1();
    }

    public String getQuantity1() {
        return getComponent2();
    }

    public String getQuantity2() {
        return getComponent3();
    }

    public String toString() {
        return (new StringBuilder()).append("[" ).append( "qualifier=" + getComponent1()).append( ", quantity1=" + getComponent2()).append( ", quantity2=" + getComponent3() ).append( "]").toString();
    }

}
