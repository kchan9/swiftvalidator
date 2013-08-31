
package net.uglobal.swiftvalidator.swift.field;



/**
 * Field format : (type)(quantity)
 * 
 * AUTO GENERATED - DO NOT HAND MODIFY
 * Generated on Sun Dec 09 17:22:28 EST 2012
 * 
 */
public class Field35S
    extends net.uglobal.swiftvalidator.swift.field.Field
{


    public Field35S(String validateData, net.uglobal.swiftvalidator.xml.beans.Field xmlField) {
        super(validateData, xmlField);
    }

    @Override
    protected void parse() {
        addComponents(net.uglobal.swiftvalidator.swift.field.FieldComponentParseUtil.parse(validateData, getContentFormat()));
    }

    public String getType() {
        return getComponent1();
    }

    public String getQuantity() {
        return getComponent2();
    }

    public String toString() {
        return (new StringBuilder()).append("[" ).append( "type=" + getComponent1()).append( ", quantity=" + getComponent2() ).append( "]").toString();
    }

}
